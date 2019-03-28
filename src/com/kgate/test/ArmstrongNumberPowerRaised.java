package com.kgate.test;

import java.util.Scanner;

public class ArmstrongNumberPowerRaised {

	static int calculate(int n, int r) {
		int c, p = 1;
		for (c = 1; c <= r; c++) {
			p = p * n;
		}
		return p;
	}

	public static void main(String[] args) {
		ArmstrongNumberPowerRaised po = new ArmstrongNumberPowerRaised();
		Scanner scanner = new Scanner(System.in);
		int count = 0, temp, remainder, result = 0, dup;
		System.out.println("Enter Number to check Armstrong Number.");
		int num = scanner.nextInt();
		dup = num;
		while (dup > 0) {
			count++;
			dup = dup / 10;
		}
		dup = num;
		while (num > 0) {
			remainder = num % 10;

			result = result+calculate(remainder, count);
			num = num / 10;
		}
		if (dup == result) {
			System.out.println(dup + " is Armstrong number");
		} else {
			System.out.println(dup + " is not Armstrong Number");
		}
	}
}
