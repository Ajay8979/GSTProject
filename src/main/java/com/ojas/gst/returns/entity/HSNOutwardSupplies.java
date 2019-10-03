package com.ojas.gst.returns.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HSNOutwardSupplies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer num;
	private String hsn_sc;
	@Column(name="description")
	private String desc;
	private String uqc;
	private Double qty;
	@Column(name="value")
	private Double val;
	private Double txval;
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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	

	public String getHsn_sc() {
		return hsn_sc;
	}

	public void setHsn_sc(String hsn_sc) {
		this.hsn_sc = hsn_sc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUqc() {
		return uqc;
	}

	public void setUqc(String uqc) {
		this.uqc = uqc;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getVal() {
		return val;
	}

	public void setVal(Double val) {
		this.val = val;
	}

	public Double getTxval() {
		return txval;
	}

	public void setTxval(Double txval) {
		this.txval = txval;
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
