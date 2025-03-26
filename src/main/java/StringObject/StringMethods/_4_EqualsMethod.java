package StringObject.StringMethods;

public class _4_EqualsMethod {
    // Equals Method
    // Returns: Boolean value
    // Purpose: checks if the two string has equal value or not.
    // Syntax -> str1.equals(str2);
    // the method above returns `true` boolean value if str1 has the same
    // value as str2. Otherwise, it return `false` boolean value.
    public static void main(String[]args){
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        boolean c1 = s1.equals(s2);//false, equals method do value comparison case sensitive.
        boolean c2 = s1.equals(s3);//true, because both s3 and s1 have the same value.

        //-- In java we could also compare string values by ignoring the case differences.
        // equalsIgnoreCase() method. It works same as equals method, but case
        // of the string values are ignored.

        c1 = s1.equalsIgnoreCase(s2); // true, because
        // case is not important for equalsIgnoreCase method.
        c2 = s1.equalsIgnoreCase(s3); // true,

        // How did we compare two primitive values with each other?
        // ==
        // Why are we not using = = to compare two strings?

        // When equalequal sign (==) is used to compare strings,
        // on top of checking if they have the same value it also checks
        // if they are the exact same object in memory?

        String t2 = "test";
        String t3 = "test";
        String t1 = new String("test");
        String t4 = new String("test");

        boolean sameValue = // true
                t2.equals(t3) && t1.equals(t2) && t1.equals(t4) && t4.equals(t3);
        // equals method(equalsIgnoreCase) ALWAYS compares the value of the string objects.
        // Since all string objects have the same value(test). The comparison above
        // will be true.

        boolean sameObject = t1 == t2 ;  // false
        // t1 is a new object created in heap memory, and t2 is a string object
        // with test value in the string pool.
        // so even though they have the same value, they are not same object.

        sameObject = t2 == t3; // true
        // both t2 and t3 is a string object with test value in the string pool.
        // In string pool cannot create more than one object with same value,
        // so t2 and t3 is the same object in string pool memory.

        sameObject = t1 == t4;
        // Every time a new keyword is used a different object is created in the
        // heap memory regardless of the value. Therefore, t1 and t4 have the same value
        // but different object in heap memory.











    }









}
