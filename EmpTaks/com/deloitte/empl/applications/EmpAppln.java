package com.deloitte.empl.applications;



import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class EmpAppln {
	public static void main(String[] args) {
		int rows=0;
		int eno=31;
		Emp emp = new Emp(eno,"aaa","job",45,"31-12-2019", 5000, 600, 30);
		EmpDao dao = new EmpDaoImpl();
		Emp empCheck= dao.getEmpByCode(eno);
		if(empCheck==null)
		 	rows = dao.addEmp(emp);
		else System.out.println("same primary key present");
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
	}
}
