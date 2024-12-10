package com.path.rating.service;

import java.util.List;
import com.path.rating.entities.Rating;

public interface RatingService {

	//save Rating given by user
	Rating saveRating(Rating rating);
	
	Rating getRatingById(String ratingId);
	
	//get All Ratings
	List<Rating> getAllRatings();
	
	//get Rating by userId
	List<Rating> getRatingByUserId(String userId);
	
	//get Rating by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
}
