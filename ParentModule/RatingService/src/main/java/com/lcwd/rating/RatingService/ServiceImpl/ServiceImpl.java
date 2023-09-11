package com.lcwd.rating.RatingService.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.lcwd.rating.RatingService.Entity.Rating;
import com.lcwd.rating.RatingService.Repository.RatingRepository;
import com.lcwd.rating.RatingService.Services.RatingService;


@Service
public class ServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository repo;

	@Override
	public Rating create(Rating rating) {
		String ratingId=UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		return repo.save(rating);
	}

	@Override
	public List<Rating> getall() {
		return repo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return repo.getRatingByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String id) {
		return repo.getRatingByHotelId(id);
	}




	@Override
	public String deletebyratingId(String ratingId) {
		repo.deleteById(ratingId);

		return "Rating record deleted succesfully";
	}

	@Override
	public List<Rating> getRatingByRatingId(String ratingId) {
		
		return repo.getRatingByRatingId(ratingId);
	}

//	@Override
//	public List<Rating> updateByRatingId(String ratingId, Rating r) {
//		
//		List<Rating> existingProducts = repo.getRatingByRatingId(ratingId);
//
//        if (!existingProducts.isEmpty()) {
//            for (Rating existingProduct : existingProducts) {
//                // Update the fields of existingProduct with the fields from updatedProductDetails
//                existingProduct.setRatingId(r.getRatingId());
//                existingProduct.setUserId(r.getUserId());
//                existingProduct.setHotelId(r.getHotelId());
//                existingProduct.setRating(r.getRating());
//                existingProduct.setFeedback(r.getFeedback());
//                
//                // ... and so on for other fields
//                
//                // Save the updated product details
//                repo.save(existingProduct);
//            }
//
//            return existingProducts;
//        }
//        
//        return null; //
//	}
//	
	
	
	@Override
	public List<Rating> updateByRatingId(String ratingId, Rating r) {
	    List<Rating> existingRatings = repo.getRatingByRatingId(ratingId);

	    if (!existingRatings.isEmpty()) {
	        for (Rating existingRating : existingRatings) {
	            // Log existing rating before update
	            System.out.println("Existing Rating (Before Update): " + existingRating);

	            // Update the fields of existingRating with the fields from r
	            existingRating.setUserId(r.getUserId());
	            existingRating.setHotelId(r.getHotelId());
	            existingRating.setRating(r.getRating());
	            existingRating.setFeedback(r.getFeedback());

	            // ... and so on for other fields

	            // Save the updated rating
	            repo.save(existingRating);

	            // Log existing rating after update
	            System.out.println("Existing Rating (After Update): " + existingRating);
	        }

	        return existingRatings;
	    }

	    return null; // No ratings found with the specified ratingId
	}

	
	
	
	
//	 @Override
//	    public Rating updateByRatingId(String ratingId, Rating updatedRating) {
//	        Optional<Rating> existingRating = repo.findById(ratingId);
//
//	        if (existingRating.isPresent()) {
//	            Rating ratingToUpdate = existingRating.get();
//	            // Update the fields of the existing rating with the fields from updatedRating
//	            ratingToUpdate.setUserId(updatedRating.getUserId());
//	            ratingToUpdate.setHotelId(updatedRating.getHotelId());
//	            ratingToUpdate.setRating(updatedRating.getRating());
//	            ratingToUpdate.setFeedback(updatedRating.getFeedback());
//	            // Update other fields as needed
//
//	            // Save the updated rating
//	            return repo.save(ratingToUpdate);
//	        }
//
//	        return null; // Or throw an exception if the ratingId is not found.
//	    }
	 



}
