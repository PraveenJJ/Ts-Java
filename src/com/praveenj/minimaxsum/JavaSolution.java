package com.praveenj.minimaxsum;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/mini-max-sum/problem">Hackerrank link</a>
 */
public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long arr[] = new long[5];

        for (int i = 0; i < 5; ++i) {
            arr[i] = scan.nextInt();
        }

        miniMaxSum(arr);
    }

    private static void miniMaxSum(long[] arr) {
        long sumX = 0;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (arr[i] < 1 || arr[i] > 1000000000) {
                System.exit(0);
            }
            sumX += arr[i];
        }

        long totalSum = sumX;
        long temp = sumX;

        for (int i = 0; i < 5; i++) {
            sumX = totalSum;
            sumX -= arr[i];
            if (sumX < temp) {
                temp = sumX;
            }
            if (sumX > max) {
                max = sumX;
            }
        }

        System.out.print(temp + " " + max);
    }

}
