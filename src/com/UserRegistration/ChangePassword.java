// PART OF THE NEXT UPDATE.

package com.UserRegistration;

public class ChangePassword {
	
	private final RegisteredUser registeredUser;
	private UserMemory memory;
	
	public ChangePassword(RegisteredUser user, UserMemory usermemory) {
		this.registeredUser=user;
		this.memory=usermemory;		
	}


	public void ChangePassword(String username,String oldpass,String newpass,String confirmpass,RegisteredUser curruser) {
		if (oldpass.equals(newpass)) {
			System.out.println("New Password is same as Old Password.");
			return;
		}
		else if (!newpass.equals(confirmpass)) {
			System.out.println("Passwords do not match. Please try again !");
			return;
		}
		else {
			if (memory.update(username,newpass,curruser)) {
			System.out.println("Password Updated");
			return;
			}
			
			else {System.out.println("Username does not exist or Password does not meet security criteria.");
			return;}
		}
		
	}
}
