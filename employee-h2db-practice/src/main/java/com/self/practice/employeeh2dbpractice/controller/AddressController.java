/**
 * 
 */
package com.self.practice.employeeh2dbpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.practice.employeeh2dbpractice.entiry.Address;
import com.self.practice.employeeh2dbpractice.service.AddressService;

/**
 * @author mmbsh
 *
 */

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/create")
	public Address createAddress(@RequestBody Address address) {
		return addressService.createAddress(address);
	}

}
