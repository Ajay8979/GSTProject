package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.entity.CustomeStateSpecificInfo;

public interface CustomeStateSpecificInfoService {
	
	CustomeStateSpecificInfo addCustomeStateSpecificInfo(CustomeStateSpecificInfo customer);
	
	List<CustomeStateSpecificInfo> getAllCustomeStateSpecificInfo();

	CustomeStateSpecificInfo getCustomeStateSpecificInfoById(Long id);

    void deleteCustomeStateSpecificInfoById(Long id);

    CustomeStateSpecificInfo updatecCustomeStateSpecificInfo(CustomeStateSpecificInfo reg);
	
}
