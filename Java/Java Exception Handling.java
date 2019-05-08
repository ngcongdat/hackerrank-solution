package exceptionhandling;

import java.util.Scanner;

public class Solution {
	public static final MyCalculator my_calculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

// Create class MyCalculator and declare power() method return a string
class MyCalculator {
	public static String power(int n, int p) {
		if (n == 0 && p == 0) {
			return "java.lang.Exception: n and p should not be zero.";
		} else if (n < 0 || p < 0) {
			return "java.lang.Exception: n or p should not be negative.";
		} else {
			return String.valueOf((long) Math.pow(n, p));
		}
	}
}
