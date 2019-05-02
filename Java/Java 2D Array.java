package solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        int max = -1000;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int result;
                try {
                    int aboveLine = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1];
                    int belowLine = arr[i + 1][j - 1] + +arr[i + 1][j] + +arr[i + 1][j + 1];
                    result = aboveLine + arr[i][j] + belowLine;
                    if (result > max) {
                        max = result;
                    }

                } catch (Exception e) {
                }

            }
        }
        System.out.println(max);
    }
}
