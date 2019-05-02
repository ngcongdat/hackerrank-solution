package solution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); s.nextLine();
		
		// Create array
		String temp = s.nextLine();
		String[] arr = new String[n];
		
		// Push element to arr
		for(int i = 0; i < n; i++) {
			arr[i] = temp.split(" ")[i];
		}
		
		// Create variable to count amount negative subarray
		int count = 0;
		
		// Sum all 
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += Integer.parseInt(arr[j]);
				if(sum < 0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
