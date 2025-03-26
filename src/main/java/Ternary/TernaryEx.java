package Ternary;

import java.util.*;

public class TernaryEx {
    public static void main(String[]args){


        // Let's ask user to enter two integer values and find the largest.
        System.out.println("Enter the number 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        // Let's find the largest value from these two numbers
        int largest = num1 > num2 ? num1 : num2;
//        if(num1 > num2){
//            largest = num1;
//        }else {
//            largest = num2;
//        }
        System.out.println(largest);
    }
}
