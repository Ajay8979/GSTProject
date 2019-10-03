package com.ojas.gst.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerAuthorizedRepresentativeDao;
import com.ojas.gst.entity.CustomerAuthorizedRepresentative;
import com.ojas.gst.service.CustomerAuthorizedRepresentativeService;

public class CustomerAuthorizedRepresentativeServiceImpl implements CustomerAuthorizedRepresentativeService{
	@Autowired
	private CustomerAuthorizedRepresentativeDao customerAuthorizedRepresentativeDao;

	@Override
	public CustomerAuthorizedRepresentative addAuthorizedRepresentative(CustomerAuthorizedRepresentative customer) {
		// TODO Auto-generated method stub
		return customerAuthorizedRepresentativeDao.save(customer);
	}

	@Override
	public List<CustomerAuthorizedRepresentative> getAllAuthorizedRepresentative() {
		// TODO Auto-generated method stub
		return customerAuthorizedRepresentativeDao.findAll();
	}

	@Override
	public CustomerAuthorizedRepresentative getDistrictById(Long id) {
		// TODO Auto-generated method stub
		return customerAuthorizedRepresentativeDao.find(id);
	}

	@Override
	public void deleteAuthorizedRepresentativeById(CustomerAuthorizedRepresentative reg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerAuthorizedRepresentative updatecAuthorizedRepresentative(CustomerAuthorizedRepresentative reg) {
		// TODO Auto-generated method stub
		return customerAuthorizedRepresentativeDao.save(reg);
	}

}
