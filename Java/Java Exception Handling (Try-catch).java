package exceptionhandling;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		try {
			System.out.println(x / y);
		} catch (ArithmeticException e) {
			System.out.println(e.getClass().getName() + ": / by zero");
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}

	}

}
