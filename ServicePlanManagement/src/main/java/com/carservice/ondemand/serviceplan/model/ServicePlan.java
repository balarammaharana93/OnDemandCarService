package com.carservice.ondemand.serviceplan.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@ToString
@Document(collection = "ServicePlanDetails")
public class ServicePlan {
		
		@Id
		private int serviceId;
		private String modelName;
		private String serviceType;
		private String serviceCharge;
		
		public int getServiceId() {
			return serviceId;
		}
		public void setServiceId(int serviceId) {
			this.serviceId = serviceId;
		}
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public String getServiceType() {
			return serviceType;
		}
		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}
		public String getServiceCharge() {
			return serviceCharge;
		}
		public void setServiceCharge(String serviceCharge) {
			this.serviceCharge = serviceCharge;
		}
		

}
