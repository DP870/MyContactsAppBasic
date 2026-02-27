package com.UserRegistration;
// HashMap to store the user data.
import java.util.HashMap;
public class UserRepositry {
	public static void createrepo(String Username,String Password) {
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put(Username,Password);
		return;
	}
}
