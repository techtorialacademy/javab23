package Loops.While.WhilePractice;

import java.util.Scanner;

public class WhileEx5 {
    // Ask user to enter an integer number
    // Print out product of each digit in the number.
    // if user enters 57531 -> 1 * 3 * 5 * 7 * 5 -> 525
    // if user enter 6843256 -> 6 * 5 * 2 * 3 * 4 * 8 * 6 -> 34560
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();
        int multiplication = 1;
        while ( number > 0 ){
            int theDigit = number % 10;
            multiplication = multiplication * theDigit;
            number = number / 10;
        }

        System.out.println(multiplication);











    }
}
