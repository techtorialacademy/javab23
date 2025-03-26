package Loops.While.WhilePractice;

import java.util.Scanner;

public class WhileEx4 {
    // The product price for the screen is 239.41 cents.
    // Print user to enter money, if user enters less than the product amount
    // display them how much more they should enter and ask money until they reach product
    // price or more.if their total comes up more than product price,
    // give them an exchange.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double productPrice = 239.41;
        System.out.println("Please enter the product price of $239.41");

        double userMoney = scanner.nextDouble();

        while ( productPrice > userMoney ){
            // User needs to enter more money
            double difference = productPrice - userMoney;
            System.out.println("You need to enter $" + difference + " more.");
            double extraUserMoney = scanner.nextDouble();
            userMoney += extraUserMoney;
        }

        // Product price is either smaller or equal to user money
        if( userMoney > productPrice ){
            double exchange = userMoney - productPrice;
            System.out.println("Your exchane is being ready: $"+exchange);
        }else if( userMoney == productPrice){
            System.out.println("you entered the exact amount have a great day.");
        }








    }

}
