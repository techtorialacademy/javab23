package StringObject.StringMethods;

public class _8_SubstringMethod {
    // Substring Method
    // Returns: String value
    // Purpose: Get portion of the string
    // Syntax: it is an overloaded method, which means this method could work with
    // different parameters.
    // str1.substring(startingIndex,endingIndex);
    // str1.substring(startingIndex);
    public static void main(String[] arg){
        //          012345
        String s = "python";

        // Starting index will be included in end result, but ending index WILL NOT be
        // included.
        String sbstrng1 = s.substring(2,5); // tho
        String sbstrng2 = s.substring(2); // thon
        // What happens when ending index is not provided in the substring method?
        // All the characters from starting index till the end of string is
        // included.
        //             0123456
        String text = "testing";

        String str1 = text.substring(3,5); // ti

        String str2 = text.substring(1); // esting

        // String str3 = text.substring(3,11); // indexOutOfBounds Exception
        // We cannot use indexes larger than the length of the string to get characters or
        // cut out of a portion from the string.

        // String str3 = text.substring(5,3); IndexOutOfBoundsException
        // substring method only works from left to right, so there is no index
        // in range from 5 to 3.


        String str = "world";
        // how do we get the last 2 characters from the string above?
        // If I start from second to last index till the end of string,
        // I would achieve the last two characters.
        // What is the last index in string ?
        // str.length()-1
        // What is the second to last index in string?
        // str.length()-2;
        String lastTwoChs = str.substring(str.length()-2);
        System.out.println(lastTwoChs);
        // How do you get last 3 characters from string?
        String lastThreeChs = str.substring(str.length()-3);

        // last character ->> str.substring(str.length()-1);
        // last two ->>str.substring(str.length()-2);
        // last three ->> str.substring(str.length()-3);





    }


}
