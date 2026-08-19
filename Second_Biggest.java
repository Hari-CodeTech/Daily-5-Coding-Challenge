package Conditional_Statements;
import java.util.*;
public class Second_Biggest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter your Second Number:");
		int num2=sc.nextInt();
		System.out.println("Enter your THird Number:");
		int num3=sc.nextInt();
		
		if((num1>num2 && num1<num3)|| num1>num3 && num1<num2) {
			 {
				System.out.println("Number 1 is Second Largest : "+num1);
			}
		}
		 if ((num2>num1 && num2<num3)||(num2>num3 && num2<num1))  {
			
				System.out.println("Number 2 is Second Largest : "+num2);
			}
	
		else{
			System.out.println("Number 3 is Second Largest : "+num3);
		}
		
		
		
	}

}
