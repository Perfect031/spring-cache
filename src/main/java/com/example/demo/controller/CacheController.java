package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.CacheService;

@RestController
public class CacheController {

	@Autowired
	CacheService cacheService;
	
	@RequestMapping(value="/data", method= RequestMethod.GET,produces = "application/Json")
	@Cacheable("data")
	public User getData(@RequestParam(value = "person", defaultValue = "John") String personName) {
		User data =cacheService.getData();
		return data;
	}
}
