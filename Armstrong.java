package com.Loops;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=145;
		int temp=number;
		int sum=0;
		while(number!=0) {
			int digit=number%10;
			sum=sum+(digit*digit*digit);
			number=number / 10;
		}
		if(sum==temp) {
			System.out.println("ArmStrong");
		}
		else {
			System.out.println("Not a Armstrong number:");
		}
		

	}

}
