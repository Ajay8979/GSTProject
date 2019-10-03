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
public class EXPInvoiceDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Character flag;
	private String inum;
	private String idt;
	private String val;
	private String sbpcode;
	private String sbnum;
	private String sbdt;
	private String diff_percent;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "expa_invdet_id")
	private List<EXPItemDetails> itms;
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
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
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
	public String getDiff_percent() {
		return diff_percent;
	}
	public void setDiff_percent(String diff_percent) {
		this.diff_percent = diff_percent;
	}
	public List<EXPItemDetails> getItms() {
		return itms;
	}
	public void setItms(List<EXPItemDetails> itms) {
		this.itms = itms;
	}

}
