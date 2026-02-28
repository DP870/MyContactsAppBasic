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
		Scanner sc = new Scanner(System.in); 
		int loop=1;
		UserMemory usermemory=new UserMemory();  
		while (loop==1) {
			System.out.println("My Contacts App");
			System.out.println("1. User Registration");
			System.out.println("2. User Login");   //User Login to be implemented in this update.
			System.out.println("0. Exit");

			int choice= sc.nextInt();
			if (choice==1) {
				System.out.println("Enter username");
				String Username = sc.next();

				System.out.println("Enter password: ");
				String Password = sc.next();

				System.out.println("Confirm password: ");
				String confirmPassword = sc.next(); 

				boolean match=confirmPassword.equals(Password);
				if (match) {  //Checks if the password matches and if the password is validated using the PasswordValidator Class.
					if (PasswordValidator.isValid(Password)) {
						
						RegisteredUser user = new RegisteredUser(Username,Password); // Creates the New User 
						
						usermemory.save(user);     //Saves details in HashMap
						
						
						System.out.println("Account Created Successfully");
						
					}
					else {
						System.out.println("Password does not meet the required criteria.");
					}
				}
				else {
					System.out.println("Password does not match. Please try again! ");
				}
			System.out.println("Do you want to exit ?");
			loop=sc.nextInt();
			}


		else if (choice==2) {

			System.out.println("Enter username");
			String Username = sc.next();

			System.out.println("Enter password: ");
			String Password = sc.next();

			RegisteredUser user = usermemory.find(Username);
			Authentication auth = new BasicAuth(user,usermemory);
			auth.login(Username, Password);
			System.out.println("Do you want to exit ?(0/1)");
			loop=sc.nextInt();
			
		}

	}
	}
}