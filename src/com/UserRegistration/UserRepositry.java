package com.UserRegistration;
// HashMap to store the user data.
import java.util.HashMap;
public class UserRepositry {
	static HashMap<String, String> hm1 = new HashMap<>();
	public static void createrepo(String Username,String Password) {
		hm1.put(Username,Password);
		hm1.forEach((key, value) -> System.out.println(key + ": " + value));
	
		return;
	}
	public static boolean check(String Username,String Password) {
			String matchpassword=hm1.get(Username);
			if (matchpassword.equals(Password)) {
				System.out.print("Login Successful");
				return true;
			}
			else {
				System.out.println("Login Unsuccessfull! Try Again");
				return false;
			}
		
	}
}