package com.carservice.ondemand.car.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carservice.ondemand.car.model.Car;

public interface CarRepository extends MongoRepository<Car, Integer>{

}
