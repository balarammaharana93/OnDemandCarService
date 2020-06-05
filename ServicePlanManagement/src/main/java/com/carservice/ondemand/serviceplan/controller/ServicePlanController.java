package com.carservice.ondemand.serviceplan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carservice.ondemand.serviceplan.model.ServicePlan;
import com.carservice.ondemand.serviceplan.repository.ServicePlanRepository;

@RestController
@RequestMapping("/api/service")
public class ServicePlanController {

		@Autowired
		private ServicePlanRepository servicePlanRepository;
		
		//@PostMapping("/addService")
		@RequestMapping(value = "/addService", consumes = "application/json", method=RequestMethod.POST)
		public String saveCustomerDetails(@RequestBody ServicePlan servicePlan){
			servicePlanRepository.save(servicePlan);   
			return "Added servicePlan with id : " + servicePlan.getServiceId();
		}
		
		//@GetMapping("/findAllService")
		@RequestMapping(value = "/findAllService", produces = "application/json", method=RequestMethod.GET)
		public List <ServicePlan> getAllServicePlans(){
			return servicePlanRepository.findAll();
		}
		
		//@GetMapping("/findAllService/{serviceId}")
		@RequestMapping(value = "/findAllService/{serviceId}", produces = "application/json", method=RequestMethod.GET)
		public Optional <ServicePlan> getServicePlan(@PathVariable int serviceId){
			return servicePlanRepository.findById(serviceId);
		}
		
		@RequestMapping(value = "/{serviceId}", method=RequestMethod.DELETE)
	    public String deleteServicePlan(@PathVariable int serviceId){
			servicePlanRepository.deleteById(serviceId);
			return "ServicePlan deleted with id :" + serviceId;
	    }
	    
}
