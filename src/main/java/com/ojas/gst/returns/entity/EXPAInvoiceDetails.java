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
public class EXPAInvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Character flag;
	private String chksum;
	
	public String getChksum() {
		return chksum;
	}
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}
	private String oinum;
	private String oidt;
	private String inum;
	private String idt;
	private Double val;
	private String sbpcode;
	private String sbnum;
	private String sbdt;
	private Double diff_percent;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "expa_itmdet_id")
	private List<EXPAItemDetails> itms;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Character getFlag() {
		return flag;
	}
	public void setFlag(Character flag) {
		this.flag = flag;
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
	public String getSbpcode() {
		return sbpcode;
	}
	public void setSbpcode(String sbpcode) {
		this.sbpcode = sbpcode;
	}
	public String getSbnum() {
		return sbnum;
	}
	public void setSbnum(String sbnum) {
		this.sbnum = sbnum;
	}
	public String getSbdt() {
		return sbdt;
	}
	public void setSbdt(String sbdt) {
		this.sbdt = sbdt;
	}
	public Double getDiff_percent() {
		return diff_percent;
	}
	public void setDiff_percent(Double diff_percent) {
		this.diff_percent = diff_percent;
	}
	public List<EXPAItemDetails> getItms() {
		return itms;
	}
	public void setItms(List<EXPAItemDetails> itms) {
		this.itms = itms;
	}

}
