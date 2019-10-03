package com.ojas.gst.returns.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class B2CLInvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
//	private Character flag;
	private String inum;
	private String idt;
	private Double val;
	private String inv_typ;
	private String etin;
	
	private Double diff_percent;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2cl_itms_id")
	private List<B2ClItems> itms;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInum() {
		return inum;
	}
	public void setInum(String inum) {
		this.inum = inum;
	}
	public String getIdt() {
		return idt;
	}
	public void setIdt(String idt) {
		this.idt = idt;
	}
	public Double getVal() {
		return val;
	}
	public void setVal(Double val) {
		this.val = val;
	}
	public String getEtin() {
		return etin;
	}
	public void setEtin(String etin) {
		this.etin = etin;
	}
	public String getInv_typ() {
		return inv_typ;
	}
	public void setInv_typ(String inv_typ) {
		this.inv_typ = inv_typ;
	}
	public Double getDiff_percent() {
		return diff_percent;
	}
	public void setDiff_percent(Double diff_percent) {
		this.diff_percent = diff_percent;
	}
	public List<B2ClItems> getItms() {
		return itms;
	}
	public void setItms(List<B2ClItems> itms) {
		this.itms = itms;
	}
	
	

}
