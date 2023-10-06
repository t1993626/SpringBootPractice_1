package com.app.emp.entity;

import java.sql.Timestamp;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp2")
public class Emp {
	@Id
	Integer empno;
	String ename;
	String job;
	Timestamp hiredate;
	Double sal;
	Double comm;
	byte[] picture;
	String picFormat;
	Integer deptno;

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getename() {
		return ename;
	}

	public void setename(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Timestamp gethiredate() {
		return hiredate;
	}

	public void sethiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getPicFormat() {
		return picFormat;
	}

	public void setPicFormat(String picFormat) {
		this.picFormat = picFormat;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public Emp(Integer empno, String ename, String job, Timestamp hiredate, Double sal, Double comm, byte[] picture,
			String picFormat, Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.picture = picture;
		this.picFormat = picFormat;
		this.deptno = deptno;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", picture=" + Arrays.toString(picture) + ", picFormat=" + picFormat + ", deptno="
				+ deptno + "]";
	}

}
