package Loops.For.ForPractice;

import java.util.Scanner;

public class ForPractice6 {
//         # Ask user to enter an integer number and print if the given
//         # integer is a prime integer.
//         # Prime numbers can ONLY be divided by 1 and itself.
//         # Every number can be divided by one and itself,
//         # The distinct feature of prime numbers is that they can't
//         # be divided by any other number.
    // no number can divide 11 other than 1 and 11.
    // 9 is not prime because it could be divided by 3 which is not 1 or 9 itself.
    // 7 -> is a prime number -> no number can divide 7 other than 7 itself and 1.
    // 2 -> is a prime number -> no number can divide 2 other than 1 and 2 itself.
    // 17 -> is a prime number
    // 91 -> is not a prime number because -> 7 and 13 can divide 91
    // 30 -> 2
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc. nextInt();
        boolean isPrime = true;

        for(int possibleDivisor = 2 ; possibleDivisor<=number/2 ; possibleDivisor++){
            if(number % possibleDivisor == 0){
                // this is not a prime number because
                // prime numbers are not divisible by anything other than 1 and itself
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + "is not a prime number.");
        }


    }
}
