package com.kgate.test;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number for find GCD.");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);

	}
}
