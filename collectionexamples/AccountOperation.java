package collectionexamples;

import java.util.ArrayList;

public class AccountOperation {
	ArrayList<Account> accounts= new ArrayList<>();
	
	public AccountOperation() {
		accounts.add(new Account(1001, "Deloitte", 80000.00));
		accounts.add(new Account(1002, "Nirbhay", 80000.00));
		accounts.add(new Account(1003, "Akshay", 78000.0));
		accounts.add(new Account(1004, "Ankita", 10000.0));
		accounts.add(new Account(1005, "Chirag", 8000.0));
		
	}
	void deposit(int acno,double amount){
		boolean available= false;
		for(int i=0;i<5;i++){
			int acc=accounts.get(i).getAccou();
			if(acc==acno){
				available= true;
				accounts.get(i).setBalance(accounts.get(i).getBalance()+amount);
				System.out.println();
				break;
			}
		}
		try{
			if(available==true){
				return;
			}
			throw new AccountNotFoundException();
		}	
		catch(AccountNotFoundException e){
			System.out.println("invalid account number please try again");
		}
	}
	
	void withdraw(int acno,double amount){
		boolean available= false;
		for(int i=0;i<5;i++){
			int acc=accounts.get(i).getAccou();
			if(acc==acno){
				available= true;
				double availableBalance=accounts.get(i).getBalance();
				try{
					if(availableBalance<amount){
						throw new InsufficientBalanceException();
					}
				}catch(InsufficientBalanceException e){
					System.out.println("insuficient balance in your account please try again.");
				}
				System.out.println("amount withdrawn : "+amount);
				accounts.get(i).setBalance((accounts.get(i).getBalance()-amount));
				System.out.println("remaining balance : "+accounts.get(i).getBalance());
				System.out.println();
				break;
			}
		}
		try{
			if(available==true){
				return;
			}
			throw new AccountNotFoundException();
		}	
		catch(AccountNotFoundException e){
			System.out.println("invalid account number please try again");
		}
	}
	void checkBalance(int acno) {
		boolean available= false;
		for(int i=0;i<5;i++){
			int acc=accounts.get(i).getAccou();
			if(acc==acno){
				available= true;
				System.out.println("your current balance is :"+accounts.get(i).getBalance());
				System.out.println();
				break;
			}
		}
		try{
			if(available==true){
				return;
			}
			throw new AccountNotFoundException();
		}	
		catch(AccountNotFoundException e){
			System.out.println("invalid account number please try again");
		}
	}
}
