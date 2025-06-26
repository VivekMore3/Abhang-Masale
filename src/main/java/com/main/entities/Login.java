package com.main.entities;

public class Login {
 Integer phoneNumber;
 String password;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(Integer phoneNumber, String password) {
	super();
	this.phoneNumber = phoneNumber;
	this.password = password;
}
public Integer getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Integer phoneNumber) {
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
