package SwitchPrograms;
import java.util.*;
public class ATM {

	public static void main(String[] args) {
		System.out.println("=============ATM MENU=================1. Check Balance\r\n"
				+ "2. Deposit Money\r\n"
				+ "3. Withdraw Money\r\n"
				+ "4. Mini Statement\r\n"
				+ "5. Exit\r\n"
				+ "");
		
		System.out.println("Now Please enter the Number : " +" ");
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int menu=sc.nextInt();
		
		switch(menu){
		case 1: System.out.println("\"Your balance is ₹25,000\"\r\n"
				+ "");
			break;
		case 2: System.out.println("Enter Amount to Deposit");
			break;
		case 3: System.out.println("Enter amount to withdraw");
			break;
		case 4: System.out.println("Displaying mini statement...");
			break;
		case 5: System.out.println("Thank you for using our ATM..");
			break;
		default: System.out.println("Invalid choice");
		}
	}

}
