package com.vahicleAPI.dio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carNo;
	private String carName;
	private long rentprice;
	
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public long getRentprice() {
		return rentprice;
	}
	public void setRentprice(long rentprice) {
		this.rentprice = rentprice;
	}
	
	

}
