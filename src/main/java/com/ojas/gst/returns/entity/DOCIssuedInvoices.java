package com.ojas.gst.returns.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DOCIssuedInvoices {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Character flag;
	private String chksum;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_issdet_id")
	private List<DocumentIssuedDetails> doc_det;
	public Character getFlag() {
		return flag;
	}
	public void setFlag(Character flag) {
		this.flag = flag;
	}
	public String getChksum() {
		return chksum;
	}
	public void setChksum(String chksum) {
		this.chksum = chksum;
	}
	public List<DocumentIssuedDetails> getDoc_det() {
		return doc_det;
	}
	public void setDoc_det(List<DocumentIssuedDetails> doc_det) {
		this.doc_det = doc_det;
	}

}
