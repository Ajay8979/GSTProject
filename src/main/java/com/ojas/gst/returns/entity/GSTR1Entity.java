package com.ojas.gst.returns.entity;

import com.ojas.gst.entity.Entity;

public class GSTR1Entity implements Entity {
	private static final long serialVersionUID = 1L;
	private String gstin;
	private String ret_period;

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getRet_period() {
		return ret_period;
	}

	public void setRet_period(String ret_period) {
		this.ret_period = ret_period;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
