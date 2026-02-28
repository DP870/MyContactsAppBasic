package com.contacts;
// This class is for contacts that the user will save.
public class contacts {

    private String name;
    private String phone;
    private String email;

    public contacts( String name, String phone, String email) {
       
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
