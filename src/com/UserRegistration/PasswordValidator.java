package com.UserRegistration;
// Uses Regex to check if password meets all the required criteria 
public class PasswordValidator {
		private static final String PASSWORD_PATTERN =
	            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

	    public static boolean isValid(String password) {
	        return password.matches(PASSWORD_PATTERN);
	    }
	}

