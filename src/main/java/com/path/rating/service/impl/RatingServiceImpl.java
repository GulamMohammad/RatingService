package com.path.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.path.rating.entities.Rating;
import com.path.rating.repository.RatingRepository;
import com.path.rating.service.RatingService;
import com.path.rating.service.exception.ResourceNotFoundException;

@Service
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingRepository repository;

	@Override
	public Rating saveRating(Rating rating) {

		rating.setRatingId(UUID.randomUUID().toString());
		return repository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {

		return repository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {

		return repository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {

		return repository.findByHotelId(hotelId);
	}

	@Override
	public Rating getRatingById(String ratingId) {
		
		return repository.findById(ratingId).orElseThrow(() -> new ResourceNotFoundException("Rating not found with the given ratingId:"+ratingId));
	}

}
