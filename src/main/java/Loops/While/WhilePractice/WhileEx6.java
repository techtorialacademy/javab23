package Loops.While.WhilePractice;

import java.util.Scanner;

public class WhileEx6 {
    // Ask user to enter a string and print the string reversed.
    // If user enters
    // hello -> olleh
    // java -> avaj
    // program -> margorp
    public static void main(String[]a){
        Scanner input = new Scanner(System.in);

        String s = input.next();
        // If I need to get each character 1 by 1, what index numbers should I use?
        // 0 -> 1 -> 2 -> 3 -> 4 -> 5
        // 5 -> 4 -> 3 -> 2 -> 1 -> 0

        int index = s.length() - 1; // start from last index
        String reversed = "";
        while ( index >= 0 )
        {
//            System.out.print( s.charAt(index) );
            reversed = reversed + s.charAt(index);
            index--;
        }
        System.out.println(reversed);











    }


}
