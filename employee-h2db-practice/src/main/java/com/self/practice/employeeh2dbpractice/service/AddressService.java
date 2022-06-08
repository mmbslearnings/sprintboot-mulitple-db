/**
 * 
 */
package com.self.practice.employeeh2dbpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.practice.employeeh2dbpractice.entiry.Address;
import com.self.practice.employeeh2dbpractice.repository.address.AddressRepository;

/**
 * @author mmbsh
 *
 */
@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}
	
}
