package collectionexamples;

import java.util.Scanner;

public class AccountApplication {
	public static AccountOperation accoper;
	
	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		int accountNumber;
		double amount;
		accoper=new AccountOperation();
		while(true){
			System.out.println("hello welcome to AccountApplication ");
			System.out.println("please select a valid input");
			System.out.println("D for Deposit");
			System.out.println("W for withdrawal");
			System.out.println("C for Check Balance");
			System.out.println("E for Exit");
			System.out.print("provide input here :" );
			String input=scr.next();
			System.out.println();
			switch(input){
			case "D":   System.out.print("please provide account numberfor deposit");
						accountNumber=scr.nextInt();
						System.out.println();
						System.out.print("please provide amount of deposit");
						System.out.println();
						amount=scr.nextDouble();
						accoper.deposit(accountNumber, amount);
						break;
			case "W":   System.out.print("please provide account number for withdrawal");
						accountNumber=scr.nextInt();
						System.out.println();
						System.out.print("please provide amount of deposit");
						System.out.println();
						amount=scr.nextDouble();
						accoper.withdraw(accountNumber, amount);
						break;
			case "C":   System.out.print("please provide account number for balance check");
						accountNumber=scr.nextInt();
						accoper.checkBalance(accountNumber);
						break;
			case "E":   System.out.println("Exit");
						scr.close();
						return;
			default  :System.out.println("invalid input");
			
			}
		}
	}
	
}
