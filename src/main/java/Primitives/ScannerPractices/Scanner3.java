package Primitives.ScannerPractices;

import java.util.Scanner;

public class Scanner3 {

//    Scenario: A sports shop offers a buy-one-get-one-half-off deal. The user inputs
//    the price of the first item and the price of the second item. The goal is to calculate the
//    total cost under the deal and determine if the total cost exceeds $50.

//     Take two inputs for the item prices.
//    Calculate the total cost, applying the discount on the second item (half off).
//    Print true if the cost is below $50, otherwise print false.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first item price: ");
        int firstItem = input.nextInt();

        System.out.println("Enter the second item price: ");
        int secondItem = input.nextInt();

        // Second item should be half of(%50) discount

        secondItem = secondItem / 2;

        int totalPrice = firstItem + secondItem;

        // Check if the total price exceeds $50

        boolean isTotalBelow50 = totalPrice < 50;

        System.out.println(isTotalBelow50);




    }

}
