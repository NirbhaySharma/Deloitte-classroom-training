package com.deloitte.dept.beans;

public class Dept {
	private int deptNo;
	private String deptName;
	private String deptLoc;
	public Dept() {
		}
	public Dept(int deptNo, String deptName, String deptLoc) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	
}
