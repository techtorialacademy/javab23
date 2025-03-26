package Loops.For.ForPractice;

import java.util.Scanner;

public class ForPractice8 {
// Ask user to how many lines of output they would like to see.
//# Our lines should look like
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7 8
// ....
    // Let's start by printing as many lines as user wants.

    // SOLUTION
    // 1- Count of numbers in the line should be same as line number.
    // 2- Each number in the line should be printed in the same line.(print method not println)
    // 3- I need to print as many lines as user wants to see
    // So if user enters 5 I need to see 5 lines
    public static void main(String[]args){
       System.out.print("Enter number of lines you want to see: ");
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        for(int line = 1 ; line <=numberOfLines ; line++ ){
            INNER:for(int numbersInLine =1 ; numbersInLine <= line ; numbersInLine++ ){
                System.out.print(numbersInLine + " ");
            }
            System.out.println();
        }



    }



}
