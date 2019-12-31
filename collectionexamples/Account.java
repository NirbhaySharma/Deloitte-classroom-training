package collectionexamples;

public class Account {
	private int accountNumber;
	private String custName;
	private double balance;
	
	public Account() {
	
	}
	public Account(int accou, String custName, double balance) {
		super();
		this.accountNumber = accou;
		this.custName = custName;
		this.balance = balance;
	}
	public int getAccou() {
		return accountNumber;
	}
	public void setAccou(int accou) {
		this.accountNumber = accou;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
