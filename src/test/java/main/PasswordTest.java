package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void testMinPasswordLengthTrue() {
        Password password = new Password("RandomPa");
        assertTrue(password.hasPasswordMinLength());
    }

    @Test
    void testMinPasswordLengthFalse() {
        Password password = new Password("Random");
        assertFalse(password.hasPasswordMinLength());
    }

    @Test
    void testMaxPasswordLengthTrue() {
        Password password = new Password("RandomPassword");
        assertTrue(password.isPasswordInMaxLength());
    }

    @Test
    void testMaxPasswordLengthFalse() {
        Password password = new Password("RandomPasswordWhichIsVeryLong");
        assertFalse(password.isPasswordInMaxLength());
    }

    @Test
    void testPasswordHasNumbers() {
        Password password = new Password("Random312");
        assertTrue(password.hasNumbers());
    }

    @Test
    void testPasswordHasNoNumbers() {
        Password password = new Password("Randomasd");
        assertFalse(password.hasNumbers());
    }

    @Test
    void testPasswordHasLowerCaseLetters(){
        Password password = new Password("Randomasd");
        assertTrue(password.hasLowerCase());
    }

    @Test
    void testPasswordHasNoLowerCaseLetters(){
        Password password = new Password("RANDOMPASSWORD");
        assertFalse(password.hasLowerCase());
    }

    @Test
    void testPasswordHasUpperCaseLetters(){
        Password password = new Password("Randomasd");
        assertTrue(password.hasUpperCase());
    }

    @Test
    void testPasswordHasNoUpperCaseLetters(){
        Password password = new Password("randomasd");
        assertFalse(password.hasUpperCase());
    }

    @Test
    void testIsPasswordInInvalidList() {
        Password password = new Password("12345678");
        assertTrue(password.isPasswordInInvalidList());
    }

    @Test
    void testIsPasswordNotInInvalidList() {
        Password password = new Password("12asd345678");
        assertFalse(password.isPasswordInInvalidList());
    }

}