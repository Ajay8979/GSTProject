package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custBusiness_consitution")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerConstitutionBusiness implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String forignCompanies;
	private String govtDept;
	private String localAuthority;
	private String partership;
	private String proprietorship;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getForignCompanies() {
		return forignCompanies;
	}

	public void setForignCompanies(String forignCompanies) {
		this.forignCompanies = forignCompanies;
	}

	public String getGovtDept() {
		return govtDept;
	}

	public void setGovtDept(String govtDept) {
		this.govtDept = govtDept;
	}

	public String getLocalAuthority() {
		return localAuthority;
	}

	public void setLocalAuthority(String localAuthority) {
		this.localAuthority = localAuthority;
	}

	public String getPartership() {
		return partership;
	}

	public void setPartership(String partership) {
		this.partership = partership;
	}

	public String getProprietorship() {
		return proprietorship;
	}

	public void setProprietorship(String proprietorship) {
		this.proprietorship = proprietorship;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
