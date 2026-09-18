package com.Array_Problems;

public class Max_Element {
	public static void findMax(int arr[]) {
		
		int max=arr[0];
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
			
		}
		System.out.println("Maximum Element In an Array is : "+ max);
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,55,22,33,6,77,33};
		findMax(arr);
	}

}
