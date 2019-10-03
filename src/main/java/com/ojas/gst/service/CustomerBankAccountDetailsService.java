package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerBankAccountDetails;

public interface CustomerBankAccountDetailsService {

	CustomerBankAccountDetails addCustomerBankAccountDetails(CustomerBankAccountDetails customer);

	List<CustomerBankAccountDetails> getAllCustomerBankAccountDetails();

	CustomerBankAccountDetails getCustomerBankAccountDetailsById(Long id);

	void deleteCustomerBankAccountDetailsById(Long id);

	CustomerBankAccountDetails updatecCustomerBankAccountDetails(CustomerBankAccountDetails reg);
	
}
