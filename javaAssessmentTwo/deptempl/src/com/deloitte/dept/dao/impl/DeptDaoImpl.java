package com.deloitte.dept.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.DeptDao;
import com.deloitte.dept.utils.DeptUtils;


import oracle.jdbc.OracleDriver;

public class DeptDaoImpl implements DeptDao{
	
	private Connection conn=null;
	private PreparedStatement pst;
	private ResultSet rs;
	
	
	@Override
	public void openConnection() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String pass = "tiger";
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int addDept(Dept dept) {
		openConnection();
		int rows=0;
		try {
			pst = conn.prepareStatement(DeptUtils.insertqry);
			pst.setInt(1, dept.getDeptNo());
			pst.setString(2, dept.getDeptName());
			pst.setString(3, dept.getDeptLoc());
			rows= pst.executeUpdate();
			}
		catch(SQLIntegrityConstraintViolationException e){
			System.out.println("");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			close();
		}
		return rows;
	}

	@Override
	public List<Dept> getDepts() {
		openConnection();
		List<Dept> deptList = new ArrayList<Dept>();
		try {
			pst = conn.prepareStatement(DeptUtils.GETDEPTS);
			rs = pst.executeQuery();
			while(rs.next()){
				Dept dept = new Dept(rs.getInt(1),rs.getString(2),rs.getString(3));
				deptList.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return deptList;
	}

	@Override
	public Dept getDeptByCode(int deptNo) {
		openConnection();
		Dept dept = null;
		try {
			pst = conn.prepareStatement(DeptUtils.GETDEPTBYCODE);
			pst.setInt(1, deptNo); 
			rs = pst.executeQuery();
			if(rs.next()){
				dept = new Dept(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return dept;
	}

	@Override
	public int updateDeptDetailsName(int deptNo, String name) {
		openConnection();
		int i=0;
		try {
			pst = conn.prepareStatement(DeptUtils.GETDEPTBYCODE);
			pst.setInt(1, deptNo); 
			rs = pst.executeQuery();
			if(rs.next()){
				pst=conn.prepareStatement(DeptUtils.UPDATEDEPTNAME);
				pst.setInt(2, deptNo);
				pst.setString(1, name);
				i=pst.executeUpdate();	
				System.out.println("row updated");
			}
			else return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		
		return i;
		
	}

	@Override
	public int updateLocDetailsLoc(int deptNo, String loc) {
		openConnection();
		int i=0;
		try {
			pst = conn.prepareStatement(DeptUtils.GETDEPTBYCODE);
			pst.setInt(1, deptNo); 
			rs = pst.executeQuery();
			System.out.println("done");
			if(rs.next()){
				pst=conn.prepareStatement(DeptUtils.UPDATEDEPTLOC);
				pst.setInt(2, deptNo);
				pst.setString(1, loc);
				i=pst.executeUpdate();	
				System.out.println("row updated");
			}
			else return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		
		return i;

	}

	@Override
	public int deleteDeptRow(int deptNo) {
		openConnection();
		int i=0;
		try {
			pst = conn.prepareStatement(DeptUtils.GETDEPTBYCODE);
			pst.setInt(1, deptNo); 
			rs = pst.executeQuery();
			System.out.println("done");
			if(rs.next()){
				pst=conn.prepareStatement(DeptUtils.DELETEEMPROW);
				pst.setInt(1, deptNo);
				i=pst.executeUpdate();	
				System.out.println("row updated");
			}
			else return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		
		return i;
		
	}

}
