package Primitives.ScannerPractices;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[]args){
        // Creating a scanner object
        Scanner input = new Scanner(System.in);

        // to get an integer value -> nextInt()
        // to get a double value -> nextDouble()
        // to get a boolean value -> nextBoolean()
        // to get a long value -> nextLong()
        // to get single word text input -> next()
        // to get multiple word text input -> nextLine()

        // Let the user know what data do you need?
        System.out.println("Please enter your age: ");
        // On the following line I will capture/get the user's input
        // and store it as integer.
        int userAge = input.nextInt();

        // Let's print the user's age.
        System.out.println("Age of the user is " + userAge + ".");

        // Let's get 2 integer values from user and return the sum of those values:
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        System.out.println("Enter another number: ");
        int num2 = input.nextInt();

        // How could I find the sum of num1 and num2 and print ?
        int result = num1 + num2;

        System.out.println("Sum of num1 and num2 is: " + result);









    }

}
