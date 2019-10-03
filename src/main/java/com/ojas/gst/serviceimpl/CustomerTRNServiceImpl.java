package com.ojas.gst.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerTRNDao;
import com.ojas.gst.entity.CustomerTRN;
import com.ojas.gst.service.CustomerTRNService;

public class CustomerTRNServiceImpl implements CustomerTRNService {

	@Autowired
	private CustomerTRNDao customerTRNDao;


//	public static StringBuffer randomNumber() {
//		long number = 0l;
//		Random rand = new Random();
//		CustomerTRN customerTRN = new CustomerTRN();
//		number = (rand.nextInt(1000000) + 1000000000l)*(rand.nextInt(900) + 100);
//		StringBuffer str = new StringBuffer("TRN");
//		str.insert(0, number);
//		System.out.print("After insertion = ");
//		System.out.println(str.toString());
//		customerTRN.setTrnNo(str);
//		return str;
//	}
	@Override
	public CustomerTRN addTRN(CustomerTRN customerTRN) {
		
		return customerTRNDao.save(customerTRN);
		
	}
}
