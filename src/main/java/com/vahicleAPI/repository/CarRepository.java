package com.vahicleAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vahicleAPI.dio.Car;

public interface CarRepository  extends JpaRepository<Car, Integer>{

}
