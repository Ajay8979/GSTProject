package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "custJwell_details")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerJwellary implements com.ojas.gst.entity.Entity {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String rings;
    private String chain;
    private String nosepins;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRings() {
		return rings;
	}
	public void setRings(String rings) {
		this.rings = rings;
	}
	public String getChain() {
		return chain;
	}
	public void setChain(String chain) {
		this.chain = chain;
	}
	public String getNosepins() {
		return nosepins;
	}
	public void setNosepins(String nosepins) {
		this.nosepins = nosepins;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
    