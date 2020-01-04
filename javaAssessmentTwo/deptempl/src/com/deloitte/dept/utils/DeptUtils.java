package com.deloitte.dept.utils;

public class DeptUtils {
	public static String insertqry="insert into dept values(?,?,?)";
	
	public static final String GETDEPTS = "select * from dept";
	
	public static final String GETDEPTBYCODE = "select * from dept where deptno=?";
	
	public static final String UPDATEDEPTNAME = "UPDATE dept set dname=? where deptno=?";
	public static final String UPDATEDEPTLOC = "UPDATE dept set loc=? where deptno=?";
	
	public static final String DELETEEMPROW = "DELETE FROM dept where deptno=?";
}
