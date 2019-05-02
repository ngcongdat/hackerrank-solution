package solution;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

	// w e l c o m e t o j a v a (length: 13)
	// 0 1 2 3 4 5 6 7 8 9 10 11 12

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int lastChar = s.length() - k;
        
        String[] stringArray = new String[lastChar + 1];
        
        for(int i = 0; i <= lastChar; i++) {
        	String temp = s.substring(i, i + k);
        	stringArray[i] = temp;
        }
        
        Arrays.sort(stringArray);
        
        smallest = stringArray[0];
        largest = stringArray[stringArray.length - 1];
        
        return smallest + "\n" + largest;
    }
}
