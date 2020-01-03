package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class UpdateName {

	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		int rowsUpdated=dao.updateEmpDetailsName(7934, "Mukesh");
		System.out.println(rowsUpdated+" name changed.");
	}

}
