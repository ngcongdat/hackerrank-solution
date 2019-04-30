package solution;

import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
		boolean ret = false;
		String tempA = b.toLowerCase();
		String tempB = a.toLowerCase();
		if (tempA.length() != tempB.length()) {
			ret = false;
		} else {
			char a1[] = tempA.toCharArray();
			for (int i = 0; i < a1.length; i++) {
				for (int j = 0; j < a1.length; j++) {
					if (a1[i] < a1[j]) {
						char temp = a1[i];
						a1[i] = a1[j];
						a1[j] = temp;
					}
				}
			}
			char b1[] = tempB.toCharArray();
			for (int i = 0; i < b1.length; i++) {
				for (int j = 0; j < b1.length; j++) {
					if (b1[i] < b1[j]) {
						char temp = b1[i];
						b1[i] = b1[j];
						b1[j] = temp;
					}
				}
			}
			ret = true;
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != b1[i]) {
					ret = false;
					break;
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
