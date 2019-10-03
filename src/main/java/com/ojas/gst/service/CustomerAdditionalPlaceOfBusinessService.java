package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness;

public interface CustomerAdditionalPlaceOfBusinessService {

	CustomerAdditionalPlaceOfBusiness addCustomerAdditionalPlaceOfBusiness(CustomerAdditionalPlaceOfBusiness customer);
		
		List<CustomerAdditionalPlaceOfBusiness> getCustomerAdditionalPlaceOfBusiness();

		CustomerAdditionalPlaceOfBusiness getCustomerAdditionalPlaceOfBusinessById(Long id);

	    void deleteCustomerAdditionalPlaceOfBusinessById(Long id);

	    CustomerAdditionalPlaceOfBusiness updatecCustomerAdditionalPlaceOfBusiness(CustomerAdditionalPlaceOfBusiness reg);
		
		
	
	
}
