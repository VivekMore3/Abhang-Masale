package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.UserMaster;


@Repository
public interface UserRepository extends JpaRepository<UserMaster,Integer>{
	UserMaster findByMobileNumber(Integer mobileNumber);
}
