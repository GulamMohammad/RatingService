package com.path.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.path.rating.entities.Rating;
import com.path.rating.service.RatingService;

import jakarta.ws.rs.PathParam;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingService service;
	
	//save Ratings
	@PostMapping
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveRating(rating));
	}
	
	//get rating using ratingId
	@GetMapping("/{ratingId}")
	public ResponseEntity<Rating> getRatingById(@PathVariable String ratingId){
		
		return ResponseEntity.ok(service.getRatingById(ratingId));
	}
	
	//get All Ratings
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings(){
		
		return ResponseEntity.ok(service.getAllRatings());
	}
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		
		return ResponseEntity.ok(service.getRatingByUserId(userId));
	}
	
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		
		return ResponseEntity.ok(service.getRatingByUserId(hotelId));
	}

}
