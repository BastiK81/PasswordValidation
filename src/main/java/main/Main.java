package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean validPassword = false;
        while (!validPassword) {
            System.out.println("Please type new Password, min 8, max 20, lower and upper case and min one number");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            Password password = new Password(input);
            if (password.isPasswordInInvalidList()) {
                System.out.println("Password is in Blacklist");
                continue;
            }
            validPassword =    password.hasLowerCase() &&
                                password.hasUpperCase() &&
                                password.hasNumbers() &&
                                password.hasPasswordMinLength() &&
                                password.isPasswordInMaxLength();
        }
        System.out.println("Password accepted");
    }

}
