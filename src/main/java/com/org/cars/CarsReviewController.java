package com.org.cars;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.org.cars.beans.Car;
import com.org.cars.beans.Rating;
import com.org.cars.repository.CarRepository;
import com.org.cars.repository.RatingRepository;
import com.org.cars.service.CarService;
import com.org.cars.service.RatingService;
import com.org.cars.wrapper.CarResultWrapper;
import com.org.cars.wrapper.RatingResultWrapper;

@RestController
public class CarsReviewController {
	 
	@Autowired
	CarRepository carRepository;
	
	@Autowired
	CarService carService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/cars")
	@ResponseStatus(HttpStatus.OK)
	public CarResultWrapper getAllCars(){
		return carService.getAllCars();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/cars")
	@ResponseStatus(HttpStatus.CREATED)
	public Car postCar(@RequestBody Car car,  HttpServletResponse response) {
		return carService.createCar(car);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/cars/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Car getCar(@PathVariable String id, HttpServletResponse response) {
		return carService.getCar(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/cars/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Car putCar(@PathVariable String id,  @RequestBody Car car, HttpServletResponse response) {
		return carService.updateCar(id, car);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/cars/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCar(@PathVariable String id, HttpServletResponse response) {
		carService.deleteCar(id);
	}
	
	@Autowired
	RatingRepository ratingRepository;
	
	@Autowired
	RatingService ratingService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ratings")
	@ResponseStatus(HttpStatus.OK)
	public RatingResultWrapper getAllRatings(){
		return ratingService.getAllRatings();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/ratings")
	@ResponseStatus(HttpStatus.CREATED)
	public Rating postRating(@RequestBody Rating rating,  HttpServletResponse response) {
		return ratingService.createRating(rating);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/ratings/{id}")
	@ResponseStatus(HttpStatus.OK)
	public RatingResultWrapper getRating(@PathVariable String id, HttpServletResponse response) {
		return ratingService.getRating(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/ratings/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Rating putRating(@PathVariable String id,  @RequestBody Rating rating, HttpServletResponse response) {
		return ratingService.updateRating(id, rating);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/ratings/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteRating(@PathVariable String id, HttpServletResponse response) {
		ratingService.deleteRating(id);
	}
}
