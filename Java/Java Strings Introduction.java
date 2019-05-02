package solution;

import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        System.out.println(capitalizeFirstLetter(A, B));
	}

	private static String capitalizeFirstLetter(String A, String B) {
		String firstCharOfStringA = A.substring(0, 1);
		String firstCharOfStringB = B.substring(0, 1);
		
		String allLastCharA = A.substring(1, A.length());
		String allLastCharB = B.substring(1, B.length());
		
		String capitalizedStringA = firstCharOfStringA.toUpperCase() + allLastCharA;
		String capitalizedStringB = firstCharOfStringB.toUpperCase() + allLastCharB;
		
		return capitalizedStringA + " " + capitalizedStringB;
	}

}






















