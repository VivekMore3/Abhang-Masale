package com.main.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.SerivesImplementation.SignUpImpl;
import com.main.entities.Login;
import com.main.entities.UserMaster;

@RestController
@RequestMapping("/User/")
public class LoginSignUpController {	

	@Autowired SignUpImpl signUpImpl;
	
	@PostMapping("SignUp")
	public ResponseEntity<?> signUp(@RequestBody UserMaster user) {
		return ResponseEntity.ok(signUpImpl.signUp(user));
	}
	
	@GetMapping("Login")
	public boolean login(@RequestBody Login login) {
		return signUpImpl.login(login);
	}
}
