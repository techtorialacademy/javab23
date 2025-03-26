package Loops.For.ForPractice;

import java.util.Scanner;

public class ForPractice4 {
    // Find out, if a given string is a palindrome.
    // Palindrome means that reversed version of the string equals to string itself.
    // Such as, Hannah, civic.
    // Your code should not be case-sensitive.
    // For loop and char at method.

    //           hannah

    // I need to create a for loop with two index variables, one starts  from end, one start
    // from beginner

    public static void main(String[] args){

      System.out.println("Enter a string: ");
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        boolean isPalindrome = true;
        s = s.toLowerCase();
        for (int i = 0,j = s.length()-1 ; i <= j ; i++,j--){
            if(s.charAt(i) != s.charAt(j) ){
                isPalindrome = false;
                // Since we understood that this string is not a palindrome
                // we do not need to check rest of the characters.
                // To put a stop to a loop, we can use `break;` statement
                break; // this will stop loop right away.
            }
        }
        System.out.println("Is string a palindrome ? -> " + isPalindrome);






    }



}
