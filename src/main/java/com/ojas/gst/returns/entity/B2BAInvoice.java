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
public class B2BAInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ctin;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "b2ba_inv_id")
	private List<B2BAInvoiceDetails> inv;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCtin() {
		return ctin;
	}

	public void setCtin(String ctin) {
		this.ctin = ctin;
	}

	public List<B2BAInvoiceDetails> getInv() {
		return inv;
	}

	public void setInv(List<B2BAInvoiceDetails> inv) {
		this.inv = inv;
	}

}
