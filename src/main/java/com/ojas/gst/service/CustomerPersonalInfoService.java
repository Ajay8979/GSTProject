package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerPersonalInfo;

public interface CustomerPersonalInfoService {

	
	CustomerPersonalInfo addCustomerInfo(CustomerPersonalInfo customer);
	
	List<CustomerPersonalInfo> getAllPersonalInfo();

	CustomerPersonalInfo getPersonalInfoById(Long id);

   // void deletePersonalInfoById(Long id);

    CustomerPersonalInfo updatecCustomertPersonalInfo(CustomerPersonalInfo reg);
	
	
}
