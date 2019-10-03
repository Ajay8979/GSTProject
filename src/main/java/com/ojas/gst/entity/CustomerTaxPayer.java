package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@SuppressWarnings("serial")
@Entity
@Table(name = "taxpayer_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerTaxPayer implements com.ojas.gst.entity.Entity{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String taxPayer;
	private String taxDeductor;
	private String taxCollector;
	private String gstPartioner;
	private String unitedNationBody;
	
	public CustomerTaxPayer() {
		super();
	}
	public String getTaxPayer() {
		return taxPayer;
	}
	public void setTaxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
	}
	public String getTaxDeductor() {
		return taxDeductor;
	}
	public void setTaxDeductor(String taxDeductor) {
		this.taxDeductor = taxDeductor;
	}
	public String getTaxCollector() {
		return taxCollector;
	}
	public void setTaxCollector(String taxCollector) {
		this.taxCollector = taxCollector;
	}
	public String getGstPartioner() {
		return gstPartioner;
	}
	public void setGstPartioner(String gstPartioner) {
		this.gstPartioner = gstPartioner;
	}
	public String getUnitedNationBody() {
		return unitedNationBody;
	}
	public void setUnitedNationBody(String unitedNationBody) {
		this.unitedNationBody = unitedNationBody;
	}

	
	
	
	
	
	
	
}
