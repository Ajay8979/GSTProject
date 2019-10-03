package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerTaxPayer;

public interface CustomerTaxPayerService {
    CustomerTaxPayer addCustomerTaxPayer(CustomerTaxPayer customer);
	
	List<CustomerTaxPayer> getAllCustomerTaxPayers();

	CustomerTaxPayer getCustomerTaxPayerById(Long id);
	/*
	 * void deleteCustomerRegistrationById(CustomerRegistration reg);
	 * 
	 * CustomerRegistration updatecCustomerRegistration(CustomerRegistration reg);
	 */

}
