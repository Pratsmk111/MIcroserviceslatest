package com.lcwd.rating.RatingService.RatingController;


import java.util.List;
import java.util.Optional;

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

import com.lcwd.rating.RatingService.Entity.Rating;
import com.lcwd.rating.RatingService.Services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService service;

	@PostMapping("/add")
	public ResponseEntity<Rating>create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.create(rating));
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Rating>> getall(){
		return ResponseEntity.ok(service.getall());
	}
	
	@GetMapping("/get/user/{userId}")
	public ResponseEntity<List<Rating>> get(@PathVariable String userId){
		return ResponseEntity.ok(service.getRatingByUserId(userId));
	}
	
	@GetMapping("/get/hotel/{id}")
	public ResponseEntity<List<Rating>> get1(@PathVariable String id){
		return ResponseEntity.ok(service.getRatingByHotelId(id));
	}
	
	@PutMapping("/update/{userId}")
	public ResponseEntity<Rating> update(@RequestBody Rating rating,@PathVariable String userId){
		return ResponseEntity.status(HttpStatus.CREATED).body(rating);
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> delete(@RequestBody String userId){
		service.delete(userId);
		return ResponseEntity.ok("Rating record deleted succesfully");
	}
}
