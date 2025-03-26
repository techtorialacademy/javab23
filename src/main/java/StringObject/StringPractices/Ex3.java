package StringObject.StringPractices;

import java.util.Scanner;

public class Ex3 {

//        #Given a string, return a version where all
//        # the “x” have been removed from string.
//        # Except an “x” at the very start or
//        #  end should not be removed.
//        # “xxHxix”    → “xHix”
//        # “abxxxcd”   → “abcd”
//        # “xabxxxcdx” → “xabcdx”

    // To solve this you need: Scanner, replace, substring, concat

    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.next();

        // Is there a possible scenario that first and last character of the string
        // would change?  No
        // First and last characters should be protected
        char firstCharacter = s.charAt(0);
        // Last character
        char lastCharacter = s.charAt(s.length() - 1);
        // I need the portion of the string without first and last character
        String middlePortion = s.substring( 1 , s.length() - 1 );

        middlePortion = middlePortion.replace("x","");
        // i replace the x with empty string, technically all the x's in the middle
        // portion are removed.

        String endResult = firstCharacter + middlePortion + lastCharacter;

        System.out.println(endResult);










    }




}
