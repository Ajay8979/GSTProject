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
public class TXPAData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer id;
//	private String flag;
	private String omon;
	private String pos;
	private String sply_ty;
	private Double diff_percent;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="txpa_itm_id")
	private List<TXPAItemDetails> itms;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
//	public String getFlag() {
//		return flag;
//	}
//	public void setFlag(String flag) {
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
	public Double getDiff_percent() {
		return diff_percent;
	}
	public void setDiff_percent(Double diff_percent) {
		this.diff_percent = diff_percent;
	}
	public List<TXPAItemDetails> getItms() {
		return itms;
	}
	public void setItms(List<TXPAItemDetails> itms) {
		this.itms = itms;
	}
	

	
}
