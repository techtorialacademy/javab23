package StringObject.StringMethods;

public class _10_IndexOfMethod {
    // Index Of Method
    // Returns: integer value
    // Purpose: Gives the FIRST index of the given character(sequence).
    // Syntax
    // str1.indexOf("text");
    // the method above gives the FIRST index of the given sequence of characters.
    // Think indexOf method as the opposite role of the charAt method.
    // char gives you the character located at certain index.IndexOf method
    // gives you the index number when given sequence of characters.
    public static void main(String[]a){
        //          0123456789012356
        String s = "java programming";

        System.out.println(s.indexOf("va")); // 2
        // when index of method is trying to find index of sequence, it finds
        // the starting index of the given sequence.

        System.out.println(s.indexOf("a")); // 1
        // even though the character a is repeated multiple times in the string, index of method
        // will give us first matching index.

        System.out.println(s.indexOf("program")); // 5

        System.out.println( s.indexOf("Java") ); // -1
        System.out.println( s.indexOf("A") );    // -1
        // When index of method cannot find the character/sequence it will return ->> -1 <<-.

        s = "java programming";
        // Given string above. Let's get first and second word from the string s.
        // first word is the portion from index 0 to index of space(index of space is not included).
        // second word is the portion from index of space + 1 to end of the string.

        String firstWord = s.substring( 0 , s.indexOf(" ") );
        String secondWord = s.substring(s.indexOf(" ")+1 );

        System.out.println("First word -> " + firstWord);
        System.out.println("Second word -> " + secondWord);

















    }





}
