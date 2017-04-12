package com.org.cars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.cars.beans.Car;
import com.org.cars.exception.ResourceNotFoundException;
import com.org.cars.repository.CarRepository;
import com.org.cars.repository.RatingRepository;
import com.org.cars.wrapper.CarResultWrapper;

/**
 * CarService for implementing the business logic of REST APIs CRUD operations
 * of Cars.
 * 
 * @author Ashwini
 *
 */
@Service
public class CarService {

	@Autowired
	CarRepository carRepository;

	@Autowired
	RatingRepository ratingRepository;

	public CarResultWrapper getAllCars() {
		CarResultWrapper carResults = new CarResultWrapper();
		List<Car> results = new ArrayList<Car>();
		for (Car c : carRepository.findAll()) {
			results.add(c);
		}
		carResults.setResults(results);
		return carResults;
	}

	public Car createCar(Car car) {
		return carRepository.save(car);
	}

	public Car getCar(String id) {
		Car car = carRepository.findOne(id);
		if (car == null) {
			throw new ResourceNotFoundException();
		}
		return car;
	}

	public Car updateCar(String id, Car car) {
		Car updateCar = carRepository.findOne(id);
		if (updateCar == null) {
			throw new ResourceNotFoundException();
		}
		updateCar.setMake(car.getMake());
		updateCar.setModel(car.getModel());
		updateCar.setYear(car.getYear());
		return carRepository.save(updateCar);
	}

	public void deleteCar(String id) {
		Car updateCar = carRepository.findOne(id);
		if (updateCar == null) {
			throw new ResourceNotFoundException();
		}
		ratingRepository.deleteByCarId(id);
		carRepository.delete(id);
	}

}
