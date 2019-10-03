package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerRegistration;
import com.ojas.gst.entity.CustomerTRN;

public interface CustomerRegistrationService {

	CustomerRegistration addCustome(CustomerRegistration customer);
	
	List<CustomerRegistration> getAllCustomerRegistrations();

	CustomerRegistration getCustomerRegistrationById(Long id);

    void deleteCustomerRegistrationById(Long id);


    CustomerRegistration updatecCustomerRegistration(CustomerRegistration reg);
	
    //boolean getCustomerRegistration1(String email,int otp);
    String getCustomerRegistration1(String email,int otp);
    
    CustomerTRN getCustomerTRNo(int id,String trnNo); 
	

}
