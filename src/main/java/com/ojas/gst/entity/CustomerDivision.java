package com.ojas.gst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "customer_Div")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDivision implements com.ojas.gst.entity.Entity
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String div1;
	private String div2;
	private String div3;
	private String div4;
	private String div5;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiv1() {
		return div1;
	}
	public void setDiv1(String div1) {
		this.div1 = div1;
	}
	public String getDiv2() {
		return div2;
	}
	public void setDiv2(String div2) {
		this.div2 = div2;
	}
	public String getDiv3() {
		return div3;
	}
	public void setDiv3(String div3) {
		this.div3 = div3;
	}
	public String getDiv4() {
		return div4;
	}
	public void setDiv4(String div4) {
		this.div4 = div4;
	}
	public String getDiv5() {
		return div5;
	}
	public void setDiv5(String div5) {
		this.div5 = div5;
	}
	
	
	

}
