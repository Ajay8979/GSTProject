package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerPersonalInformationDao;
import com.ojas.gst.entity.CustomerPersonalInformation;
import com.ojas.gst.service.CustomerPersonalInformationService;

public class CustomerPersonalInformationServiceImpl implements CustomerPersonalInformationService {
	@Autowired
	private CustomerPersonalInformationDao customerPersonalInformationDao;

	@Override
	public CustomerPersonalInformation addCustomerPersonalInformation(CustomerPersonalInformation customer) {
		// TODO Auto-generated method stub
		return customerPersonalInformationDao.save(customer);
	}

	@Override
	public List<CustomerPersonalInformation> getAllCustomerPersonalInformation() {
		// TODO Auto-generated method stub
		return customerPersonalInformationDao.findAll();
	}

	@Override
	public CustomerPersonalInformation CustomerCustomerPersonalInformationsById(Long id) {
		// TODO Auto-generated method stub
		return customerPersonalInformationDao.find(id);
	}

	@Override
	public void deleteCustomerPersonalInformationById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CustomerPersonalInformation updatecCustomerPersonalInformation(CustomerPersonalInformation reg) {
		// TODO Auto-generated method stub
		return customerPersonalInformationDao.save(reg);
	}

}
