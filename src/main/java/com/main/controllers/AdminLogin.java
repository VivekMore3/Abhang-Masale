package com.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entities.Login;
import com.main.entities.ProductMaster;
import com.main.repositories.ProductRepository;

@RestController
@RequestMapping("/Admin")
public class AdminLogin {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/login")
	public boolean login(@RequestBody Login login) {
		if(login.getPhoneNumber().equals("12345678") && login.getPassword().equals("")) {
			return true;
		}
		return false;
	}
	
	@PostMapping("/addProduct")
	public ProductMaster addProduct(@RequestBody ProductMaster product){
		return productRepository.save(product);
	}
	
	@GetMapping("/getAllproducts")
	public List<ProductMaster> getAllproducts(){
		return productRepository.findAll();
	}
}
