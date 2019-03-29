package com.kgate.test;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n) {
		boolean flag = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number to find out Prime Number.");
		int num = scanner.nextInt();
		for (int i = 2; i <= num; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");
			}
		}
	}
}
