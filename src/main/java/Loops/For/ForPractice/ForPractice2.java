package Loops.For.ForPractice;

import java.util.Scanner;

public class ForPractice2 {
    // Given a string value, find the count of vowels in the string.
    // vowels are (a,e,i,o,u)
    // Hello -> 2
    // countofletter -> 5

    public static void main(String [] args){
        System.out.println("Enter a string value: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int countOfVowel = 0;

        String vowels = "aeiou";

        // I need to look each letter in the string.
        // To be able to access a single character from a string
        // I need to use charAt() method.
        // To be able to use charAt method, I need index numbers.
        // I need all the index numbers in the string.
        // All index numbers start from 0, and go till the length of the string(Length of the string
        // is NOT included.)
        for( int i = 0; i < str.length() ; i++ ){
           String currentLetter = "" + str.charAt(i);
           if(vowels.contains(currentLetter.toLowerCase())) {
               countOfVowel++;
           }
        }
        System.out.println("Count of vowels in the string is " +  countOfVowel + ".");












    }






}
