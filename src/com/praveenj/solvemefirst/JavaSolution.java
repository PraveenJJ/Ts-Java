package com.praveenj.solvemefirst;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true">Hackerrank Link</a>
 */
public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        solveMeFirst(a, b);
    }

    private static void solveMeFirst(int a, int b) {
        if(a>=1 && b<=1000){
            System.out.println("Sum is "+ (a+b));
        }
    }

}
