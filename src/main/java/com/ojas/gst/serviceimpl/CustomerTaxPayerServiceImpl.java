package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerTaxPayerDao;
import com.ojas.gst.entity.CustomerTaxPayer;
import com.ojas.gst.service.CustomerTaxPayerService;

public class CustomerTaxPayerServiceImpl implements CustomerTaxPayerService{

	@SuppressWarnings("unused")
	@Autowired
	private CustomerTaxPayerDao cutomerTaxPayerDao;
	
	
	@Override
	public CustomerTaxPayer addCustomerTaxPayer(CustomerTaxPayer customer) {
		
		return cutomerTaxPayerDao.save(customer);
	}

	@Override
	public List<CustomerTaxPayer> getAllCustomerTaxPayers() {
		
		return cutomerTaxPayerDao.findAll();
	}

	@Override
	public CustomerTaxPayer getCustomerTaxPayerById(Long id) {
		
		return cutomerTaxPayerDao.find(id);
	}

}
