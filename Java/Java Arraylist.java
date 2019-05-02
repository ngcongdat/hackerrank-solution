package solution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// Declare variable
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); s.nextLine();
		int d, q, x, y;
		
		// Create super arraylist
		ArrayList[] superArrayList = new ArrayList[n];
		
		// Create sub arraylist
		for(int i = 0; i < n; i++) {
			String temp = s.nextLine();
			String[] arrItem = temp.split(" ");
			d = Integer.parseInt(arrItem[0]);
			superArrayList[i] = new ArrayList<>();
			
			// Push item to super arraylist
			for(int j = 1; j <= d; j++) {
				superArrayList[i].add(Integer.parseInt(arrItem[j]));
			}
		}
		
		// Query element in arraylist
		q = s.nextInt(); s.nextLine();
		for(int i = 0; i < q; i++) {
			String queryXY = s.nextLine();
			String[] arrQueryXY = queryXY.split(" ");
			
			// Get index
			x = Integer.parseInt(arrQueryXY[0]) - 1;
			y = Integer.parseInt(arrQueryXY[1]) - 1;
			try {
				System.out.println(superArrayList[x].get(y));
			} catch (Exception e){
				System.out.println("ERROR!");
			}
		}
	}
}
