package main;

import java.util.List;

public class Password {

    private final String newPassword;

    public Password(String password) {
        this.newPassword = password;
    }

    public boolean hasPasswordMinLength() {
        return this.newPassword.length() >= Settings.MIN_PASSWORD_LENGTH;
    }

    public boolean isPasswordInMaxLength() {
        return this.newPassword.length() <= Settings.MAX_PASSWORD_LENGTH;
    }

    public boolean hasNumbers() {
        for(int i = 0; i < this.newPassword.length(); i++) {
            if(String.valueOf(this.newPassword.charAt(i)).matches("\\d")) {
                return true;
            }
        }
        return false;
    }

    public boolean hasUpperCase() {
        for(int i = 0; i < this.newPassword.length(); i++) {
            if(Character.isUpperCase(this.newPassword.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLowerCase() {
        for(int i = 0; i < this.newPassword.length(); i++) {
            if(Character.isLowerCase(this.newPassword.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPasswordInInvalidList() {
        List<String> invalidPasswords = InvalidPasswords.getInvalidPasswords();
        return invalidPasswords.contains(this.newPassword);
    }
}
