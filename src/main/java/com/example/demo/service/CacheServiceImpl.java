package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class CacheServiceImpl implements CacheService{

	@Override
	public User getData() {
		System.out.println("In Impl Layer");
		User usr =new User();
		usr.setFirstName("Nipun");
		usr.setLastName("Gujarathi");
		return usr;
	}

}
