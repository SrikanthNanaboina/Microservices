package com.bhavna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.bhavna.modal.Employee;
import com.bhavna.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repo;
	
	public Employee getEmployee(@PathVariable String username) {
		return repo.findById(username).orElseThrow();
	}
	
	public Employee postEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeProfile(String email) {
		return repo.findByEmail(email);
	}
}
