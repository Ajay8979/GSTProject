package com.ojas.gst.dao;

import com.ojas.gst.entity.CustomerDetailsOfGoods;

public interface CustomerDetailsOfGoodsDao extends Dao<CustomerDetailsOfGoods, Long>{
	
	 CustomerDetailsOfGoods findByName(String jeans);
}
