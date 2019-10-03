package com.ojas.gst.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "customer_Div")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDocumentsDetails implements   com.ojas.gst.entity.Entity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="document_id")
	private Long id;
	
	private String contentType;
	private String documentType;
	private String documentHash;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentHash() {
		return documentHash;
	}
	public void setDocumentHash(String documentHash) {
		this.documentHash = documentHash;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}