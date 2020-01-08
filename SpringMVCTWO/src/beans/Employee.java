package beans;

import org.springframework.stereotype.Component;


@Component
public class Employee {
	private int code;
	private String name;
	private double sal;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int code, String name, double sal) {
		this.code = code;
		this.name = name;
		this.sal = sal;
	}


	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
