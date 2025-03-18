package com.praveenj.comparetriplets;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true">Hackerrank Link</a>
 */
public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[3];
        int brr[] = new int[3];

        for (int i = 0; i < 3; ++i) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; ++i) {
            brr[i] = scan.nextInt();
        }

        compareTriplets(arr, brr);

        scan.close();
    }

    private static void compareTriplets(int[] arr, int[] brr) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < 3; i++) {
            if (arr[i] == brr[i]) {
                continue;
            } else if (arr[i] > brr[i]) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(a + " " + b);
    }

}
