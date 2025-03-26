package Primitives.Boolean;

public class Bool4 {
    public static void main(String[]args){
        int number = 76;

        // Create a program that will print true when a variable number
        // has even value. And print false otherwise.
        // even numbers are divisible perfectly by 2, odd numbers leave 1 left
        // over when divided by 2.
        // even nums -> 2,4,6,8 ... odd nums -> 1,3,5,7,9 ... etc.

        // What is the condition to call a number even?
        // When they can be perfectly divided by 2.
        // How could we check if a number is perfectly divisible by 2 with code?
        // There should be no remaining value after dividing by 2.

        boolean isEven = number % 2 == 0;
        System.out.println("Is the number even -> " + isEven);







    }

}
