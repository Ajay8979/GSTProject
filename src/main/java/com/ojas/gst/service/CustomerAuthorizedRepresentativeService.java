package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerAuthorizedRepresentative;

public interface CustomerAuthorizedRepresentativeService {
	 CustomerAuthorizedRepresentative addAuthorizedRepresentative(CustomerAuthorizedRepresentative customer);
	    
	    List<CustomerAuthorizedRepresentative> getAllAuthorizedRepresentative();

	 

	    CustomerAuthorizedRepresentative getDistrictById(Long id);

	 

	    void deleteAuthorizedRepresentativeById(CustomerAuthorizedRepresentative reg);

	 

	    CustomerAuthorizedRepresentative updatecAuthorizedRepresentative(CustomerAuthorizedRepresentative reg);

	 

}
