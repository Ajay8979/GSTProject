package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness1;

public interface CustomerAdditionalPlaceOfBusiness1Service {

	CustomerAdditionalPlaceOfBusiness1 addCustomerAdditionalPlaceOfBusiness1(CustomerAdditionalPlaceOfBusiness1 customer);
	
	List<CustomerAdditionalPlaceOfBusiness1> getAllCustomerAdditionalPlaceOfBusiness1();

	CustomerAdditionalPlaceOfBusiness1 getCustomerAdditionalPlaceOfBusiness1ById(Long id);

    void deleteCustomerAdditionalPlaceOfBusiness1ById(Long id);

    CustomerAdditionalPlaceOfBusiness1 updatecCustomerAdditionalPlaceOfBusiness1(CustomerAdditionalPlaceOfBusiness1 reg);
	
	

}
