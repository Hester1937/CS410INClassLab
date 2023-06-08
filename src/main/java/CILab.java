public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if (myString == null || myString.isEmpty()) {
            return false;
        }

        boolean allUpperCase = true;
        boolean allLowerCase = true;

        for (char c : myString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                allLowerCase = false;
            } else if (Character.isLowerCase(c)) {
                allUpperCase = false;
            }
        }

        return allUpperCase || allLowerCase;
    }
}

