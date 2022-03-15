package com.bhavna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.modal.Employee;
import com.bhavna.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/demo")
	public String demo() {
		return "Hello";
	}
	
	@GetMapping("/get/employee/{username}")
	public Employee getEmployee(@PathVariable String username) {
		return service.getEmployee(username);
	}
	
	@GetMapping("/get/profile/{email}")
	public Employee getEmployeeProfile(@PathVariable String email) {
		return service.getEmployeeProfile(email);
	}
	
	
	
	@PostMapping("/save/employee")
	public Employee postEmployee(@RequestBody Employee employee) {
		return service.postEmployee(employee);
	}

}
