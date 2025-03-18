package com.praveenj.simplearraysum;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true">Hackerrank Link</a>
 */
public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        if (n <= 0) {
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        simpleArraySum(arr);

        scan.close();
    }

    private static void simpleArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                System.exit(0);
            }
            sum += arr[i];
        }

        System.out.println(sum);
    }

}
