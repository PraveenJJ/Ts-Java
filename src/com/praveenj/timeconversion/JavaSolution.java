package com.praveenj.timeconversion;

import java.util.Scanner;

/**
 * @see <a href="https://www.hackerrank.com/challenges/time-conversion/problem">Hackerrank link</a>
 */
public class JavaSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.next();

        String digits = time.substring(0, 8);
        String meridiem = time.substring(8, 10);

        convertTime(digits, meridiem);

        scan.close();
    }

    private static void convertTime(String digits, String meridiem) {
        String arr[] = digits.split(":");
        int x = Integer.parseInt(arr[0]);

        if (meridiem.equals("PM")) {
            if (x != 12) {
                x = x + 12;
            }
        }
        if (meridiem.equals("AM")) {
            if (x == 12) {
                arr[0] = "00";
            }
        } else {
            arr[0] = String.valueOf(x);
        }
        System.out.println(arr[0] + ":" + arr[1] + ":" + arr[2]);
    }
}
