package StringObject.StringMethods;

public class _9_ReplaceMethod {
    // Replace Method
    // Returns: String value
    // Purpose: To replace the certain character or sequence of characters from string.
    // Syntax: it is an overloaded method, which means this method could work with
    // different parameters.
    // str1.replace('oldChar', 'newChar');
    // str1.replace("oldsequence", "replacement");

    public static void main(String[]args){

        String str = "java";

        System.out.println(str.replace("av","new")); //jnewa

        System.out.println(str); // java

        // two char values

        System.out.println(str.replace('a','b')); // jbvb


        System.out.println(str.replace("a","b")); // jbvb











    }





}
