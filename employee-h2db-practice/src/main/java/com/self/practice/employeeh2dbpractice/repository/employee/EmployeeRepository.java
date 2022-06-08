package com.self.practice.employeeh2dbpractice.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.self.practice.employeeh2dbpractice.entiry.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
