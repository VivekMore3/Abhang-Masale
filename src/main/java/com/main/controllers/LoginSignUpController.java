package com.main.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.SerivesImplementation.SignUpImpl;
import com.main.entities.Login;
import com.main.entities.UserMaster;

import javax.naming.AuthenticationException;

@RestController
@RequestMapping("/User/")
public class LoginSignUpController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired SignUpImpl signUpImpl;
	
	@PostMapping("SignUp")
	public ResponseEntity<?> signUp(@RequestBody UserMaster user) {

		return ResponseEntity.ok(signUpImpl.signUp(user));
	}
	
	@PostMapping("Login")
	public ResponseEntity<?> login(@RequestBody Login login) {

		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(login.getPhoneNumber(), login.getPassword())
			);
			return ResponseEntity.ok("Login Successful");
		} catch (Exception ex) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Phone Number or Password");
		}

	}
}
