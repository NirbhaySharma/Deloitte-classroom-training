package com.deloitte.dept.dao;

import java.util.List;

import com.deloitte.dept.beans.Dept;



public interface DeptDao {
	void openConnection();
	void close();
	int addDept(Dept dept); 
	List<Dept> getDepts();
	Dept getDeptByCode(int deptNo);
	int updateDeptDetailsName(int deptNo,String name);
	int updateLocDetailsLoc(int deptNo,String loc);
	int deleteDeptRow(int deptNo);
	
}
