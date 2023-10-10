package com.example.demo.svc.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sys_config")
public class Sys {
	@Id
	String variable;
	String value;
	String set_by;
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSet_by() {
		return set_by;
	}
	public void setSet_by(String set_by) {
		this.set_by = set_by;
	}
	public Sys(String variable, String value, String set_by) {
		super();
		this.variable = variable;
		this.value = value;
		this.set_by = set_by;
	}
	public Sys() {
		super();
	}
	

}
