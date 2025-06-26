package com.main.security;

import com.main.entities.UserMaster;
import com.main.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserMaster user =userRepository.findByMobileNumber(username);
        if(user==null)throw new UsernameNotFoundException("User Not Found");

        return new User(user.getMobileNumber(),user.getPassword(),null);
    }
}
