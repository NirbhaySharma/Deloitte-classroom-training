package firstJavaProject;

public class Account {
	private int accountNumber;
	private String customerName;
	private double balance;
	
	public Account() {
		this.accountNumber =1000;
		this.customerName ="nitish";
		this.balance = 2100.7;
	}
	
	public Account(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
