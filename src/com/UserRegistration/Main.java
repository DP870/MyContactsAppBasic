/*
 * My Contacts App Using Basic OOPS Concepts
 * UC3 - This use case deals with user profile management and the creation of change password class.
 * 
 * 
 * author Dhruv
 * version 3.0
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
			
			//MENU 
			System.out.println("My Contacts App");
			System.out.println("1. User Registration");
			System.out.println("2. User Login");   
			//User Login to be implemented in this update.
			System.out.println("3. Profile Management"); 
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

			// USER LOGIN
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
			
			// PROFILE MANAGEMENT 
			
		else if (choice==3) {
			
			System.out.println("Enter username");
			String Username = sc.next();

			System.out.println("Enter password: ");
			String Password = sc.next();

			RegisteredUser user = usermemory.find(Username);
			Authentication auth = new BasicAuth(user,usermemory);
			
			if (auth.login(Username, Password)) {
				System.out.println("Enter new password: ");
				String newpass = sc.next();

				System.out.println("Confirm new password: ");
				String confirmnewpass = sc.next(); 
				
				ChangePassword change=new ChangePassword(user,usermemory);
				change.ChangePassword(Username, Password, newpass, confirmnewpass, user);
			}
			
			
		}

	}
	}
}