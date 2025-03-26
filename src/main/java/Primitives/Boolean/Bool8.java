package Primitives.Boolean;

import java.util.Scanner;

public class Bool8 {
    //  Leap Year(if the year has 366 days)
    // A year is leap if it is divisible by 4 but not by 100
    // unless it is also divisible by 400.
    // Write a program that takes a year as input
    // and prints true if it's a leap year, false otherwise.
    // year -> 200 -> is this a leap year? -> No
    // year -> 116 -> is this a leap year -> yes
    // year -> 400 -> is this a leap year -> yes
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // I could understand that it is a leap year
        // when it is divisible by 4 and not by 100.
        // OR
        // when it is divisible by 400

        boolean cond1 = year % 4 == 0 && year % 100 != 0;
        boolean cond2 = year % 400 == 0;

        boolean isLeapYear = cond1 || cond2;

        System.out.println("Is the year leap year? -> " + isLeapYear);







    }

}
