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
public class B2BAInvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String chksum;
	private String oinum;
	private String oidt;
	private String inum;

//	private Character taxPayerAction;
//	@Size(max = 64)
//	private String inVoiceCheckSumValue;
//	@Size(max = 16)
//	private String supplierInvoiceNumber;

	private String idt;

	private Double val;

	private String pos;

	private Character rchrg;

	private String etin;

	private String inv_typ;

	private Double diff_percent;

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2ba_itm_id" )
	private List<B2BAItems> itms;

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

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public Character getRchrg() {
		return rchrg;
	}

	public void setRchrg(Character rchrg) {
		this.rchrg = rchrg;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getChksum() {
		return chksum;
	}

	public void setChksum(String chksum) {
		this.chksum = chksum;
	}

	public String getOinum() {
		return oinum;
	}

	public void setOinum(String oinum) {
		this.oinum = oinum;
	}

	public String getOidt() {
		return oidt;
	}

	public void setOidt(String oidt) {
		this.oidt = oidt;
	}

	public List<B2BAItems> getItms() {
		return itms;
	}

	public void setItms(List<B2BAItems> itms) {
		this.itms = itms;
	}

	

}
