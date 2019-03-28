package com.kgate.test;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number to check Palindrom");
		int number = scanner.nextInt();
		int a=number;
		int c =0, temp;
		while (number>0) {
			temp = number%10;
			 c = c*10+temp;
			number = number/10;
		}
		if(c==a) {
			System.out.println(a+" is Palindrom ");
		}
		else {
			System.out.println(a+"  is not Palindrom");
		}
	}
}
