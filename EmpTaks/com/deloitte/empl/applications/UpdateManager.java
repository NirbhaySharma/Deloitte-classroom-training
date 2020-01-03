package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class UpdateManager {

	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		int rowsUpdated=dao.updateEmpDetails(7934, 7900);
		System.out.println(rowsUpdated+" person's manager id changed.");
	}

}
