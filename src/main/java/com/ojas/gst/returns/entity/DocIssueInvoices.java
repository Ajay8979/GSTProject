package com.ojas.gst.returns.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DocIssueInvoices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="number")
	private Integer num;
	@Column(name="outof")
	private String from;
	@Column(name="within")
	private String to;
	private Integer totnum;
	@Column(name="abort")
	private Integer cancel;
	private Integer net_issue;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getTotnum() {
		return totnum;
	}
	public void setTotnum(Integer totnum) {
		this.totnum = totnum;
	}
	public Integer getCancel() {
		return cancel;
	}
	public void setCancel(Integer cancel) {
		this.cancel = cancel;
	}
	public Integer getNet_issue() {
		return net_issue;
	}
	public void setNet_issue(Integer net_issue) {
		this.net_issue = net_issue;
	}

}
