package com.Loops;

public class factors_of_Given_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int count=0;
		
		for(int i=1;i<=10;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);
		if(count==2) {
			System.out.println("Is Prime number ");
		}
		else {
			System.out.println("Not is Prime Number");
		}

	}

}
