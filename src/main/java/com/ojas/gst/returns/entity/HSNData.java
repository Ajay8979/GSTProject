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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HSNData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer id;
	private String flag;
	private String chk_sum;
	
	public String getChk_sum() {
		return chk_sum;
	}
	public void setChk_sum(String chk_sum) {
		this.chk_sum = chk_sum;
	}
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "hsn_data_id")
	private List<HSNOutwardSupplies> data ;
	public List<HSNOutwardSupplies> getData() {
		return data;
	}
	public void setData(List<HSNOutwardSupplies> data) {
		this.data = data;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	

}
