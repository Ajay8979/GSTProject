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
public class ItemDetails {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer rt;
	
	private Integer txval;
	
	private Integer iamt;
	
	
	private Integer csamt;




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getRt() {
		return rt;
	}


	public void setRt(Integer rt) {
		this.rt = rt;
	}


	public Integer getTxval() {
		return txval;
	}


	public void setTxval(Integer txval) {
		this.txval = txval;
	}


	public Integer getIamt() {
		return iamt;
	}


	public void setIamt(Integer iamt) {
		this.iamt = iamt;
	}


	public Integer getCsamt() {
		return csamt;
	}


	public void setCsamt(Integer csamt) {
		this.csamt = csamt;
	}


	



	
//	private Double sGSTAmountAsPerInVoice;
//	private Double cessAmountAsPerInVoice;

}
