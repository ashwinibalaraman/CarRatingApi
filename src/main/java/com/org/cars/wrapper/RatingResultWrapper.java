package com.org.cars.wrapper;

import java.util.List;

/**
 * In order to adhere to the expected JSON response format given in the
 * requirement document, RatingResultWrapper used for wrapping the list of
 * ratings.
 * 
 * @author Ashwini
 *
 */
public class RatingResultWrapper {
	private List<CarAndRatingWrapper> results;

	public List<CarAndRatingWrapper> getResults() {
		return results;
	}

	public void setResults(List<CarAndRatingWrapper> results) {
		this.results = results;
	}
}
