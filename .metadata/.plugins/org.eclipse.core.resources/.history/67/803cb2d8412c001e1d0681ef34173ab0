package com.user.service.Userservice.ExternalServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.user.service.Userservice.Entities.Hotel;
import com.user.service.Userservice.Entities.Rating;

@FeignClient(name="HOTELSERVICE")
public interface Hotelservices {
	
	@GetMapping("/hotels/get/{id}")
	Hotel gethotel(@PathVariable String id);
	
	@GetMapping("/hotels/get/{hotelId}")
	Hotel gethotelbyid(@PathVariable String hotelId);
	
	
	
	

//	@GetMapping("/hotel/get")
//	Hotel gethotel1(Hotel hotel);

	
//	//post
//	@PostMapping("/addrating")
//	public Rating createrating(Rating values);
//	
//	//put
//	@PutMapping("/update/{ratingId}")
//	public Rating updaterating(@PathVariable String ratingId,Rating rating);
//	
//	//delete
//	@DeleteMapping("/delete/{ratingId}")
//	public void deleterating(@PathVariable String ratingId);
//	

}
