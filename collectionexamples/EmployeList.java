package collectionexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeList {

	public static void main(String[] args) {
		ArrayList<EmployeeClass> emp= new ArrayList<>();
		Scanner scr= new Scanner(System.in);
		String name;
		int empCode;
		Double salary;
		for(int i=0;i<4;i++){
			System.out.print("please enter employee code :");
			empCode=scr.nextInt();
			System.out.println();
			System.out.print("please enter employee name :");
			name=scr.next();
			System.out.println();
			System.out.print("please enter employee Salary :");
			salary=scr.nextDouble();
			emp.add(new EmployeeClass(empCode, name, salary));
			System.out.println();
		}
		for(EmployeeClass employee :emp){
			System.out.println(employee.getEmpCode()+" "+employee.getEmpName()+" "+employee.getSalary());
			
		}
		scr.close();
	}

}
