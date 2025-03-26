package SwitchStatement;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args){
        // Ask user to enter the number of the current month.
        // According to the number of month, print the
        // month name and the season name.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of current month");
        int monthNumber = scanner.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("Month Name: January.");
                System.out.println("Season Name: Winter");
                break;
            case 2:
                System.out.println("Month Name: February.");
                System.out.println("Season Name: Winter");
                break;
            case 3:
                System.out.println("Month Name: March.");
                System.out.println("Season Name: Spring");
                break;
            case 4:
                System.out.println("Month Name: April.");
                System.out.println("Season Name: Spring");
                break;
            case 5:
                System.out.println("Month Name: May.");
                System.out.println("Season Name: Spring");
                break;
            case 6:
                System.out.println("Month Name: June.");
                System.out.println("Season Name: Summer");
                break;
            case 7:
                System.out.println("Month Name: July.");
                System.out.println("Season Name: Summer");
                break;
            case 8:
                System.out.println("Month Name: August.");
                System.out.println("Season Name: Summer");
                break;
            case 9:
                System.out.println("Month Name: September.");
                System.out.println("Season Name: Fall");
                break;
            case 10:
                System.out.println("Month Name: October.");
                System.out.println("Season Name: Fall");
                break;
            case 11:
                System.out.println("Month Name: November.");
                System.out.println("Season Name: Fall");
                break;
            case 12:
                System.out.println("Month Name: December.");
                System.out.println("Season Name: Winter");
                break;
            default:
                System.out.println("Invalid month number it should be between");
                System.out.println("1 and 12");
                break;
        }


    }
}
