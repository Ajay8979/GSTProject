
package com.ojas.gst.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "email_tab")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class EmailUser implements com.ojas.gst.entity.Entity {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "toEmail")
	private String to;
	
	/*
	 * @Column(name = "subject123") private String subject;
	 */
	
	@Column(name = "text12")
	private String text;
	

	public EmailUser() {
		super();
	}

	public EmailUser(String to, String text) {
		super();
		this.to = to;
	//	this.subject = subject;
		this.text = text;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	/*
	 * public String getSubject() { return subject; }
	 * 
	 * public void setSubject(String subject) { this.subject = subject; }
	 */
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
