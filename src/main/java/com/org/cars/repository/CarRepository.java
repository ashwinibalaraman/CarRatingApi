package com.org.cars.repository;

import org.springframework.data.repository.CrudRepository;

import com.org.cars.beans.Car;

/**
 * CarRepository for CRUD operations on Car repository (Car Collection in Mongo).
 * @author Ashwini
 *
 */
public interface CarRepository extends CrudRepository<Car, String>{}
