package com.lcwd.rating.RatingService.RatingController;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
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
	
	@GetMapping("/get/rating/{ratingId}")
	public ResponseEntity<List<Rating>> get2(@PathVariable String ratingId){
		return ResponseEntity.ok(service.getRatingByRatingId(ratingId));
	}
	

	
	
//	@PutMapping("/update/{ratingId}")
//    public ResponseEntity<Rating> update(@PathVariable String ratingId, @RequestBody Rating updatedRating) {
//        Rating updatedRatingResult = service.updateByRatingId(ratingId, updatedRating);
//        
//        if (updatedRatingResult != null) {
//            return ResponseEntity.ok(updatedRatingResult);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
    
//	
//    @PutMapping("/update/{ratingId}")
//    public ResponseEntity<List<Rating>> updateByEmailId(@PathVariable String ratingId,
//            @RequestBody Rating personalDetails) {
//        List<Rating> updatePersonalDetails = service.updateByRatingId(ratingId,
//                personalDetails);
//
//        if (updatePersonalDetails != null) {
//            return ResponseEntity.ok().body(updatePersonalDetails);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
	
	@PutMapping("/update/{ratingId}")
	public ResponseEntity<List<Rating>> updateByRatingId(@PathVariable String ratingId, @RequestBody Rating updatedRating) {
	    List<Rating> updatedRatings = service.updateByRatingId(ratingId, updatedRating);

	    if (updatedRatings != null) {
	        return ResponseEntity.ok(updatedRatings);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	

	

	@DeleteMapping("/delete/{ratingId}")
	public ResponseEntity<String> delete(@PathVariable String ratingId){
		service.deletebyratingId(ratingId);
		return ResponseEntity.ok("{\"message\": \"User Deleted Succesfully\"}");
	}
}
