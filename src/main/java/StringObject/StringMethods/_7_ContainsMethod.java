package StringObject.StringMethods;

public class _7_ContainsMethod {
    // Contains Method
    // Returns: Boolean value
    // Purpose: checks if the string contains the given string value.
    // Syntax -> str1.contains(str2);
    // the method above returns `true` boolean value if str1 contains the str2.
    public static void main(String[]a){
        String s = "Hello";

        System.out.println(s.contains("le")); // false, character sequence le
        // doesn't exist in the string variable s.

        System.out.println(s.contains("L")); // false, contains method is also case sensitive.

        System.out.println(s.contains("ell")); // true, string variable s
        // contains the character sequence `ell`.





    }
}
