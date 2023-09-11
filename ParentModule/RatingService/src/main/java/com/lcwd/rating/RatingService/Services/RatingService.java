package com.lcwd.rating.RatingService.Services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.lcwd.rating.RatingService.Entity.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating rating);

	//get all ratings
	List<Rating>getall();
	
	//get all ratings by userId
	List<Rating> getRatingByUserId(String userId);
	
	//get all ratings by hotelId
	List<Rating> getRatingByHotelId(String id);
	
	//get rating by ratingId
	List<Rating> getRatingByRatingId(String ratingId);
	
	//update ratings
//	Rating update(Rating rating);
	
	List<Rating> updateByRatingId(String ratingId,Rating r);
	
//	Rating updateByRatingId(String ratingId, Rating updatedRating);
	
	
	

	String deletebyratingId(String ratingId);

}
