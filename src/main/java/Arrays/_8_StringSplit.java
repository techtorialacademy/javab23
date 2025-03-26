package Arrays;

import java.util.Arrays;

public class _8_StringSplit {
    // String Split method
    // Syntax -> str.split(" ");
    // It returns arrays of string values that are splitted by the given string value.
    public static void main(String[]args){
        String str = "Java is getting easy.";

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        String[] arr = str.split("a");
        // The length of the arr will be 4
        System.out.println(Arrays.toString(arr));

        // Usually(Almost always), the split method is used to divide strings into
        // words and then count the words etc..








    }
}
