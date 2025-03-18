package com.praveenj.staircase;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/staircase/problem">Hackerrank link</a>
 */
public class JavaSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        staircase(n);
    }

    private static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
