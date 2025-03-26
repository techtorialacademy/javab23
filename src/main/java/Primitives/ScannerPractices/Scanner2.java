package Primitives.ScannerPractices;

import java.util.Scanner;

public class Scanner2 {
    // Create a program to calculate an average grade of students so you can
    // find out whether they can pass the class or not.
    // Students will enter 3 exam results and then will see true if they can pass,
    // will see false otherwise.
    // If the avg grade of students is 60 or higher they could pass the class.
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //
        System.out.println("Enter exam1 result: ");
        int exam1 = input.nextInt();

        System.out.println("Enter exam2 result: ");
        int exam2 = input.nextInt();

        System.out.println("Enter exam3  result: ");
        int exam3 = input.nextInt();

        int avgResult = ( exam1 + exam2 + exam3 ) / 3;
        // Looking at this avg result I have to understand whether or not student can pass.
        boolean canPass = avgResult  >= 60;
         // when do I want canPass to be true
        // 1. when the grade of student is equal 60 or higher than 60
        // 2. when the grade of student is only equal to 60
        // 3. when the grade of student is only bigger than 60

        System.out.println("Can pass -> " + canPass);





    }

}
