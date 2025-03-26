package IfStatement;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args){
        // Ask user to enter the day number for a week day
        // 1 -> Monday
        // 2 -> Tuesday
        // ...
        // Depending on what user enters print the name of the day.
        // if user enters and invalid day number print `Invalid Day Number`.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number 1 -> 5");
        int dayNum = sc.nextInt();

        if(dayNum == 1){
            System.out.println("Monday");
        }
        if(dayNum == 2){
            System.out.println("Tuesday");
        }
        if(dayNum == 3){
            System.out.println("Wednesday");
        }
        if(dayNum == 4){
            System.out.println("Thursday");
        }
        if(dayNum == 5){
            System.out.println("Friday");
        }

        // when user enters dayNum larger than 5
        // OR
        // when user enter dayNum less than 1
        if ( dayNum > 5 || dayNum < 1){
            System.out.println("It is an invalid day number.");
        }





    }

}
