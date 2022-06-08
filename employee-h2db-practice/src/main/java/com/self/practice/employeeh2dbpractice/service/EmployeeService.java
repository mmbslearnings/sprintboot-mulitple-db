/**
 * 
 */
package com.self.practice.employeeh2dbpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.practice.employeeh2dbpractice.entiry.Employee;
import com.self.practice.employeeh2dbpractice.repository.employee.EmployeeRepository;

/**
 * @author mmbsh
 *
 */

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.getById(id);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
