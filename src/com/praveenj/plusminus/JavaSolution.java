package com.praveenj.plusminus;

import java.util.Scanner;

public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        plusMinus(arr);
    }

    private static void plusMinus(int[] arr) {
        float plus = 0;
        float neg = 0;
        float zer = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                plus++;
            } else if (arr[i] < 0) {
                neg++;
            } else if (arr[i] == 0) {
                zer++;
            }
        }

        plus /= n;
        neg /= n;
        zer /= n;
        System.out.printf("%f\n%f\n%f\n", plus, neg, zer);
    }

}
