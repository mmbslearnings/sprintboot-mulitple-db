package com.self.practice.employeeh2dbpractice.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_TB")
public class Employee {

	@Id
	@Column(name="EMP_ID")
	private int id;
	
	@Column(name="EMP_NAME")
	private String name;
	
	@Column(name="EMP_SALARY")
	private double salary;

	public Employee() {}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
