package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerBankAccountDetailsDao;
import com.ojas.gst.entity.CustomerBankAccountDetails;
import com.ojas.gst.service.CustomerBankAccountDetailsService;

public class CustomerBankAccountDetailsServiceImpl implements CustomerBankAccountDetailsService {
	@Autowired
	private CustomerBankAccountDetailsDao customerBankAccountDetailsDao;

	@Override
	public CustomerBankAccountDetails addCustomerBankAccountDetails(CustomerBankAccountDetails customer) {
		return customerBankAccountDetailsDao.save(customer);
	}

	@Override
	public List<CustomerBankAccountDetails> getAllCustomerBankAccountDetails() {
		return customerBankAccountDetailsDao.findAll();
	}

	@Override
	public CustomerBankAccountDetails getCustomerBankAccountDetailsById(Long id) {
		return customerBankAccountDetailsDao.find(id);
	}

	@Override
	public void deleteCustomerBankAccountDetailsById(Long id) {
		customerBankAccountDetailsDao.delete(id);
	}

	@Override
	public CustomerBankAccountDetails updatecCustomerBankAccountDetails(CustomerBankAccountDetails reg) {
		return customerBankAccountDetailsDao.save(reg);
	}

}
