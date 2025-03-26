package StringObject.StringPractices;

import java.util.Scanner;

public class Ex2 {
    //    # Ask user to enter a string and print a rotated
    //    # left 2 version, where the first 2 characters
    //    # of the string moved to the end.
    //
    //    # "Hello" → "lloHe"
    //    # "java" → "vaja"
    //    # "world" → "rldwo"
    // scanner, substring, concat.
    public static void main(String[]a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.next();

        // First two characters in the string?
        // I need the first two index numbers
        // 0 1
        String firstTwo = word.substring(0,2);
        String restOfTheString = word.substring(2);

        String rotated = restOfTheString.concat(firstTwo);

        System.out.println(rotated);








    }





}
