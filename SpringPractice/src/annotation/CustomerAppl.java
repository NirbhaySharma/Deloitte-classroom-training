package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppl {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("annotation/annotaionTest.xml");
		Customer cust= (Customer) ctx.getBean("cust");
		System.out.println(cust.getCode()+" "+cust.getName()+" "+cust.getSal().getBasicPay()+" "+cust.getSal().getHra());
	}
}
