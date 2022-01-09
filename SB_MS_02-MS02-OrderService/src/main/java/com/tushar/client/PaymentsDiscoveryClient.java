package com.tushar.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentsDiscoveryClient {

	@Autowired
	private DiscoveryClient clientComp ;
	
	public String getStartDetails() {
		String msg="";
		
		//find available instances of BankPayment-operations
		List<ServiceInstance> ListInstances = clientComp.getInstances("BankPayment-operations");
		//select insatance of BankPayment-operations
		ServiceInstance instance = ListInstances.get(0);
		//call the service using RestTemplate
		RestTemplate template = new RestTemplate();
		msg = template.getForObject(instance.getUri() + "/payments/start", String.class);
		
		return msg;
	}
	
}
