package StringObject.StringMethods;

public class _1_ConcatMethod {
    // Concat Method
    // Returns: Another String
    // Purpose: Concatenates(joins) the given string to the end of another string.
    // Syntax
    // str1.concat(str2);
    // str2 will be added at the end of str1.
    // Since string object is immutable, both str1 and str2 will protect
    // their original value after the method usage.

    public static void main(String[] arg){

        String s1 = "Java";

        String s2 = "Programming";

        System.out.println("Printing -> s1.concat(s2); <-");
        System.out.println( s1.concat(s2) ); // JavaProgramming

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Value of s1 after concat -> " + s1); // Java
        // String objects are immutable and they do not change their value after
        // usage of methods.
        System.out.println("Value of s2 after concat -> " + s2); // Programming

        System.out.println("--------------------------------------------------------------------------");


        String s3 = "Test".concat(" Automation");

        System.out.println("String s3 = \"Test\".concat(\" Automation\"); ");
        // --
        System.out.println("s3 -> "+ s3); // Test Automation

        System.out.println("s3 = s3.concat(\" with Selenium\");");

        s3 = s3.concat(" with Selenium");
        System.out.println("s3 -> "+ s3); // Test Automation with Selenium

        // String objects do not change their value after method usage,
        // HOWEVER they could be reassigned with different values.








    }



}
