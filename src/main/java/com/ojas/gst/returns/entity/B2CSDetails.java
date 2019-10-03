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
public class B2CSDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Character flag;
	private String sply_ty;
	private String txval;
	private String	typ; 
	private String etin;
	private Double diff_percent;
	private String pos;
	private Double rt;
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
	public Character getFlag() {
		return flag;
	}
	public void setFlag(Character flag) {
		this.flag = flag;
	}
	public String getSply_ty() {
		return sply_ty;
	}
	public void setSply_ty(String sply_ty) {
		this.sply_ty = sply_ty;
	}
	public String getTxval() {
		return txval;
	}
	public void setTxval(String txval) {
		this.txval = txval;
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
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public Double getRt() {
		return rt;
	}
	public void setRt(Double rt) {
		this.rt = rt;
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
