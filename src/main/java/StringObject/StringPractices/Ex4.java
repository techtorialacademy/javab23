package StringObject.StringPractices;

import java.util.Scanner;

public class Ex4 {

// Given two strings, return a new string where the first two characters of each string are swapped.
// If either string has fewer than two characters, return them concatenated in order.
// Example cases:
// "hello", "world" → "wollo herld"
// "java", "script" → "scva jcript"
// "hi", "there" → "th hiere"
// "a", "bcd" → "abcd"
// "", "xyz" → "xyz"
    // substring should be enough

    public static void main(String[]a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string1");
        String str1 = input.next();
        System.out.println("Enter a string2");
        String str2 = input.next();
        String result; // Declared a result variable
        if(str1.length() < 2 || str2.length() < 2){
         result = str1.concat(str2);
        }else{
            String first2CharacterOf_str1 = str1.substring(0,2);
            String first2CharacterOf_str2 = str2.substring(0,2);
            String restOfTheCharactersOf_str1 = str1.substring(2);
            String restOfTheCharactersOf_str2 = str2.substring(2);
            result =
                    first2CharacterOf_str2 + restOfTheCharactersOf_str1
                    + " " +
                    first2CharacterOf_str1 + restOfTheCharactersOf_str2;
        }


        System.out.println(result);










    }


}
