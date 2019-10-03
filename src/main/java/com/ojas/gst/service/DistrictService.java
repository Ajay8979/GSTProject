package com.ojas.gst.service;

import java.util.List;


import com.ojas.gst.entity.District;


public interface DistrictService {
	
	District createDistrict(District district);

	List<District> getAllDistricts();

	District getDistrictById(Long district);

	int deleteDistrictById(District district);

	District updateDistrict(District district);

}
