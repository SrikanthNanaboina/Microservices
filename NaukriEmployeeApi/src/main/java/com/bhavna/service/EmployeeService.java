package com.bhavna.service;

import com.bhavna.modal.Employee;

public interface EmployeeService {

	Employee getEmployee(String username);

	Employee postEmployee(Employee employee);

	Employee getEmployeeProfile(String email);

}
