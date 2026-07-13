package com.Loops;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the given Number : "+" ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=1;
		
		for(int i=1;i<=n;i++) {
			result=result*i;
		}
		System.out.println(result);
	
	}

}
