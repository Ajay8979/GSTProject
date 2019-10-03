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
public class CDNURAData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private Character flag;
	private String 	typ;
	private String 	ont_num;
	private String 	ont_dt;
	private Character	ntty;
	private String 	nt_num;
	private String 	nt_dt;
	private Character p_gst;
	private String 	inum;
	private String 	idt;
	private Double 	val;
	private Double	diff_percent;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cdnura_itms_id")
	private List<CDNURAItems> itms;
	public Character getFlag() {
		return flag;
	}
	public void setFlag(Character flag) {
		this.flag = flag;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getOnt_num() {
		return ont_num;
	}
	public void setOnt_num(String ont_num) {
		this.ont_num = ont_num;
	}
	public String getOnt_dt() {
		return ont_dt;
	}
	public void setOnt_dt(String ont_dt) {
		this.ont_dt = ont_dt;
	}
	public Character getNtty() {
		return ntty;
	}
	public void setNtty(Character ntty) {
		this.ntty = ntty;
	}
	public String getNt_num() {
		return nt_num;
	}
	public void setNt_num(String nt_num) {
		this.nt_num = nt_num;
	}
	public String getNt_dt() {
		return nt_dt;
	}
	public void setNt_dt(String nt_dt) {
		this.nt_dt = nt_dt;
	}
	public Character getP_gst() {
		return p_gst;
	}
	public void setP_gst(Character p_gst) {
		this.p_gst = p_gst;
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
	public Double getDiff_percent() {
		return diff_percent;
	}
	public void setDiff_percent(Double diff_percent) {
		this.diff_percent = diff_percent;
	}
	public List<CDNURAItems> getItms() {
		return itms;
	}
	public void setItms(List<CDNURAItems> itms) {
		this.itms = itms;
	}

	
}
