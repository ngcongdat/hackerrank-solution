package biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String rules = "(\\d{1,200})";

		String s1 = s.next();
		String s2 = s.next();

		if (s1.matches(rules) && s2.matches(rules)) {
			BigInteger b1 = new BigInteger(s1);
			BigInteger b2 = new BigInteger(s2);
			System.out.println(b1.add(b2));
			System.out.println(b1.multiply(b2));
		}
	}
}
