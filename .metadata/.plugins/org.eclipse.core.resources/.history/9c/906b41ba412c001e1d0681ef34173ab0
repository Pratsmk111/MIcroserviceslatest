package com.user.service.Userservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.Userservice.Entities.User;
import com.user.service.Userservice.Service.Userservice;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private Userservice service;
	
	@PostMapping("/add")
	public ResponseEntity<User> createuser(@RequestBody User user){
		User user1=service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<User>> getusers(){
		List<User> allusers=service.getallUser();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(allusers);
	}
	
	@GetMapping("/get/{userId}")
	public ResponseEntity<User> getuser(@PathVariable String userId){
		User user=service.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@DeleteMapping("/delete/{userId}")
	public String deleteuser(@PathVariable String userId){
		String user=service.deleteUser(userId);
		return "User record deleted succesfully";	
	}
	
	@PutMapping("/update/{userId}")
	public ResponseEntity<User> updateuser(@RequestBody User user, @PathVariable String userId){
		User user2=service.updateUser(user);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(user2);
	}

}
