package Homework;

import java.util.Scanner;

public class LoopHWTask5 {
//    Using the scanner ask the user to provide ANY int value.
//    Then find the product number of the given int. The product
//    number is equals to the multiplication of all the digits of the given
//    int and minus the sum of all digits.
    // I need to repeat remainder by 10 to find the last digit,
    // then move on to remove the last digit so the next digit becomes last digit
    // and I also find that by finding the remainder by 10. And, I repeat this
    // implementation till there is no next digit

    // 432
    // %10 -> 2 and I divide /10 -> 43
    // %10 -> 3 and I divide /10 -> 4
    // %10 -> 4 and I divide /10 -> 0
    // I stop
    public static void main(String[]args){
        System.out.println("Enter the integer digit");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int multiplication = 1; //
        int sum = 0;
        while ( number > 0 ){
            // Find the digit
           int digit = number % 10;
           multiplication *= digit;
           sum += digit;
            // Let's update the number by getting rid of the last digit
            number = number / 10;

        }

        System.out.println("Multiplication - Sum is " + (multiplication-sum));


    }


}
