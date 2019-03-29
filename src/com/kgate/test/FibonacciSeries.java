package com.kgate.test;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter number for fibonacci Series");
//		int num = scanner.nextInt();
		int a=0,b=1;
		int sum=0;
		for (int i = 0; i <= 10; i++) {
			System.out.print(a+" ");
			sum = a +b;
			a=b;
			b=sum;
			
		}
		
	}
}
