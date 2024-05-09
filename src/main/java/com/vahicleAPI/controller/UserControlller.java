package com.vahicleAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vahicleAPI.dio.Car;
import com.vahicleAPI.serviceimpl.CarServiceImpl;



@RestController
@RequestMapping("/Car")
public class UserControlller {
	
	@Autowired
	CarServiceImpl carserviceimpl;
	
	
	@GetMapping
	public ResponseEntity<List<Car>> getAllCar(){
		
		return carserviceimpl.getAllCar();
		
	}
	
	@PostMapping
	public ResponseEntity<Car> createCar(@RequestBody Car car){
		
		return carserviceimpl.createCar(car);
		
	}

}
