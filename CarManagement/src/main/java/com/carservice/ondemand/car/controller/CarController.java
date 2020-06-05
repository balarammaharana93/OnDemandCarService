package com.carservice.ondemand.car.controller;

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

import com.carservice.ondemand.car.model.Car;
import com.carservice.ondemand.car.repository.CarRepository;


@RestController
@RequestMapping("/api/car")
public class CarController {
	
	@Autowired
	private CarRepository carRepository;
	
	@PostMapping("/addCar")
	public String saveCustomerDetails(@RequestBody Car car){
	    carRepository.save(car);   
		return "Added Car with id : " + car.getId();
	}
	
	@GetMapping("/findAllCars")
	public List <Car> getCars(){
		return carRepository.findAll();
	}
	
	@GetMapping("/findAllCars/{id}")
	public Optional <Car> getCar(@PathVariable int id){
		return carRepository.findById(id);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    public String deleteCar(@PathVariable int id){
		carRepository.deleteById(id);
		return "Car deleted with id :" + id;
    }
    
}

