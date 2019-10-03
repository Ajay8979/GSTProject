package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerPlaceOfBusiness;

public interface CustomerPlaceOfBusinessService {

	CustomerPlaceOfBusiness addCustomerPlaceOfBusiness(CustomerPlaceOfBusiness customer);
	
	List<CustomerPlaceOfBusiness> getAllCustomerPlaceOfBusiness();

	CustomerPlaceOfBusiness getCustomerPlaceOfBusinessById(Long id);

    void deleteCustomerPlaceOfBusinessById(Long id);

    CustomerPlaceOfBusiness updatecCustomerPlaceOfBusiness(CustomerPlaceOfBusiness reg);
	
	
	
}
