package com.carservice.ondemand.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carservice.ondemand.model.User;
import com.carservice.ondemand.repository.UserRepository;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/addUser")
	public String saveCustomerDetails(@RequestBody User customer){
	    userRepository.save(customer);   
		return "Added User with id : " + customer.getId();
	}
	
	@GetMapping("/findAllUsers")
	public List <User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/findAllUsers/{id}")
	public Optional <User> getUser(@PathVariable int id){
		return userRepository.findById(id);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable int id){
		userRepository.deleteById(id);
		return "User deleted with id :" + id;
    }
    
}
