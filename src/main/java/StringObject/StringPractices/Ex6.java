package StringObject.StringPractices;

import java.util.Scanner;

public class Ex6 {
//  Given two strings, append them together (known as "concatenation")
//  and print the result. However, if the strings are different lengths,
//  omit starting chars from the longer string. So, it is the same length as the
//  shorter string. So "Hello" and "Hi" yield "loHi".
//  The strings may be any length.
//     str1 = javac str2 = techc -> javactechc
//     str1 = programming str2 = tech -> mingtech
//     str1 = python   str2 = techtorial -> pythontorial

    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string1");
        String str1 = input.next();
        System.out.println("Enter a string2");
        String str2 = input.next();

        // Find the larger string and get the last (length of shorter string) characters
        // from the large string.

        int shorterLength;

        if(str1.length() < str2.length()){
            shorterLength = str1.length();
        }else if(str2.length() < str1.length()){
            shorterLength = str2.length();
        }else{
            shorterLength = str1.length();
        }
        str1 = str1.substring(str1.length()-shorterLength);
        str2 = str2.substring(str2.length()-shorterLength);

        System.out.println(str1 + str2);














    }

}
