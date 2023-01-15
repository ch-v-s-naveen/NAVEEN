package com.organization.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer deptId;
	private String deptName;
	private String deptInfo;
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptInfo() {
		return deptInfo;
	}
	public void setDeptInfo(String deptInfo) {
		this.deptInfo = deptInfo;
	}
	
	

}
