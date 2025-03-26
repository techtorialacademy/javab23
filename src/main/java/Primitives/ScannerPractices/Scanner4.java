package Primitives.ScannerPractices;

import java.util.Scanner;

public class Scanner4 {
    // We should create a program to calculate if there is
    // still a ticket for the game tonight. We are given two
    // variables: Capacity of the stadium and the amount of
    // tickets sold.  Print true if I can still buy a ticket,
    // false otherwise.
    // NOTE! USER will enter the capacity and amount of
    // tickets sold.

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);



        System.out.println("Capacity of stadium: ");
        int stadiumCapacity = scanner.nextInt();

        System.out.println("Amount of tickets sold: ");
        int ticketsSold = scanner.nextInt();

        // How could I understand if there is a still ticket?

        boolean ticketsAvailable
                =   ticketsSold < stadiumCapacity ;
        // When do we want ticketsAvailable to be true?
        // 2 when ticketsSold is less than stadiumCapacity

        System.out.println(ticketsAvailable);











    }
}
