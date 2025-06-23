package com.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer userIdInteger;
	String firstName;
	String lastName;
	Integer mobileNumber;
	String emailId;
	String address;
	Character gender;
	String password;
	
}
