package com.Array_Problems;

public class Minimum_Ele {
	public static void findMin(int arr[]) {
		int min=arr[0];
		for(int num:arr) {
			if(num<min) {
				min=num;
			}
		}
		System.out.println("Minimum Element is: "+min);
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,55,66,1,3,7};
		findMin(arr);
	}

}
