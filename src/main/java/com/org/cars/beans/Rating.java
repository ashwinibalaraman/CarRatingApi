package com.org.cars.beans;

public class Rating {
	
	//@Id
	private String id;
	private String carId;
	private String reviewedBy;
	private int safety;
	private int performance;
	private int technology;
	private int interior;
	private int reliability;
	private int overallRating;
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCarId() {
		return carId;
	}
	
	public void setCarId(String carId) {
		this.carId = carId;
	}
	
	public String getReviewedBy() {
		return reviewedBy;
	}
	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}
	
	public int getSafety() {
		return safety;
	}
	
	public void setSafety(int safety) {
		this.safety = safety;
	}
	
	public int getPerformance() {
		return performance;
	}
	
	public void setPerformance(int performance) {
		this.performance = performance;
	}
	
	public int getTechnology() {
		return technology;
	}
	
	public void setTechnology(int technology) {
		this.technology = technology;
	}
	
	public int getInterior() {
		return interior;
	}
	
	public void setInterior(int interior) {
		this.interior = interior;
	}
	
	public int getReliability() {
		return reliability;
	}
	
	public void setReliability(int reliability) {
		this.reliability = reliability;
	}
	
	public int getOverallRating() {
		return overallRating;
	}
	
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
}
