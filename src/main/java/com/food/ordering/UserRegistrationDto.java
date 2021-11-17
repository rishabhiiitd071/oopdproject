package com.food.ordering;

public class UserRegistrationDto {
	private String username;
	private int phonenumber;
	private String address;
	private String password;
	private String emailid;

	public UserRegistrationDto() {

	}

	public UserRegistrationDto(String username, int phonenumber, String address, String password, String emailid) {
		super();
		this.username = username;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
		this.emailid = emailid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
