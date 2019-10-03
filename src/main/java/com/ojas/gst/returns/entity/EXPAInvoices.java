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
public class EXPAInvoices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String exp_typ;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "expa_invdet_id")
	private List<EXPAInvoiceDetails> inv;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExp_typ() {
		return exp_typ;
	}
	public void setExp_typ(String exp_typ) {
		this.exp_typ = exp_typ;
	}
	public List<EXPAInvoiceDetails> getInv() {
		return inv;
	}
	public void setInv(List<EXPAInvoiceDetails> inv) {
		this.inv = inv;
	}

}
