package com.tushar.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentsClient {

	@Autowired
	private LoadBalancerClient clientComp ;
	
	public String getStartDetails() {
		String msg="";
		
		//finds less load factor instances of BankPayment-operations
		ServiceInstance  Instances = clientComp.choose("BankPayment-operations");
		//call the service using RestTemplate
		RestTemplate template = new RestTemplate();
		msg = template.getForObject(Instances.getUri() + "/payments/start", String.class);
		
		return msg;
	}
	
}
