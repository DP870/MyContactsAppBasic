package com.contacts;
import java.util.*;
public class contactsmap {
	//HashMap: username -> [list of contacts]
	private HashMap<String, List<contacts>> savedcontacts = new HashMap<>();

	public void add(String username, contacts contact) {
	        List<contacts> contacts = savedcontacts.get(username);
	        if (contacts == null) {
	            contacts = new ArrayList<>();
	            savedcontacts.put(username, contacts);
	            }
	        contacts.add(contact);
	       
	    }
	
	//returns list of contacts
	public List<contacts> viewcontacts(String username) {
	    List<contacts> listofcontacts = savedcontacts.get(username);
	    return listofcontacts; 
	}
// Deleting a Contact
public boolean delete(String username, String name) {
        
        List<contacts> listofcontacts = savedcontacts.get(username);
        if (listofcontacts == null || name == null) {
        	return false;
        }

        for (int i = 0; i < listofcontacts.size(); i++) {
            contacts c = listofcontacts.get(i);
            if (c.getName().equals(name)) {
                listofcontacts.remove(i);     
                return true;        
            }
        }
        return false; 
    }

	
	
	}
