package solution;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		long maxLength = (long) Math.pow(10, 5) * 4;

		String split = "[ !,?.\\_'@]+";
		String[] temp = s.trim().split(split);

		if (s == null || s.trim().equals("")) {
			System.out.println("0");
		} else if (s.length() > maxLength) {
			return;
		} else {
			System.out.println(temp.length);
		}
		for (String i : temp) {
			System.out.println(i);
		}

		scan.close();
	}

}
