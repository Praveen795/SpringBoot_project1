package com.vahicleAPI.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.vahicleAPI.dio.Car;
import com.vahicleAPI.repository.CarRepository;
import com.vahicleAPI.service.CarService;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	CarRepository carRepository;

	@Override
	public ResponseEntity<List<Car>> getAllCar() {
		// TODO Auto-generated method stub
		List<Car> cars=carRepository.findAll();
		if(cars.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.FOUND).body(cars);
		}
		
	}

	@Override
	public ResponseEntity<Car> createCar(Car car) {
		// TODO Auto-generated method stub
		
		Car iscar=carRepository.save(car);
		if(iscar==null) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
			
		}else {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(iscar);
			
		}
		
	}

}
