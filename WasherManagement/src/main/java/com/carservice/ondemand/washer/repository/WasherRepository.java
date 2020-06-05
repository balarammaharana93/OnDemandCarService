package com.carservice.ondemand.washer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carservice.ondemand.washer.model.Washer;

public interface WasherRepository extends MongoRepository<Washer, Integer>{
	
	List<Washer> findByStatus(String status);

}
