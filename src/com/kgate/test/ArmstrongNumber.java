package com.kgate.test;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any three digit nubber: ");
		int n = scanner.nextInt();
		int c = 0, temp, a;
//
		int l2 = String.valueOf(n).length();
		System.out.println("length of int2:::::: "+l2);
//		
		int l = Integer.toString(n).length();
		System.out.println("length of int::::  " + l);
		temp = n;
		while (n > 0) {
			a = n % 10;
			
			
			c = c + (a * a * a);
			n = n / 10;

		}
		if (temp == c) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");
		}
	}
}
