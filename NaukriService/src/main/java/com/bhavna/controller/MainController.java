package com.bhavna.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bhavna.modal.Employee;


@RestController
@RefreshScope
public class MainController {
	@Value("${domainName}")
	private String domainName;
	
	@Autowired
	RestTemplate restTemplate;
 
	@GetMapping("/demo")
	public String getDemo() {
		return "Hello";
	}
	
	@PostMapping("saveProfile")
	public ResponseEntity<Employee> postDemo(@RequestBody Employee employee) {
		HttpEntity<Employee> request = new HttpEntity<>(employee);
		ResponseEntity<Employee> response = restTemplate
		  .exchange("http://localhost:8082/api-employee/save/employee", HttpMethod.POST, request, Employee.class);
		return response;
	}
	
	@GetMapping("getProfile/{username}"+"${domainName}")
	public ResponseEntity<Employee> getStudentList(@PathVariable String username) {
		return restTemplate.getForEntity("http://localhost:8082/api-employee/get/profile/"+username+domainName,Employee.class);
	}
}
