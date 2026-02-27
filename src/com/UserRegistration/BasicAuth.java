package com.UserRegistration;
// Started implementation of BasicAuth
public class BasicAuth implements Authentication {

    private RegisteredUser registeredUser;

    public BasicAuth(RegisteredUser user) {
        this.registeredUser = user;
    }

    @Override   //Method Overriding 
    public boolean login(String username, String password) {
        if (!registeredUser.getUsername().equals(username)) {
            System.out.println("Invalid username!");
            return false;
        }
        if (!PasswordValidator.isValid(password)) {
            System.out.println("Password does not meet security criteria!");
            return false;
        }
        if (!registeredUser.getPassword().equals(password)) {
            System.out.println("Incorrect password!");
            return false;
        }
        System.out.println("Login successful!");
        return true;
    }
}