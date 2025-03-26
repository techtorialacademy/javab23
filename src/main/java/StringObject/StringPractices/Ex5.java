package StringObject.StringPractices;

import java.util.Scanner;

public class Ex5 {
//         Given a string, print true if "bad" appears starting at
//         index 0 or 1 in the string, such as with "badzzz" or
//         "zbaddzzzz" but not "zzbadzzzzz".
//         The string may be any length, including 0.
//         Disregard the spaces at the beginning and end of the string given by user.

    public static void main(String[]a){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = input.next();

        // How could I find starting index number for sequence bad in the string?
        int startingIndex = s.indexOf("bad");

        boolean result = startingIndex == 1 || startingIndex == 0;

        System.out.println(result);



    }



}
