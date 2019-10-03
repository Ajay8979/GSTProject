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
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DocumentIssuedDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer doc_num;
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_invdet_id")
	private List<DocIssueInvoices> docs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDoc_num() {
		return doc_num;
	}
	public void setDoc_num(Integer doc_num) {
		this.doc_num = doc_num;
	}
	public List<DocIssueInvoices> getDocs() {
		return docs;
	}
	public void setDocs(List<DocIssueInvoices> docs) {
		this.docs = docs;
	}
	

}
