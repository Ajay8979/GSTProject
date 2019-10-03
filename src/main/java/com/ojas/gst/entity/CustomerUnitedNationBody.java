package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custUnited_nation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerUnitedNationBody implements com.ojas.gst.entity.Entity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String entity;
	private String authoritySignatory;
	private String panAuthoritySignatory;
	private String email;
	private Long mobileNo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getAuthoritySignatory() {
		return authoritySignatory;
	}
	public void setAuthoritySignatory(String authoritySignatory) {
		this.authoritySignatory = authoritySignatory;
	}
	public String getPanAuthoritySignatory() {
		return panAuthoritySignatory;
	}
	public void setPanAuthoritySignatory(String panAuthoritySignatory) {
		this.panAuthoritySignatory = panAuthoritySignatory;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}
