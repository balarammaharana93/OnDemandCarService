package com.carservice.ondemand.washer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.ToString;

@ToString
@Document(collection = "WasherDetails")
public class Washer {

	@Id
	private int washerId;
	private String washerName;
	private String washerLocation;
	private String status;
	public int getWasherId() {
		return washerId;
	}
	public void setWasherId(int washerId) {
		this.washerId = washerId;
	}
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	public String getWasherLocation() {
		return washerLocation;
	}
	public void setWasherLocation(String washerLocation) {
		this.washerLocation = washerLocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
