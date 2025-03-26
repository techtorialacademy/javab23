package Primitives.Numerical;

public class IntegerType {
    // int
    // range 2.14 billion to -2.14 billion
    // Use: This is by far the **most** common whole number data type.
    public static void main(String[]args){
        int a = 10;
        // We could print the value of variable a by simply calling its name.
        int b = 5;

        a = a + b; // 1. Right side of the equation will be completed and then the result
        // will be assigned as a new value to variable a.

        System.out.println(a + b); // 20

        // Let's continue to execute arithmetical operations between integer values
        int num1 = 12;
        int num2 = 5;
        // What will be the data type of num1 / num2 and the result of this operation?
        // 1. the data type of the division will be int because both num1 and num2 is integer
        // 2. The value of the result will be
        System.out.println("num1 divided by num2 is " + num1 / num2);

        // Every arithmetical operation between int variables will result in integer value.

        // Remainder operator gives the left over value after a perfect division.





        // 37 % 4 -> 1

        // 13 % 7 -> 6

        // 4 % 8 -> 4

        // If I have 46 cookies and 8 kids. After equally distributing cookies to the kids
        // how many cookie will be left over?

        int totalCookies = 46;
        int numberOfKids = 8;

        // To find out number of cookies for each kid I should divide totalCookies to
        // numberOfKids

        int cookieNumberForEachKid = totalCookies / numberOfKids;
        int leftOverCookies = totalCookies % numberOfKids;

        System.out.println("Each kid will get "+cookieNumberForEachKid + " cookies.");
        System.out.println("After an equal distribution of cookies there will be "
                + leftOverCookies + " cookies left.");

































    }




}
