package firstJavaProject;

public class AccountApplication {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccountNumber(1000338);
		account.setBalance(68000.03);
		account.setCustomerName("prabhu");
		System.out.println("Account Number : "+account.getAccountNumber());
		System.out.println("Customer Name : "+account.getCustomerName());
		System.out.println("Available Balance : "+account.getBalance());
		System.out.println();
		System.out.println();
		Account account1= new Account(1007,"Akash",75009);
		Account account2= new Account();
		
		
		System.out.println("Account Number : "+account1.getAccountNumber());
		System.out.println("Customer Name : "+account1.getCustomerName());
		System.out.println("Available Balance : "+account1.getBalance());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Account Number : "+account2.getAccountNumber());
		System.out.println("Customer Name : "+account2.getCustomerName());
		System.out.println("Available Balance : "+account2.getBalance());
		CustomerApplication.main(args);
		
	}

}
