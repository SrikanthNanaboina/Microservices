package com.bhavna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bhavna.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
	@Query(value = "SELECT * FROM EMPLOYEES e WHERE e.EMAIL = :email", nativeQuery = true)
	Employee findByEmail(String email);

}
