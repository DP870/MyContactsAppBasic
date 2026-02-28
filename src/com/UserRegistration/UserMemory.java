package com.UserRegistration;

//Stores user data as Username ----> [Registered User details] 
// [Registered User details] is encapsulated and can only be accessed using getters and setters.


import java.util.HashMap;
import java.util.Map;
public class UserMemory {
	//DEFINING HASHMAP
    private final Map<String, RegisteredUser> users = new HashMap<>();
    
    //CHECKS IF USERNAME EXISTS
    public boolean exists(String username) {
        return users.containsKey(username);
    }
    
    //SAVE USER DETAILS
    public void save(RegisteredUser user) {
        users.put(user.getUsername(), user);
    }
    
    //FIND USER
    public RegisteredUser find(String username) {
        return users.get(username);  //Returns the RegisteredUser details [Registered User details] 
    }
    
    //Update Password
    public boolean update(String username,String newpass,RegisteredUser user) {

    	RegisteredUser existing = users.get(username);
        if (existing == null) {   //CHECKS IF USERNAME EXISTS
        	return false; 
        }

        if (!PasswordValidator.isValid(newpass)) {  //Validates the new password
        	return false;
        }

        existing.setPassword(newpass);    //Updates the new password using setters and the value is automatically updated in the hashmap
        return true;

    }
    
    public int size() {
        return users.size();
    }
}