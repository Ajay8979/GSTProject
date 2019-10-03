package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomerDetailsOfGoods;

public interface CustomerDetailsOfGoodsService {
	CustomerDetailsOfGoods addCustomerDetailsOfGoods(CustomerDetailsOfGoods customer);

	List<CustomerDetailsOfGoods> getAllCustomerDetailsOfGoods();

	CustomerDetailsOfGoods CustomerDetailsOfGoodsById(Long id);

	void deleteCustomerBusinessDetailsById(Long id);

	CustomerDetailsOfGoods updatecCustomerDetailsOfGoods(CustomerDetailsOfGoods reg);

	CustomerDetailsOfGoods findCustomerDetailsOfGoodsByName(String goodname);
}
