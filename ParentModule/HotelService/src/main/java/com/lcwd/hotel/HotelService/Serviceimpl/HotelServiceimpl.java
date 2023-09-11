package com.lcwd.hotel.HotelService.Serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.HotelService.Entity.Hotel;
import com.lcwd.hotel.HotelService.Repository.HotelRepository;
import com.lcwd.hotel.HotelService.Services.HotelService;

@Service
public class HotelServiceimpl implements HotelService{
	
	@Autowired
	private HotelRepository repo;
	

	@Override
	public Hotel create(Hotel hotel) {
		String id=UUID.randomUUID().toString();
		hotel.setId(id);
		return repo.save(hotel);
	}

	@Override
	public List<Hotel> getall() {
		return repo.findAll();
	}

	@Override
	public Optional<Hotel> get(String id) {
		return repo.findById(id);
	}

	@Override
	public String delete(String id) {
		repo.deleteById(id);
		return "Hotel record deleted succesfully";
	}

	@Override
	public Hotel update(Hotel hotel) {
		return repo.save(hotel);
	}

}
