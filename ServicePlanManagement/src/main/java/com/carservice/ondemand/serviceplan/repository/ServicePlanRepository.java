package com.carservice.ondemand.serviceplan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carservice.ondemand.serviceplan.model.ServicePlan;

public interface ServicePlanRepository extends MongoRepository<ServicePlan, Integer>{

}
