package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerPlaceDao;
import com.ojas.gst.entity.CustomerPlace;
import com.ojas.gst.service.CustomerPlaceService;

public class CustomerPlaceServiceImpl implements CustomerPlaceService{
	@Autowired
	private CustomerPlaceDao customrPlaceDao;

	@Override
	public CustomerPlace addCustomerPlace(CustomerPlace customer) {
		// TODO Auto-generated method stub
		return customrPlaceDao.save(customer);
	}

	@Override
	public List<CustomerPlace> getAllCustomerPlace() {
		// TODO Auto-generated method stub
		return customrPlaceDao.findAll();
	}

	@Override
	public CustomerPlace getCustomerPlaceById(Long id) {
		// TODO Auto-generated method stub
		return customrPlaceDao.find(id);
	}

	@Override
	public void deleteCustomerPlacenById(Long id) {
		// TODO Auto-generated method stub
		customrPlaceDao.delete(id);
	}

	@Override
	public CustomerPlace updatecCustomerPlace(CustomerPlace reg) {
		// TODO Auto-generated method stub
		return null;
	}

}
