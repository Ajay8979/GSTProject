package com.ojas.gst.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerRegistrationDao;
import com.ojas.gst.entity.CustomerRegistration;
import com.ojas.gst.entity.CustomerTRN;
import com.ojas.gst.service.CustomerRegistrationService;

public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {
	@Autowired
	private CustomerRegistrationDao customerRegistrationDao;

	@Override
	public CustomerRegistration addCustome(CustomerRegistration customer) {

		return customerRegistrationDao.save(customer);
	}

	@Override
	public List<CustomerRegistration> getAllCustomerRegistrations() {

		return customerRegistrationDao.findAll();
	}

	@Override
	public void deleteCustomerRegistrationById(Long id) {
		CustomerRegistration find = customerRegistrationDao.find(id);
		System.out.println(find.toString());
		find.setStatus("InActive");
	}

	@Override
	public CustomerRegistration updatecCustomerRegistration(CustomerRegistration reg) {

		return customerRegistrationDao.save(reg);
	}

	@Override
	public CustomerRegistration getCustomerRegistrationById(Long id) {

		return customerRegistrationDao.find(id);
	}
	/*
	 * public CustomerRegistration getCustomerRegistration1(String email, int otp) {
	 * 
	 * return customerRegistrationDao.getCustomerRegistration1(otp); }
	 */

	/*
	 * @Override public boolean getCustomerRegistration1(String email,int otp) {
	 * 
	 * return customerRegistrationDao.getCustomerRegistration1(email, otp); }
	 */

	@Override
	public String getCustomerRegistration1(String email, int otp) {

		return customerRegistrationDao.getCustomerRegistration1(email, otp);
	}

	@Override
	public CustomerTRN getCustomerTRNo(int id,String trnNo) {
		return customerRegistrationDao.getCustomerTRN(id, trnNo);
	}

}
