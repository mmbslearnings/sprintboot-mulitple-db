/**
 * 
 */
package com.self.practice.employeeh2dbpractice.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mmbsh
 *
 */
@Entity
@Table(name="ADDRESS_TB")
public class Address {
	@Id
	@Column(name="ADDR_ID")
	private int id;
	
	@Column(name="AREA")
	private String area;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="PINCODE")
	private int pincode;
	
	public Address() {}
	
	public Address(int id, String area, String city, int pincode) {
		super();
		this.id = id;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}	
	
	
}
