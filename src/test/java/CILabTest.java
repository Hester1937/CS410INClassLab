import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("HELLO1");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("hello2");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Hello3");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("HeLLo4");
        assertFalse(myString.detectCapitalUse());
    }

}
