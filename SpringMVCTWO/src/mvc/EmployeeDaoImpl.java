package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import beans.Employee;

@Repository
public class EmployeeDaoImpl {
	public List<Employee> getEmpls() {
		List<Employee> empList=new ArrayList<>(); 
		empList.add(new Employee(101,"sanjeev",5000.0));
		empList.add(new Employee(102,"sanj",500.0));
		empList.add(new Employee(103,"eev",4500.0));
		return empList;
	
}	
}
