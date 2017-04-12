package com.org.cars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.cars.beans.Car;
import com.org.cars.beans.Rating;
import com.org.cars.exception.ResourceNotFoundException;
import com.org.cars.repository.RatingRepository;
import com.org.cars.util.CarRatingUtil;
import com.org.cars.wrapper.CarAndRatingWrapper;
import com.org.cars.wrapper.RatingResultWrapper;

/**
 * RatingService for implementing the business logic of REST APIs CRUD
 * operations of Ratings.
 * 
 * @author Ashwini
 *
 */
@Service
public class RatingService {

	@Autowired
	RatingRepository ratingRepository;

	@Autowired
	CarService carService;

	public RatingResultWrapper getAllRatings() {
		RatingResultWrapper ratingResults = new RatingResultWrapper();
		List<CarAndRatingWrapper> results = new ArrayList<CarAndRatingWrapper>();

		CarRatingUtil carRatingUtil = new CarRatingUtil();

		for (Rating rating : ratingRepository.findAll()) {
			Car car = carService.getCar(rating.getCarId());
			results.add(carRatingUtil.buildCarAndRatingObject(car, rating));
		}
		ratingResults.setResults(results);
		return ratingResults;
	}

	public Rating createRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	public RatingResultWrapper getRating(String id) {
		RatingResultWrapper ratingResults = new RatingResultWrapper();
		List<CarAndRatingWrapper> results = new ArrayList<CarAndRatingWrapper>();
		CarRatingUtil carRatingUtil = new CarRatingUtil();
		Car car = carService.getCar(id);
		for (Rating rating : ratingRepository.findByCarId(id)) {
			results.add(carRatingUtil.buildCarAndRatingObject(car, rating));
		}
		ratingResults.setResults(results);
		return ratingResults;
	}

	public Rating updateRating(String id, Rating rating) {
		Rating updateRating = ratingRepository.findOne(id);
		if (updateRating == null) {
			throw new ResourceNotFoundException();
		}
		updateRating.setCarId(rating.getCarId());
		updateRating.setReviewedBy(rating.getReviewedBy());
		updateRating.setSafety(rating.getSafety());
		updateRating.setPerformance(rating.getPerformance());
		updateRating.setTechnology(rating.getTechnology());
		updateRating.setInterior(rating.getInterior());
		updateRating.setReliability(rating.getReliability());

		return ratingRepository.save(updateRating);
	}

	public void deleteRating(String id) {
		Rating updateRating = ratingRepository.findOne(id);
		if (updateRating == null) {
			throw new ResourceNotFoundException();
		}
		ratingRepository.delete(id);
	}
}
