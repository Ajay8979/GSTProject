package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomerDetailsOfGoodsDao;
import com.ojas.gst.entity.CustomerDetailsOfGoods;
import com.ojas.gst.service.CustomerDetailsOfGoodsService;

public class CustomerDetailsOfGoodsServiceImpl implements CustomerDetailsOfGoodsService{
	@Autowired
	private CustomerDetailsOfGoodsDao customerDetailsOfGoodsDao;

	@Override
	public CustomerDetailsOfGoods addCustomerDetailsOfGoods(CustomerDetailsOfGoods customer) {
		// TODO Auto-generated method stub
		return customerDetailsOfGoodsDao.save(customer);
	}

	@Override
	public List<CustomerDetailsOfGoods> getAllCustomerDetailsOfGoods() {
		// TODO Auto-generated method stub
		return customerDetailsOfGoodsDao.findAll();
	}

	@Override
	public CustomerDetailsOfGoods CustomerDetailsOfGoodsById(Long id) {
		
		return customerDetailsOfGoodsDao.find(id);
	}

	@Override
	public void deleteCustomerBusinessDetailsById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDetailsOfGoods updatecCustomerDetailsOfGoods(CustomerDetailsOfGoods reg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDetailsOfGoods findCustomerDetailsOfGoodsByName(String goodname) {
		// TODO Auto-generated method stub
		return customerDetailsOfGoodsDao.findByName(goodname);
	}


	
	



}
