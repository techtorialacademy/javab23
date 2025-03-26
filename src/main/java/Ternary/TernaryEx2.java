package Ternary;

import java.util.Scanner;

public class TernaryEx2 {
    public static void main(String[]args){
        // User will enter their age
        // Whether or not they could vote
        // if 18 and over they can, otherwise they cannot
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String result = age >= 18 ? "Can vote." : "Cannot vote";
        System.out.println("User " + result);

    }
}
