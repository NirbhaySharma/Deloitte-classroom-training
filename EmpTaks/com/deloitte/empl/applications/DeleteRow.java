package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class DeleteRow {

	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		int rowsUpdated=dao.deleteEmpRow(1100);
		if(rowsUpdated==-1)
			System.out.println("wrong inputs");
		else 
			System.out.println(rowsUpdated+" row deleted.");
	}

}
