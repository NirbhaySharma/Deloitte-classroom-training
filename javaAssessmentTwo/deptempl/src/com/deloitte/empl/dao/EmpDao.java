package com.deloitte.empl.dao;

import java.util.List;
import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp); 
	List<Emp> getEmpls();
	Emp getEmpByCode(int empcode);
	
	int updateEmpDetailsName(int empcode,String name);
	int updateEmpDetailsJob(int empcode,String job);
	int updateEmpDetailsMgr(int empcode,int mgr);
	int updateEmpDetailsSal(int empcode,double sal);
	int updateEmpDetailsComm(int empcode,double comm);
	int updateEmpDetailsDeptno(int empcode,int deptno);
	int deleteEmpRow(int empcode);
}

