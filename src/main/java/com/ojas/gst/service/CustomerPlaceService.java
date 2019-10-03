package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerPlace;

public interface CustomerPlaceService {
	CustomerPlace addCustomerPlace(CustomerPlace customer);
	
	List<CustomerPlace> getAllCustomerPlace();

	CustomerPlace getCustomerPlaceById(Long id);

    void deleteCustomerPlacenById(Long id);

    CustomerPlace updatecCustomerPlace(CustomerPlace reg);

}
