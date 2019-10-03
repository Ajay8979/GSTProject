package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.CustomeStateSpecificInfoDao;
import com.ojas.gst.entity.CustomeStateSpecificInfo;
import com.ojas.gst.service.CustomeStateSpecificInfoService;

public class CustomeStateSpecificInfoServiceImpl implements CustomeStateSpecificInfoService {

	@Autowired
private	CustomeStateSpecificInfoDao customeStateSpecificInfoDao;

	@Override
	public CustomeStateSpecificInfo addCustomeStateSpecificInfo(CustomeStateSpecificInfo customer) {
		// TODO Auto-generated method stub
		return customeStateSpecificInfoDao.save(customer);
	}

	@Override
	public List<CustomeStateSpecificInfo> getAllCustomeStateSpecificInfo() {
		// TODO Auto-generated method stub
		return customeStateSpecificInfoDao.findAll();
	}

	@Override
	public CustomeStateSpecificInfo getCustomeStateSpecificInfoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomeStateSpecificInfoById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CustomeStateSpecificInfo updatecCustomeStateSpecificInfo(CustomeStateSpecificInfo reg) {
		// TODO Auto-generated method stub
		return null;
	}

}
