package com.praveenj.gradingstudents;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/grading/problem">Hackrrank link</a>
 */
public class JavaSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        gradingStudents(n, arr);

        scan.close();
    }

    private static void gradingStudents(int n, int[] arr) {
        int q = 0;
        int ref = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 38) {
                q = arr[i] / 5;
                ref = 5 * (q + 1);
                if (ref - arr[i] < 3) {
                    arr[i] = ref;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
