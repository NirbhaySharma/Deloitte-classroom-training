package annotation;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Salary { 
	
	@Value("12000.0")
	private double basicPay;
	@Value("12000.0")
	private double hra;
	public Salary(double basicPay, double hra) {
		this.basicPay = basicPay;
		this.hra = hra;
	}
	public Salary() {
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
}
