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


// Editing a contact
public boolean edit(String username,String name,contacts updated) {      // Name is the contact to be edited.
	List <contacts> listofcontacts=savedcontacts.get(username);
	if (listofcontacts == null || name == null) {
    	return false;
    }
	
	for (int i = 0; i < listofcontacts.size(); i++) {
        contacts c = listofcontacts.get(i);
        if (c.getName().equals(name)) {
            listofcontacts.remove(i);     
            listofcontacts.add(updated);
            return true;        
        }
       
}
	return false;
	}

//Bulk Operations
public boolean bulk(String username) {
     
     List<contacts> listofcontacts = savedcontacts.get(username);
     if (listofcontacts == null) {
     	return false;
     }
     List<contacts> newlist = new ArrayList<>();
     savedcontacts.put(username, newlist);     
     return true;        
         
     
    
 }
//Search Operation
public void search(String username,String name) {
	 List<contacts> listofcontacts = savedcontacts.get(username);
     
	 if (listofcontacts == null) {
     	System.out.println("No Contacts");
     }
	 
	 for (int i = 0; i < listofcontacts.size(); i++) {
	        contacts c = listofcontacts.get(i);
	        if (c.getName().equals(name)) {
	            System.out.println(c);        
	        }
	 
        
}
}
// Filter
public void filter(String username,String fil) {
	 List<contacts> listofcontacts = savedcontacts.get(username);
    
	 if (listofcontacts == null) {
    	System.out.println("No Contacts");
    }
	 
	 for (int i = 0; i < listofcontacts.size(); i++) {
	        contacts c = listofcontacts.get(i);
	        if (c.getTag().contains(fil)) {
	            System.out.println(c);        
	        }
	 
       
}
}

// Updating Tags
public void filter(String username,String name,String newTag) {
	 List<contacts> listofcontacts = savedcontacts.get(username);
 
	 if (listofcontacts == null) {
 	System.out.println("No Contacts");
 }
	 
	 for (int i = 0; i < listofcontacts.size(); i++) {
	        contacts c = listofcontacts.get(i);
	        if (c.getName().equals(name)) {
	        	c.setTag(newTag);    
	        	System.out.println("Tag Updated");
	        }
	 
    
}
}





}
