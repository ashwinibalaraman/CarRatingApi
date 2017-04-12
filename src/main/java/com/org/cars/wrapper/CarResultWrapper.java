package com.org.cars.wrapper;

/**
 * In order to adhere to the expected JSON response format given in the
 * requirement document. CarResultWrapper 
 * used for wrapping the list of cars.
 * 
 * @author Ashwini
 *
 */
import java.util.List;

import com.org.cars.beans.Car;

public class CarResultWrapper {

	private List<Car> results;

	public List<Car> getResults() {
		return results;
	}

	public void setResults(List<Car> results) {
		this.results = results;
	}
}
