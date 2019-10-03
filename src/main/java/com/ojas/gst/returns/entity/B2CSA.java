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
public class B2CSA {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
//	private Character flag;
	private String omon;

	
	private String sply_ty;
	private Double diff_percent;
	private String typ; 
	private String etin;
	private String pos;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="b2csa_itm_id")
	private List<B2CSAItemsDetails> itms;
	
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//	public Character getFlag() {
//		return flag;
//	}
//	public void setFlag(Character flag) {
//		this.flag = flag;
//	}
	public String getOmon() {
		return omon;
	}
	public void setOmon(String omon) {
		this.omon = omon;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getSply_ty() {
		return sply_ty;
	}
	public void setSply_ty(String sply_ty) {
		this.sply_ty = sply_ty;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getEtin() {
		return etin;
	}
	public void setEtin(String etin) {
		this.etin = etin;
	}
	public Double getDiff_percent() {
		return diff_percent;
	}
	public void setDiff_percent(Double diff_percent) {
		this.diff_percent = diff_percent;
	}
	public List<B2CSAItemsDetails> getItms() {
		return itms;
	}
	public void setItms(List<B2CSAItemsDetails> itms) {
		this.itms = itms;
	}
	

}
