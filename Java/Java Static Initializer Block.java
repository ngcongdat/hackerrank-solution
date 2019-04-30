package solution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static Scanner s = new Scanner(System.in);
	private static int B = s.nextInt();
    	private static int H = s.nextInt();
    	private static boolean flag = flags();

	private static boolean flags() {
		if(B > 0 && H > 0) {
		    flag = true;
		}
		else {
		    flag = false;
		    System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		return flag;
	}
		
	public static void main(String[] args){
		if(flag) {
			int area=B*H;
			System.out.print(area);
		}
			
	} //end of main

} //end of class


