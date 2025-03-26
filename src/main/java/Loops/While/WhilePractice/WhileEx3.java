package Loops.While.WhilePractice;

import java.util.Scanner;

public class WhileEx3 {
    // Ask user to enter an odd number
    // if user enters anything other than odd value, keep asking
    // until they enter odd.
    // If you don't have the necessary conditional check
    // to start your loop use boolean flagging.
    // It means just create a boolean variable that will be true, and
    // then update the condition in each iteration.
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // Under which condition should I continue to loop?
        // when the given number is even.
        boolean isEven = true;
        while(isEven){
            System.out.println("Enter an odd number: ");
            int number = scanner.nextInt();
            isEven = number % 2 == 0;
        }
        System.out.println("That's correct number.");





    }








}
