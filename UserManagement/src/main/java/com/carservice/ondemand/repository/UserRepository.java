package com.carservice.ondemand.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carservice.ondemand.model.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
