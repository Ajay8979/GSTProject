package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.DistrictDao;
import com.ojas.gst.entity.District;
import com.ojas.gst.service.DistrictService;

public class DistrictServiceImpl implements DistrictService{
	
	@Autowired
	private DistrictDao districtDao;

	@Override
	public District createDistrict(District district) {
		return districtDao.save(district);
	}

	@Override
	public List<District> getAllDistricts() {
		return districtDao.getAllDistricts();
	}

	@Override
	public District getDistrictById(Long districtId) {
		return districtDao.find(districtId);
	}

	@Override
	public int  deleteDistrictById(District district) {
		return  districtDao.deleteById(district);
		
	}

	@Override
	public District updateDistrict(District district) {
		//return districtDao.updateDistrictById(district);
		return districtDao.save(district);
	}
	
	

}
