
package com.ojas.gst.dao;

import com.ojas.gst.entity.CustomerRegistration;

public interface CustomerRegistrationDao extends Dao<CustomerRegistration, Long> {
	/*
	 * List<District> getAllDistricts();
	 * 
	 * int deleteById(CustomerRegistration reg);
	 * 
	 * int updateDistrictById(District district);
	 */

	/* boolean getCustomerRegistration1(String email, int otp); */
	String getCustomerRegistration1(String email, int otp);
	
	 String verifyTRNNo(String email,String trnNo); 
	
	 //public String verifyTRNNo(Long id, String trnNo);

	//CustomerTRN getCustomerTRN(int id, String trnNo);

	//CustomerTRN getCustomerTRN(int id, String trnNo);	
	 
	  /*checking*/
	// public CustomerTRN verifyTRNNo1(String email, String trnNo); 
	 
	 
	 
	 
	 

}
