package com.deloitte.empl.utils;

public class EmpUtils {
	public static String insertqry="insert into emp values(?,?,?,?,?,?,?,?)";
	public static final String GETEMPLS = "select * from emp";
	public static final String GETEMPlBYCODE = "select * from emp where empno=?";
	public static final String UPDATEEMPMGR = "UPDATE emp set mgr=? where empno=?";
	public static final String UPDATEEMPNAME = "UPDATE emp set ename=? where empno=?";
	public static final String DELETEEMPROW = "DELETE FROM EMP where empno=?";
	
}
