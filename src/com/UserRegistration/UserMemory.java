package com.UserRegistration;

import java.util.HashMap;
import java.util.Map;
public class UserMemory {
  
    private final Map<String, RegisteredUser> users = new HashMap<>();
    public boolean exists(String username) {
        return users.containsKey(username);
    }
    public void save(RegisteredUser user) {
        users.put(user.getUsername(), user);
    }

    public RegisteredUser find(String username) {
        return users.get(username);
    }

    public int size() {
        return users.size();
    }
}