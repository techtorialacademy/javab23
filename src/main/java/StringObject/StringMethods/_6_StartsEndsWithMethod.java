package StringObject.StringMethods;

public class _6_StartsEndsWithMethod {
    // StartsWith Method
    // Returns: Boolean value
    // Purpose: checks if the string starts with given string value.
    // Syntax -> str1.startsWith(str2);
    // the method above returns `true` boolean value if str1 starts
    // with str2.
    // EndsWith Method
    // Returns: Boolean value
    // Purpose: checks if the string ends with given string value.
    // Syntax -> str1.endsWith(str2);
    // the method above returns `true` boolean value if str1 ends
    // with str2.

    public static void main(String[] args){
        String s1 = "Programming";

        System.out.println(s1.startsWith("pro")); // false, because starts/ends with
        // methods are case sensitive.

        System.out.println(s1.startsWith("Programming")); // true
        // Programming starts with Programming

        System.out.println(s1.endsWith("ing")); // true

        System.out.println(s1.endsWith("Programming")); // true
        // Programming ends with Programming





    }




}
