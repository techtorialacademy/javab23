package Primitives.Boolean;

import java.util.Scanner;

public class Bool6 {
    // Multiple of 3 and 5
    // Write a program that takes a number as input and prints
    // true if the number is a multiple of both three and five,
    // false otherwise.
    // Note: Multiple of 3 and 5 means that it could be
    // divisible by both 3 and 5.
   // Example Numbers: 15, 30, 45, 105, 120 etc.
    public  static  void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // it is divisible by 3 && it is divisible by 5
        // How could I understand whether or not I could divide the number by 3?
        // if there is no left over after a division with 3 it means it is divisible by 3.
        boolean isNumDivisibleBy3 =num % 3 == 0;

        boolean isNumDivisibleBy5 = num % 5 == 0;

        boolean isDivisible3_5 = isNumDivisibleBy5 && isNumDivisibleBy3;

        System.out.println(isDivisible3_5);


    }
}
