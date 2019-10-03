package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerPersonalInfoDao;
import com.ojas.gst.entity.CustomerPersonalInfo;
import com.ojas.gst.entity.CustomerRegistration;
import com.ojas.gst.service.CustomerPersonalInfoService;

public class CustomerPersonalInfoServiceImpl implements CustomerPersonalInfoService {

	@Autowired
	private CustomerPersonalInfoDao customerPersonalDao;

	@Override
	public CustomerPersonalInfo addCustomerInfo(CustomerPersonalInfo customer) {
		// TODO Auto-generated method stub
		return customerPersonalDao.save(customer);
	}

	@Override
	public List<CustomerPersonalInfo> getAllPersonalInfo() {

		return customerPersonalDao.findAll();
	}

	@Override
	public CustomerPersonalInfo getPersonalInfoById(Long id) {

		return customerPersonalDao.find(id);
	}

	/*
	 * @Override public void deletePersonalInfoById(Long id) { CustomerPersonalInfo
	 * find1=customerPersonalDao.find(id);
	 * 
	 * System.out.println(find1.toString()); find1.setStatus("InActive");
	 * 
	 * }
	 */

	@Override
	public CustomerPersonalInfo updatecCustomertPersonalInfo(CustomerPersonalInfo reg) {
		
		return customerPersonalDao.save(reg);
	}

}
