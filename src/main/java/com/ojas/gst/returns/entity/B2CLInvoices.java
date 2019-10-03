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
public class B2CLInvoices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String pos; 
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2cl_invdet_id")
	private List<B2CLInvoiceDetails> inv;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public List<B2CLInvoiceDetails> getInv() {
		return inv;
	}
	public void setInv(List<B2CLInvoiceDetails> inv) {
		this.inv = inv;
	}
	
	
	


}
