package com.UserRegistration;
// Started implementation of BasicAuth
public class BasicAuth implements Authentication {

    private final RegisteredUser registeredUser;
    private final UserMemory memory;
    
    //CONSTRUCTOR INJECTION
    // THIS IS DONE TO MAKE SURE THE SAME HASHMAP IS USED AND A NEW ONE IS NOT CREATED.
    // this. makes it clear to the class and other methods where to get the data for the registered user and memory from.
    public BasicAuth(RegisteredUser user,UserMemory usermemory) { 
        this.registeredUser = user;
        this.memory=usermemory;
    }

   @Override   //Method Overriding 
    
   public boolean login(String username, String password) {
	   
    if (!registeredUser.getUsername().equals(username)) {
          System.out.println("Invalid username!");
         return false;
    }
    if (!registeredUser.getPassword().equals(password)) {
        System.out.println("Incorrect password!");
       return false;
    }
    if (memory.exists(username)){
    	System.out.println("Login successful!");
     return true;
    }
    return false;
}
}
    

