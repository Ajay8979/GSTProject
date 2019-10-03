package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerBusinessDetailsDao;
import com.ojas.gst.entity.CustomerBusinessDetails;
import com.ojas.gst.service.CustomerBusinessDetailsService;

public class CustomerBusinessDetailServiceImpl implements CustomerBusinessDetailsService{
	@Autowired
	private CustomerBusinessDetailsDao customerBusinessDetailDao;

	@Override
	public CustomerBusinessDetails addCustomerBusinessDetails(CustomerBusinessDetails customer) {
		// TODO Auto-generated method stub
		return customerBusinessDetailDao.save(customer);
	}

	@Override
	public List<CustomerBusinessDetails> getAllCustomerBusinessDetails() {
		// TODO Auto-generated method stub
		return customerBusinessDetailDao.findAll();
	}

	@Override
	public CustomerBusinessDetails getCustomerBusinessDetailsById(Long id) {
		
		return customerBusinessDetailDao.find(id);
	}

	@Override
	public void deleteCustomerBusinessDetailsById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerBusinessDetails updatecCustomerBusinessDetails(CustomerBusinessDetails reg) {
		// TODO Auto-generated method stub
		return customerBusinessDetailDao.save(reg);
	}

	
	
}
