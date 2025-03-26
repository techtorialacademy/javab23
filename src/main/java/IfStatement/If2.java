package IfStatement;

import java.util.Scanner;

public class If2 {
    public static void main(String[]  args){
        // let's ask user to enter their bank balance
        // and the laptop that they want to purchase.
        // we will print `Congratulations!!!` if they can buy
        // other wise we will not print anything;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bank balance: ");
        double balance = input.nextDouble();
        System.out.println("Enter the laptop price: ");
        double $laptop = input.nextDouble();

// if the balance is bigger than $laptop then the user could buy the laptop.

        if ( balance >= $laptop ){
            System.out.println("Congratulations!! you could purchase.");
        }








    }

}
