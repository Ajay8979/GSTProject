package com.ojas.gst.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojas.gst.dao.TaxPayersTypeDao;
import com.ojas.gst.dto.TaxPayersTypeDTO;
import com.ojas.gst.entity.TaxPayersType;
import com.ojas.gst.service.TaxPayersTypeService;

public class TaxPayersTypeServiceImpl implements TaxPayersTypeService{
	
	@Autowired
	private TaxPayersTypeDao taxPayersTypeDao;

	@Override
	public TaxPayersType createTaxPayersType(TaxPayersType taxPayersType) {
		return taxPayersTypeDao.save(taxPayersType);
	}

	@Override
	public List<TaxPayersTypeDTO> getAllTaxPayersTypes() {
		return taxPayersTypeDao.getAllTaxPayersTypes();
	}

	@Override
	public TaxPayersType getTaxPayersTypeById(Long taxPayersTypeId) {
		return taxPayersTypeDao.find(taxPayersTypeId);
	}

	@Override
	public int deleteTaxPayersTypeById(TaxPayersType taxPayersType) {
		return taxPayersTypeDao.deleteById(taxPayersType);
	}

	@Override
	public TaxPayersType updateTaxPayersType(TaxPayersType taxPayersType) {
		//return taxPayersTypeDao.updateTaxPayersTypeById(taxPayersType);
		return taxPayersTypeDao.save(taxPayersType);
	}

}
