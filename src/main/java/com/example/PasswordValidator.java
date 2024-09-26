package com.example;

public class PasswordValidator {

    /*
    // Task 2: Implementing TDD for a New Feature
    public class PasswordValidator {

        public boolean isValidPassword(String password) {
            if (password == null || password.length() < 8) {
                return false;
            }
            boolean hasUppercase = !password.equals(password.toLowerCase());
            return hasUppercase;
        }
    }
    */

    //Task 3: Using Mocks in Unit Tests

    

    private NotificationService notificationService;

    public PasswordValidator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUppercase = !password.equals(password.toLowerCase());
        if (hasUppercase) {
            notificationService.sendNotification("Password is valid");
        }
        return hasUppercase;
    }

    
}