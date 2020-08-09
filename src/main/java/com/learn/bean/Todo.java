package com.learn.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id @GeneratedValue
	private Long Id;
	private String name;
	private String disc;
	private String status;
	private int priority;
	private Date startDate, endDate;
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String name, String disc, String status, int priority, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.disc = disc;
		this.status = status;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Todo [name=" + name + ", disc=" + disc + ", status=" + status + ", priority=" + priority
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
}
