package com.ojas.gst.service;

import java.util.List;

import com.ojas.gst.dto.TaxPayersTypeDTO;
import com.ojas.gst.entity.TaxPayersType;

public interface TaxPayersTypeService {
	
	TaxPayersType createTaxPayersType(TaxPayersType taxPayersType);

	List<TaxPayersTypeDTO> getAllTaxPayersTypes();

	TaxPayersType getTaxPayersTypeById(Long taxPayersTypeId);

	int deleteTaxPayersTypeById(TaxPayersType category);

	//int updateTaxPayersType(TaxPayersType category);
	
	TaxPayersType updateTaxPayersType(TaxPayersType category);

}
