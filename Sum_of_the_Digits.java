package com.Loops;
import java.util.*;
public class Sum_of_the_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
		while(n!=0) {
			int remenider = n%10;
			sum=sum+remenider;
			n=n/10;
		}
		System.out.println(sum);

	}

}
