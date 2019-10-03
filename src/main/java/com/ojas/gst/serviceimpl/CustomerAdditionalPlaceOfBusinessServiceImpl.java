package com.ojas.gst.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerAdditionalPlaceOfBusinessDao;
import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness;
import com.ojas.gst.service.CustomerAdditionalPlaceOfBusinessService;

public class CustomerAdditionalPlaceOfBusinessServiceImpl implements CustomerAdditionalPlaceOfBusinessService {

	@Autowired

	private CustomerAdditionalPlaceOfBusinessDao CustomerAdditionalPlaceOfBusinessDao;

	@Override
	public CustomerAdditionalPlaceOfBusiness addCustomerAdditionalPlaceOfBusiness(
			CustomerAdditionalPlaceOfBusiness customer) {
		// TODO Auto-generated method stub
		return CustomerAdditionalPlaceOfBusinessDao.save(customer);
	}

	@Override
	public List<CustomerAdditionalPlaceOfBusiness> getCustomerAdditionalPlaceOfBusiness() {
		// TODO Auto-generated method stub
		return CustomerAdditionalPlaceOfBusinessDao.findAll();
	}

	@Override
	public CustomerAdditionalPlaceOfBusiness getCustomerAdditionalPlaceOfBusinessById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerAdditionalPlaceOfBusinessById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CustomerAdditionalPlaceOfBusiness updatecCustomerAdditionalPlaceOfBusiness(
			CustomerAdditionalPlaceOfBusiness reg) {
		// TODO Auto-generated method stub
		return null;
	}

}
