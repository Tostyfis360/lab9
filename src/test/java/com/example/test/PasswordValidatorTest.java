package com.example.test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import com.example.NotificationService;
import com.example.PasswordValidator;

public class PasswordValidatorTest {

    /*
    // Test of Task 2: Implementing TDD for a New Feature
    @Test
    public void testPasswordValidator() {
        PasswordValidator validator = new PasswordValidator();
        assertFalse(validator.isValidPassword("short"));
        assertFalse(validator.isValidPassword("nouppercase8"));
        assertTrue(validator.isValidPassword("ValidPass8"));
        assertFalse(validator.isValidPassword(null));
        assertTrue(validator.isValidPassword("VALIDPASS"));
    }
     */

    //Task 3: Using Mocks in Unit Tests

    

    @Test
    public void testPasswordValidator() {
        NotificationService mockService = mock(NotificationService.class);
        PasswordValidator validator = new PasswordValidator(mockService);

        assertFalse(validator.isValidPassword("short"));
        assertFalse(validator.isValidPassword("nouppercase8"));
        assertTrue(validator.isValidPassword("ValidPass8"));

        verify(mockService, times(1)).sendNotification("Password is valid");
    }

    
}