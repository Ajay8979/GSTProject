package com.ojas.gst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.gst.dao.GstrDao;
import com.ojas.gst.returns.entity.B2BAResponse;
import com.ojas.gst.returns.entity.B2BResponse;
import com.ojas.gst.returns.entity.B2CLAResponse;
import com.ojas.gst.returns.entity.B2CLResponse;
import com.ojas.gst.returns.entity.B2CSAResponse;
import com.ojas.gst.returns.entity.B2CSResponse;
import com.ojas.gst.returns.entity.CDNRAResponse;
import com.ojas.gst.returns.entity.CDNRResponse;
import com.ojas.gst.returns.entity.CDNURAResponse;
import com.ojas.gst.returns.entity.CDNURResponse;
import com.ojas.gst.returns.entity.DocResponse;
import com.ojas.gst.returns.entity.EXPAResponse;
import com.ojas.gst.returns.entity.EXPResponse;
import com.ojas.gst.returns.entity.Gstr1Request;
import com.ojas.gst.returns.entity.HSNResponse;
import com.ojas.gst.returns.entity.NilResponse;
import com.ojas.gst.returns.entity.RefferenceId;
import com.ojas.gst.returns.entity.TXPADataResponse;
import com.ojas.gst.returns.entity.TXPResponse;

public class GSTR1ServiceImpl implements GSTRService{
	
	@Autowired
	public GstrDao daoImpl;
	
	@Override
	public  Gstr1Request save(Gstr1Request gstr1Request) {
		
		return daoImpl.save(gstr1Request);
		 
		
		
	}

	@Override
	public RefferenceId getGSTRByGSTIN(String gstin,String ret_period) 
		 {
			RefferenceId refferenceId = daoImpl.findByGstinAndRet_period(gstin,ret_period);
			if(null != refferenceId) {
				return refferenceId;
			}
			return null;
		}
	@Transactional
	@Override
	public TXPADataResponse getGSTR1TxpdaDataByGSTIn(String gstin,String ret_period) {
		
		return daoImpl.getGSTR1TxpdaDataByGSTIn(gstin,ret_period);
	}

	@Override
	public Gstr1Request getGSTR1details(String gstin, String ret_period) {
		
		return daoImpl.getGSTR1data(gstin,ret_period);
	}

	@Override
	public TXPResponse getGSTR1TxpaDataByGSTIn(String gstin, String ret_period) {
		return daoImpl.getGSTR1TxpaDataByGSTIn(gstin,ret_period);
	}

	@Override
	public NilResponse getGSTR1nil(String gstin, String ret_period) {
		return daoImpl.getGSTR1nil(gstin, ret_period);
	}

	@Override
	public HSNResponse getGSTR1hsn(String gstin, String ret_period) {
		return daoImpl.getGSTR1hsn(gstin, ret_period);
	}

	@Override
	public EXPAResponse getGSTR1Expa(String gstin, String ret_period) {
		
		return daoImpl.getGSTR1Expa(gstin, ret_period);
	}

	@Override
	public EXPResponse getGSTR1Exp(String gstin, String ret_period) {
		return daoImpl.getGSTR1Exp(gstin, ret_period);
	}

	@Override
	public DocResponse getGSTR1Doc(String gstin, String ret_period) {
		return daoImpl.getGSTR1Doc(gstin, ret_period);
				
	}

	@Override
	public CDNURAResponse getGSTR1CDNURA(String gstin, String ret_period) {
		return daoImpl.getGSTR1CDNURA(gstin, ret_period);
	}

	@Override
	public CDNURResponse getGSTR1CDNUR(String gstin, String ret_period) {
		return daoImpl.getGSTR1CDNUR(gstin, ret_period);
	}

	@Override
	public CDNRAResponse getGSTR1CDNRA(String gstin, String ret_period) {
		return daoImpl.getGSTR1CDNRA(gstin, ret_period);
	}

	@Override
	public CDNRResponse getGSTR1CDNR(String gstin, String ret_period) {
		
		return daoImpl.getGSTR1CDNR(gstin, ret_period);
	}

	@Override
	public B2CSAResponse getGSTR1B2CSA(String gstin, String ret_period) {
		
		return daoImpl.getGSTR1B2CSA(gstin, ret_period);
	}

	@Override
	public B2CSResponse getGSTR1B2CS(String gstin, String ret_period) {
		return daoImpl.getGSTR1B2CS(gstin, ret_period);
	}

	@Override
	public B2CLAResponse getGSTR1B2CLA(String gstin, String ret_period) {
		return daoImpl.getGSTR1B2CLA(gstin, ret_period);
	}

	@Override
	public B2CLResponse getGSTR1B2CL(String gstin, String ret_period) {
		return daoImpl.getGSTR1B2CL(gstin, ret_period);
	}

	@Override
	public B2BAResponse getGSTR1B2BA(String gstin, String ret_period) {
		return daoImpl.getGSTR1B2BA(gstin, ret_period);
	}

	@Override
	public B2BResponse getGSTR1B2B(String gstin, String ret_period) {
		return daoImpl.getGSTR1B2B(gstin, ret_period);
	}
	}


