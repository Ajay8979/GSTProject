package com.ojas.gst.returns.entity;

import java.util.List;

public class TXPADataResponse {

	private  List<TXPAData> txpda;
	private String chksum;

	public String getChksum() {
		return chksum;
	}

	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	public List<TXPAData> getTxpda() {
		return txpda;
	}

	public void setTxpda(List<TXPAData> txpda) {
		this.txpda = txpda;
	}
	
}
