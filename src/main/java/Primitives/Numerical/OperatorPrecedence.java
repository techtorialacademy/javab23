package Primitives.Numerical;

public class OperatorPrecedence {
    public static void main(String[]args){

        // In the arithmetic operators:
            // remainder,division and multiplication have more precedence
            // than addition and subtraction.
        // If there are more than one arithmetic operator in an expression,
        // one that has more precedence will be completed first.

        int num1 = 8, num2 = 5;

        int result1 = num1 + num2 + num2 / 2;

        // in the expression complete the operator with higher precedence first:
            // num1 + num2 + 2;
            //  13 + 2
            // 15
        System.out.println("Result of num1 + num2 + num2/2 ->  " + result1);


        int result2 = 15 / 2 / 5 * 7 + 21 / 3 / 3 * 2;

        System.out.println(result2); // 11

        // Using parantheses improves the precedence.
        // In an expression inside the parentheses will be completed first

        int result3 = 15 / 2 + 3; // 10  execute division first then add 3
        int result4 = 15 / (2 + 3);// 3 execute parentheses then do the arithmetic
        // operation.

        System.out.println("15 / 2 + 3 is " + result3);
        System.out.println("15 / (2 + 3) is " + result4);

        int result5 = ( 12 + 3 * ( 6 - 2 ) ) / 8 - 2 % ( 10 - 6 ); // 1

        System.out.println("( 12 + 3 * ( 6 - 2 ) ) / 8 - 2 % ( 10 - 6 ) ");
        System.out.println("The result of the expression above is -> " + result5);







    }


}
