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

  /*      boolean allUpperCase = true;
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

    */ 

       // count number of capital letters in string & add to char array
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            char[] c = myString.toCharArray();
            if (Character.isUpperCase(myString.charAt(i))) {
                count++;
            }
        }

        // count = 0 --> all lower ; count = myString.length() --> all upper
        return (count == 0 || count == myString.length() || count == 1 && Character.isUpperCase(myString.charAt(0)));
    }
}

