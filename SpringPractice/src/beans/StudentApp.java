package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/xmlFile.xml");
		Student s= (Student) ctx.getBean("std");
		/*s.setRegno(1234);
		s.setName("Sohail");*/
		System.out.println("hello "+ s.getRegno()+" "+s.getName()+" "+s.getAddr().getStreet()+" "+s.getAddr().getCity());
	}

}
