package com.praveenj.diagonaldifference;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/diagonal-difference/problem">Hackerrank link</a>
 */
public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(diagonalDifference(n, arr));
    }

    private static int diagonalDifference(int n, int[][] arr) {
        int diag = 0;
        int sec = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diag += arr[i][j];
                }
                if (i + j == n - 1) {
                    sec += arr[i][j];
                }
            }
        }

        return Math.abs(diag - sec);
    }

}
