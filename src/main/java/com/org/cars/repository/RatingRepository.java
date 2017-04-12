package com.org.cars.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.org.cars.beans.Rating;

/**
 * CarRepository for CRUD operations on Rating repository (Rating Collection in Mongo).
 * @author Ashwini
 *
 */
public interface RatingRepository extends CrudRepository<Rating, String>{
	List<Rating> findByCarId(String carId);
	void deleteByCarId(String carId);
}
