package com.NumberPattern;
import java.util.*;
public class BasicNumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=val;j++) {
				System.out.print(j);
			}
			val++;
			System.out.println();
		}
		

	}

}
