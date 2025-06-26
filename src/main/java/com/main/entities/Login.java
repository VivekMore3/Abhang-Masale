package com.main.entities;

public class Login {
 String phoneNumber;
 String password;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String phoneNumber, String password) {
	super();
	this.phoneNumber = phoneNumber;
	this.password = password;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Login [phoneNumber=" + phoneNumber + ", password=" + password + "]";
}
 
    
 
}
