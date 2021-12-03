package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvalidPasswordsTest {

    @Test
    void getInvalidPasswords() {
        assertEquals("Start123", InvalidPasswords.getInvalidPasswords().get(1));
    }
}