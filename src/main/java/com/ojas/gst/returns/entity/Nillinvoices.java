package com.ojas.gst.returns.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Nillinvoices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Double nil_amt;
	private Double expt_amt;
	private Double ngsup_amt;

	private String sply_ty;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getNil_amt() {
		return nil_amt;
	}

	public void setNil_amt(Double nil_amt) {
		this.nil_amt = nil_amt;
	}

	public Double getExpt_amt() {
		return expt_amt;
	}

	public void setExpt_amt(Double expt_amt) {
		this.expt_amt = expt_amt;
	}

	public Double getNgsup_amt() {
		return ngsup_amt;
	}

	public void setNgsup_amt(Double ngsup_amt) {
		this.ngsup_amt = ngsup_amt;
	}

	public String getSply_ty() {
		return sply_ty;
	}

	public void setSply_ty(String sply_ty) {
		this.sply_ty = sply_ty;
	}

}
