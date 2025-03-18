package com.praveenj.verybigsum;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">Hackrrank link</a>
 */
public class JavaSolution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        long arr[]=new long[n];

        for(int i=0;i<n;++i){
            arr[i]=scan.nextLong();
        }

        System.out.println(veryBigSum(arr));

    }

    private static long veryBigSum(long arr[]) {
        long sum=0;
        for (long num: arr) {
            sum += num;
        }
        return sum;
    }

}
