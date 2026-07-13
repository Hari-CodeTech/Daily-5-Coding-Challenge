package com.Loops;

public class Fibonacci {
	public static void main(String[]args) {
		int first=0;
		int second=1;
		int third=0;
		
		System.out.print(" "+first);
		System.out.print(" "+second);
		for(int i=0;i<=10;i++) {
			third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
		}
		
		
	}

}
