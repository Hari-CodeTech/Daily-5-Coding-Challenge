package com.Methods;

public class BankATM {
	double balance=10000.00;
	
	public  void checkBalance() {
		System.out.println("Current Balance is: "+balance);
	}
	public void deposit(double amount) {
		System.out.println(amount+"/- Deposit Successfully");
		balance+=amount;
		
		
	}
	public void withdraw(double amount) {
		System.out.println("Present Balance is:"+balance);
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawal Successful");
			System.out.println("Updated Account Balance is:"+balance);
		}
		else {
			System.out.println("Insufficient Balance");
			System.out.println("Now Ur Account balance is:"+ balance +"/-only");
		}
		
	}
	public void displayMenu(){
System.out.println("===== ATM MENU =====\r\n"
		+ "1. Check Balance\r\n"
		+ "2. Deposit\r\n"
		+ "3. Withdraw\r\n"
		+ "4. Exit");

	}
	public static void main(String[] args) {
		BankATM ob=new BankATM();
		ob.displayMenu();
		ob.checkBalance();
		ob.deposit(50000.00);
		ob.withdraw(40000.00);
		ob.deposit(45000);
		ob.checkBalance();
	
		ob.withdraw(78000);

	}

}
