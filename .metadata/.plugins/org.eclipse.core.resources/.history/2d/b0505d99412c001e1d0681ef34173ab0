package com.lcwd.rating.RatingService.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Rating update(Rating rating) {
		return repo.save(rating);
	}

	@Override
	public String delete(String userId) {
		 repo.deleteById(userId);
		 return "Rating record deleted Succesfully";
	}

}
