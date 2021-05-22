package com.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee", schema="public")
public class UserEntity {

	@Id
	long empid;
	
	@Column
	String uid;
	
	@Column
	public String pw;
	
	public long getEmpid() {
		return empid;
	}
	public UserEntity setEmpid(long empid) {
		this.empid = empid;
		return this;
	}
	public String getUid() {
		return uid;
	}
	public UserEntity setUid(String uid) {
		this.uid = uid;
		return this;
	}
	public String getPw() {
		return pw;
	}
	public UserEntity setPw(String pw) {
		this.pw = pw;
		return this;
	}
	
}
