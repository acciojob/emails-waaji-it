package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword==password){
            if(newPassword.length()<8)
                return;
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean digit = false;
            boolean specialChar = false;
            for(int i=0 ; i<newPassword.length();i++){
                if(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z'){
                    upperCase = true;
                }
                if(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z'){
                    lowerCase = true;
                }
                if(newPassword.charAt(i)>='0' && newPassword.charAt(i)<='9')
                    digit = true;
                if(!(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z') && !(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z') && !(newPassword.charAt(i)>='0' && newPassword.charAt(i)<='9'))
                    specialChar = true;
            }
            if(!upperCase) return;
            if(!lowerCase) return;
            if(!digit) return;
            if(!specialChar) return;
            this.password = newPassword;
        }
    }

}
