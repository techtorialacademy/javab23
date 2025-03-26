package Primitives.Boolean;

public class Bool3 {

    public static void main(String[]args){
        int number = 0;
        // Print true if the variable `number` is positive,
        // print false if the variable `number` is not positive.
        // Note! 0 is neither a positive or is negative.
        // Create your logic below and your code should print the
        // correct answer regardless of the value.

        // What makes the number positive?
        // when a number is bigger than 0

        boolean isPositive = number > 0;
            // When do I want isPositive to be true?
            // 1. when number is less than 0
            // 2. when number is less than equals 0
            // 3. when number is bigger than 0
            // 4. when number is bigger than equals 0
        System.out.println("Is number a positive number? -> " + isPositive);

    }
}
