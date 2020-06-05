package com.carservice.ondemand.washer.controller;

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

import com.carservice.ondemand.washer.model.Washer;
import com.carservice.ondemand.washer.repository.WasherRepository;

@RestController
@RequestMapping("/api/washer")
public class WasherController {
	
	@Autowired
	private WasherRepository washerRepository;
	
	@RequestMapping(value = "/addWasher", consumes = "application/json", method=RequestMethod.POST)
	public String saveCustomerDetails(@RequestBody Washer washer){
		washerRepository.save(washer);   
		return "Added Washer with id : " + washer.getWasherId();
	}
	
	@RequestMapping(value = "/findAllWashers", produces = "application/json", method=RequestMethod.GET)
	public List <Washer> getAllWashers(){
		return washerRepository.findAll();
	}
	
	@RequestMapping(value = "/findAllWashers/{washerId}", produces = "application/json", method=RequestMethod.GET)
	public Optional <Washer> getWasher(@PathVariable int washerId){
		return washerRepository.findById(washerId);
	}
	
	@RequestMapping(value = "/findAllWashers/{status}", produces = "application/json", method=RequestMethod.GET) 
	public List <Washer> getWasher(@PathVariable String status){ 
		List<Washer> washer = washerRepository.findByStatus(status);
		return washer;
	}
	
	@RequestMapping(value = "/{serviceId}", method=RequestMethod.DELETE)
    public String deleteWasher(@PathVariable int washerId){
		washerRepository.deleteById(washerId);
		return "Washer deleted with id :" + washerId;
    }
    
}
