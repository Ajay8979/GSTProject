package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerPlaceOfBusinessDao;
import com.ojas.gst.entity.CustomerPlaceOfBusiness;
import com.ojas.gst.service.CustomerPlaceOfBusinessService;

public class CustomerPlaceOfBusinessServiceImpl implements CustomerPlaceOfBusinessService{
	@Autowired
	private CustomerPlaceOfBusinessDao customerPlaceOfBusinessDao;

	@Override
	public CustomerPlaceOfBusiness addCustomerPlaceOfBusiness(CustomerPlaceOfBusiness customer) {
		
		return customerPlaceOfBusinessDao.save(customer);
	}

	@Override
	public List<CustomerPlaceOfBusiness> getAllCustomerPlaceOfBusiness() {
		// TODO Auto-generated method stub
		return customerPlaceOfBusinessDao.findAll();
	}

	@Override
	public CustomerPlaceOfBusiness getCustomerPlaceOfBusinessById(Long id) {
		// TODO Auto-generated method stub
		return customerPlaceOfBusinessDao.find(id);
	}

	@Override
	public void deleteCustomerPlaceOfBusinessById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerPlaceOfBusiness updatecCustomerPlaceOfBusiness(CustomerPlaceOfBusiness reg) {
		// TODO Auto-generated method stub
		return customerPlaceOfBusinessDao.save(reg);
	}


}
