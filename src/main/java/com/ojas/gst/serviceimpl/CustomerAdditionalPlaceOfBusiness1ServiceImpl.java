package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerAdditionalPlaceOfBusiness1Dao;
import com.ojas.gst.entity.CustomerAdditionalPlaceOfBusiness1;
import com.ojas.gst.service.CustomerAdditionalPlaceOfBusiness1Service;

public class CustomerAdditionalPlaceOfBusiness1ServiceImpl implements CustomerAdditionalPlaceOfBusiness1Service{
   @Autowired	
	private CustomerAdditionalPlaceOfBusiness1Dao customerAdditionalPlaceOfBusiness1Dao;

	@Override
	public CustomerAdditionalPlaceOfBusiness1 addCustomerAdditionalPlaceOfBusiness1(
			CustomerAdditionalPlaceOfBusiness1 customer) {
		// TODO Auto-generated method stub
		return customerAdditionalPlaceOfBusiness1Dao.save(customer);
	}

	@Override
	public List<CustomerAdditionalPlaceOfBusiness1> getAllCustomerAdditionalPlaceOfBusiness1() {
		// TODO Auto-generated method stub
		return customerAdditionalPlaceOfBusiness1Dao.findAll();
	}

	@Override
	public CustomerAdditionalPlaceOfBusiness1 getCustomerAdditionalPlaceOfBusiness1ById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerAdditionalPlaceOfBusiness1ById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerAdditionalPlaceOfBusiness1 updatecCustomerAdditionalPlaceOfBusiness1(
			CustomerAdditionalPlaceOfBusiness1 reg) {
		// TODO Auto-generated method stub
		return null;
	}

}
