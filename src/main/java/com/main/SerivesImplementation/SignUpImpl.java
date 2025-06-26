package com.main.SerivesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entities.Login;
import com.main.entities.UserMaster;
import com.main.repositories.UserRepository;
import com.main.services.SignUp;

@Service
public class SignUpImpl implements SignUp{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserMaster signUp(UserMaster user) {
		
		return userRepository.save(user);
	}

	@Override
	public boolean login(Login cred) {
		UserMaster credFromDb=  userRepository.findByMobileNumber(cred.getPhoneNumber());
		if(credFromDb==null) return false;
		if(cred.getPassword().equals(credFromDb.getPassword())) {
			return true;
		}
		return false;
	}

}
