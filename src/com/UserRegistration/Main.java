/*
 * My Contacts App Using Basic OOPS Concepts
 * UC2 - This use case deals with user authentication and validates the user details with the password.
 * The user data is stored in a hash map.
 * 
 * author Dhruv
 * version 2.0
 * 
 */

package com.UserRegistration;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in); 
    	int loop=1;
    	
    	while (loop==1) {
    	System.out.println("My Contacts App");
    	System.out.println("1. User Registration");
    	System.out.println("2. User Login");   //User Login to be implemented in the next update.
    	System.out.println("3. Exit");
    	
    	int choice= scanner.nextInt();
    	if (choice==1) {
    		System.out.println("Enter username");
    	    String Username = scanner.next();
    	    
    	    System.out.println("Enter password: ");
            String Password = scanner.next();
            
            System.out.println("Confirm password: ");
            String confirmPassword = scanner.next(); 
            
            boolean match=confirmPassword.equals(Password);
            if (match) {  //Checks if the password matches and if the password is validated using the PasswordValidator Class.
            	if (PasswordValidator.isValid(Password)) {
            	UserRepositry.createrepo(Username,Password);
            	RegisteredUser user = new RegisteredUser(Username,Password);
            	Authentication auth = new BasicAuth(user);
            	System.out.println("Account Created Successfully");
            	}
            	else {
            		System.out.println("Password does not meet the required criteria.");
            	}
            }
            else {
            	System.out.println("Password does not match. Please try again! ");
            }
    	}
    	}
    	
    	else if (choice==2) {
    		
    		System.out.println("Enter username");
    	    String Username = scanner.next();
    	    
    	    System.out.println("Enter password: ");
            String Password = scanner.next();
            
            RegisteredUser user = new RegisteredUser(Username,Password);
            UserRepositry.check(Username,Password);
            
            
             		
    		
    	}
    	
    }
}