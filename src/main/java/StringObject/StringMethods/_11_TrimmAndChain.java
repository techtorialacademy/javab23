package StringObject.StringMethods;

public class _11_TrimmAndChain {
    // If a string method returns another string value like, toLowerCase,substring,replace,
    // toUpperCase,concat etc., another string method can be applied.

    public static void main(String[]args){
        String s = "Techtorial";

        System.out.println(
                s.toLowerCase().substring(0,4).concat(" Hello")
        );

        System.out.println(
                s.toUpperCase().replace("ch","k").contains("ch")
        );

        // Method chaining is applying string method one after another, and it is only possible
        // to apply string method to a methods returning string value.

        // trim() method returns string value
        // it removes leading and trailing spaces from the string.
        // it usually used to avoid user mistakes or format the texts that are received from
        // web applications.

        String s1 = " Java ";

        System.out.println(s1.length()); // 6

        System.out.println(s1.trim().length()); // 4

        String s2 = " Web Testing ";

        System.out.println(s2.length()); // 13

        System.out.println(s2.trim().length()); // 11
        // Spaces that are in the middle are not removed, only leading and trailing spaces.

        String s3 = "          Web          ";

        System.out.println(s3.length()); // 23

        System.out.println(s3.trim().length()); // 3
        // All the leading and trailing spaces are removed.





    }




}
