package com.RecursiveFunction;
import java.util.Scanner;

public class PrimeRecursive {

    static boolean isPrime(int n, int i) {
        if (n <= 1)
            return false;
        
        if (i * i > n)
            return true;

        if (n % i == 0)
            return false;
       
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num, 2))
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}