package IfStatement;

import java.util.Scanner;

public class If6 {
    // Speed limit on highway is 70 and 45 on other roads.
    // When user exceeds the speed limit over 10 miles an hour
    // they get a ticket, when they exceed speed limit over
    // 25 miles an hour they get their license withdrawn.
    // Ask user their speed and which road are they are on.
    // And print whether they get ticket or other form of punishments.
    // If they are going less than or equal to speed limit,
    // print you are driving safe, if they are driving over the
    // speed limit but not high enough to get a ticket, then they
    // will get a warning.
    public static void main(String[] args) {
        // User will enter true if they are on highway, they will enter false
        // if they are on other road.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter true if you are on highway, enter false otherwise");
        boolean onHighway = s.nextBoolean();

        // There is a different speed limit for people on different roads
        // if on highway -> speedLimit -> 70
        // if not on highway -> speedLimit -> 45
        // If under the speed limit or equal -> driving safe
        // if they exceed speedLimit but not more than 10 -> warning
        // If they exceed speedLimit more than 10 -> ticket
        // If they exceed speedLimit more than 25 -> licence withdrawn

        int speedLimit ; // Declaring a speedLimit variable

        if ( onHighway ){
            // if this block gets executed it means they are on highway
            speedLimit = 70;
        }else{
            // if this else block gets executed it means they are not on highway
            speedLimit = 45;
        }
        System.out.println("Please enter your current speed: ");
        int currentSpeed = s.nextInt();

        if (currentSpeed > (speedLimit + 25)){
            // if this block of code gets executed
            // user is going more than 25 over the speed limit.
            System.out.println("You will get your licence withdrawn.");
        }
        else if(currentSpeed > (speedLimit + 10 )){
            // User is not going over 25 but going 10 over the speed limit
            System.out.println("You will get a ticket.");
        }
        else if(currentSpeed > speedLimit){
            // user is going over the speed limit but not over 10
            System.out.println("You will get a warning.");
        }else {
            System.out.println("You are driving safe!");
        }


    }
}
