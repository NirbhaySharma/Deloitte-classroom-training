package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/xmlFile.xml");
		Employee s= (Employee) ctx.getBean("emp");
		s.setEmpNo(1232);;
		s.setName("Sohail");
		s.setSalary(12345.0);
		System.out.println("hello "+ s.getEmpNo()+" " +s.getName()+" " +s.getSalary()+" "+s.getSkills());
		
	}

}
