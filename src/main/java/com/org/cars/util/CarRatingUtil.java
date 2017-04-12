package com.org.cars.util;

import com.org.cars.beans.Car;
import com.org.cars.beans.Rating;
import com.org.cars.wrapper.CarAndRatingWrapper;

public class CarRatingUtil {

	public int calculateOverall(Rating rating) {
		return (rating.getSafety() + rating.getPerformance() + rating.getTechnology() + rating.getInterior()
				+ rating.getReliability()) / 5;
	}

	public CarAndRatingWrapper buildCarAndRatingObject(Car car, Rating rating) {
		rating.setOverallRating(calculateOverall(rating));
		CarAndRatingWrapper carAndRating = new CarAndRatingWrapper(car,rating);
		return carAndRating;
	}
}
