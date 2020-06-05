package com.carservice.ondemand.serviceplan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "AirConditioningServiceDetails")
public class AirConditioningService {
	
	@Id
	private int serviceId;	
	private String modelName;
	private String serviceCharge;

}
