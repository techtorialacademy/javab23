package Loops.For.ForPractice;

import java.util.Scanner;

public class ForPractice5 {
    /*
       if total of divisors of a given integer is equal to the number itself it is called a
       'PERFECT' number write java code to find out if any given integer value is a perfect
       number or not. * do not include number itself as divider
             10 >> 1,2,5, >> 1 + 2 + 5 =? >> 8 > So that number 10 is not perfect number!
             6 >> 1,2,3 >> 1 + 2 + 3 =? 6 6 == 6 > So that 6 is a perfect number!
         */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = sc.nextInt();
        // Find out if the variable `number` is perfect number or not.
        // I need to find out all divisors of the number.
        // what are the range of divisors for a number?
        // all divisors of 60
        // what range do you look?
        // 1 - 60
        // Lowest number you can divide 2 biggest divisor is 30
        // 100 -> 2 is the lowest -> 50 is the biggest
        // 1 - 30(half of the number)
        // for all numbers divisor range is in between
        // 1 to number/2(both end is included)
        int sumOfAllDivisors = 0;
        for(int possibleDivisor = 1 ; possibleDivisor <= number/2 ; possibleDivisor++){
            //If a possible divisor is actually a divisor
            if ( number % possibleDivisor == 0){
                // possibleDivisor is dividing number perfectly
                sumOfAllDivisors += possibleDivisor;
            }
        }
        if( sumOfAllDivisors == number ){
            System.out.println(number + " is a perfect number. ");
        }else {
            System.out.println(number + " is not a perfect number. ");
        }




    }

}
