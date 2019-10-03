package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerBusinessDetails;

public interface CustomerBusinessDetailsService {

	CustomerBusinessDetails addCustomerBusinessDetails(CustomerBusinessDetails customer);
	
	List<CustomerBusinessDetails> getAllCustomerBusinessDetails();

	CustomerBusinessDetails getCustomerBusinessDetailsById(Long id);

    void deleteCustomerBusinessDetailsById(Long id);

    CustomerBusinessDetails updatecCustomerBusinessDetails(CustomerBusinessDetails reg);
	
	
	
}
