package beans;

import java.util.List;

public class Employee {
	private int empNo;
	private String name;
	private double salary;
	private List<String> skills;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public void start(){
		System.out.println("start method");
	}
	public void stop() {
		System.out.println("stop method");
	}
	
}
