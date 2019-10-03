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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class B2BInvoices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	@JsonProperty(value = "id")
	private Integer id;
	private String ctin;

	// @OneToMany

	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="b2b_inv_id")
	private List<InvoiceDetails> inv;

	

	

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

	public List<InvoiceDetails> getInv() {
		return inv;
	}

	public void setInv(List<InvoiceDetails> inv) {
		this.inv = inv;
	}

}
