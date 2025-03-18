package com.praveenj.birthdaycandles;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/birthday-cake-candles/problem">Hackerrank link</a>
 */
public class JavaSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        birthdayCandles(n, arr);
        scan.close();
    }

    private static void birthdayCandles(int n, int[] arr) {
        int high = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > high) {
                high = arr[i];
                count = 1; // Reset count since we found a new highest
            } else if (arr[i] == high) {
                count++;
            }
        }
        System.out.println(count);
    }

}
