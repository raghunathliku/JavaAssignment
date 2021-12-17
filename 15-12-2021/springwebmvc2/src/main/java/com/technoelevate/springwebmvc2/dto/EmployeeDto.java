package com.technoelevate.springwebmvc2.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class EmployeeDto implements Serializable{
	@Id
	@Column(name = "emp_id")
	private int eid;
	@Column(name = "emp_name")
	private String ename;
	@Column(name = "emp_pos")
	private String position;
	@Column(name = "emp_pass")
	private String password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeDao [eid=" + eid + ", ename=" + ename + ", position=" + position + ", password=" + password
				+ "]";
	}
	public EmployeeDto(int eid, String ename, String position, String password) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.position = position;
		this.password = password;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
