package StringObject.StringMethods;

import java.util.Scanner;

public class _2_LengthMethod {
    // Length Method
    // Returns: Integer value
    // Purpose: finds the total number of characters in the string.
    // Syntax
    // str1.length();
    // finds the number of total characters in str1

    public static void main(String[] a){

        String s = "programming";

        System.out.println("The length of programming is "+ s.length()); // 11

        // Using length we could always find the last index in the string
        System.out.println("The last index in the string object s is below.");
        System.out.println("Last Index -> " + (s.length() - 1) );

        // Create a program to find last index from a string
        Scanner sc = new Scanner(System.in);
        String newStr = sc.next();

        // What is the last index in newStr?
        // 1 less than the length of string
        System.out.println("Last index in newStr is " + (newStr.length() -1 ));







    }


}
