package com.org.cars.wrapper;

import com.org.cars.beans.Car;
import com.org.cars.beans.Rating;

/*CarAndRatingWrapper is used as a wrapper for wrapping the car and rating details together.

@author Ashwini
 
 */
public class CarAndRatingWrapper {

	private Car car;
	private Rating rating;

	public CarAndRatingWrapper() {

	}

	public CarAndRatingWrapper(Car car, Rating rating) {
		this.car = car;
		this.rating = rating;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

}
