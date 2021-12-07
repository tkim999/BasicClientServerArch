package CommandProcessor;

import java.util.ArrayList;

public class CommandProcessor {
    
    public CommandProcessor() {

    }

    public boolean resetGUI() {
        return true;
    }

    public boolean messageUser(String message) {
        //popup display with message on it
        return true;
    }

    public boolean checkEmailFormat(String email) {
        //is email format valid? If yes return true, if not then return false;
        boolean validEmailFormat = false;
        if(email.contains("@")){ //all of the requirements of email format
            validEmailFormat = true;
        }
        return validEmailFormat;
    }

    public boolean checkPasswordContents(String password) {
        boolean validPasswordContents = true;
        ArrayList<String> blockList = new ArrayList<String>(); //if we have words that we do not want to be part of a password, we can put it into here as a String
        if (password.contains("\\")){//what a password cannot have in it
            validPasswordContents = false;
            System.out.println("contains \" \\ \"");
        } else if (validPasswordContents) {
            for (int i = 0; i < blockList.size(); i++) {
                if (password.contains(blockList.get(i))) {
                    validPasswordContents = false;
                }
            }
        }
        return validPasswordContents;
    }

    public boolean checkPasswordLength(String password) { //check if password is long enough
        boolean validPasswordLength = false;
        if (8 <= password.length() && password.length() <= 32) {//password length for now is between 8 to 32 char long
            validPasswordLength = true;
        }
        return validPasswordLength;
    }
}
