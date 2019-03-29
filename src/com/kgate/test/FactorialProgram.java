package com.kgate.test;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number for find Factorial");
		int num = scanner.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
	}
}
