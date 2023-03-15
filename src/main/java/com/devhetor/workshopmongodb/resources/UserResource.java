package com.devhetor.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhetor.workshopmongodb.domain.User;
import com.devhetor.workshopmongodb.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository service;
	
	@GetMapping
	public ResponseEntity<List<User>> findALL(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
