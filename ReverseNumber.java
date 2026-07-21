package com.RecursiveFunction;

public class ReverseNumber {
	static int reverse(int n,int rev) {
		if(n==0) {
			return rev;
		}
		int digit=n%10 ;
		return reverse(n/10,rev*10+digit);
		 
	}

	public static void main(String[] args) {
		int res=reverse(154,0);
		System.out.println(res);
	}

}
