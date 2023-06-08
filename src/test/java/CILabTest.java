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

    public void detectCapitalUseTest1() {
        assertTrue(myString.detectCapitalUse("HELLO1"));
    }

    @Test
    public void detectCapitalUseTest2() {
        assertTrue(myString.detectCapitalUse("hello2"));
    }

    @Test
    public void detectCapitalUseTest3() {
        assertFalse(myString.detectCapitalUse("Hello3"));
    }

    @Test
    public void detectCapitalUseTest4() {
        assertFalse(myString.detectCapitalUse("HeLLo4"));
    }

}
