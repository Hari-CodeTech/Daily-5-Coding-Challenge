package com.Loops;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		
		while(n!=0) {
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}
	}

}
