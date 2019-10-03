package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerPersonalInformation;

public interface CustomerPersonalInformationService {
	CustomerPersonalInformation addCustomerPersonalInformation(CustomerPersonalInformation customer);
	
	List<CustomerPersonalInformation> getAllCustomerPersonalInformation();

	CustomerPersonalInformation CustomerCustomerPersonalInformationsById(Long id);

    void deleteCustomerPersonalInformationById(Long id);

    CustomerPersonalInformation updatecCustomerPersonalInformation(CustomerPersonalInformation reg);
	

}
