package com.contacts;
// This class is for contacts that the user will save.
public class contacts {

    private String name;
    private String phone;
    private String email;
    private String tag;

    public contacts( String name, String phone, String email,String tag) {
       
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.tag=tag;
    }

	

	public String getTag() {
		return tag;
	}



	public void setTag(String tag) {
		this.tag = tag;
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

	public String toString() {
    return name + " - " + phone + email + (tag == null ? "" : (" | " + tag));
}

}
