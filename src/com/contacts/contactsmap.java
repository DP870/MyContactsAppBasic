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
	
	}
