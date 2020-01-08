package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotation/annotaionTest.xml");
		Login login=ctx.getBean("login",Login.class);
		System.out.println(login.getUsername()+" "+login.getPassword());
	}

}
