package com.vahicleAPI.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.vahicleAPI.dio.Car;

public interface CarService {
	
	ResponseEntity<List<Car>> getAllCar();
	
	ResponseEntity<Car> createCar(Car car);

}
