package com.ojas.gst.response;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TXPAItemDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Double rt;
	private Double ad_amt;
	private Double iamt;
	private Double camt;
	private Double samt;
	private Double csamt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getRt() {
		return rt;
	}
	public void setRt(Double rt) {
		this.rt = rt;
	}
	public Double getAd_amt() {
		return ad_amt;
	}
	public void setAd_amt(Double ad_amt) {
		this.ad_amt = ad_amt;
	}
	public Double getIamt() {
		return iamt;
	}
	public void setIamt(Double iamt) {
		this.iamt = iamt;
	}
	public Double getCamt() {
		return camt;
	}
	public void setCamt(Double camt) {
		this.camt = camt;
	}
	public Double getSamt() {
		return samt;
	}
	public void setSamt(Double samt) {
		this.samt = samt;
	}
	public Double getCsamt() {
		return csamt;
	}
	public void setCsamt(Double csamt) {
		this.csamt = csamt;
	}


}
