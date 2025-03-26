package Loops.While.WhilePractice;

import java.util.Scanner;

public class WhileEx7 {
    // Write a program that repeatedly asks the user to enter a number.
// If the number is negative, the program should print "Invalid input, try again."
// The program should continue asking until the user enters a positive number,
// then print "You entered: <number>" and exit.

// Example input/output:
// Enter a number: -5
// Invalid input, try again.
// Enter a number: -2
// Invalid input, try again.
// Enter a number: 7
// You entered: 7
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int usersNum;
        do{
            System.out.println("Enter a positive number: ");
            usersNum = sc.nextInt();
        }while (usersNum < 0 );

        System.out.println("You entered : " + usersNum );













    }

}
