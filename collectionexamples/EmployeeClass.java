package collectionexamples;

public class EmployeeClass {
	private int empCode;
	private String empName;
	private double salary;
	
	
	public EmployeeClass(int empCode, String empName, double salary) {
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
