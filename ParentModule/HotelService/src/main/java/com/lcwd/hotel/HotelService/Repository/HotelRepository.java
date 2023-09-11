package com.lcwd.hotel.HotelService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lcwd.hotel.HotelService.Entity.Hotel;

public interface HotelRepository extends MongoRepository<Hotel, String> {
	


}
