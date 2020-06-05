package com.carservice.ondemand.login.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("api/login")
public class LoginController implements ErrorController{

    @GetMapping
    public Principal getUser(Principal user) {
    	System.out.print("Authenticated");
    	System.out.println("");
    	return user;
    }
    
    private final static String PATH = "/error";
    @Override
    @RequestMapping(PATH)
    @ResponseBody
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "No Mapping Found";
	}
}