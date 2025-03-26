package Primitives.Numerical.Practices;

public class Ex4 {
    // Create an integer variable and regardless of the value
    // your code should print the last digit of that number.

    public static void main(String[] args){
        int number = 4567;
        // think of the arithmetic operations like / or %
        // 32 % 10 -> 2 OR 46 % 10 -> 6 OR 101 % 10 -> 1
        // What do we find when we do with remainder 10 ->
        // we find the last digit of the number
        int lastDigit = number % 10 ;
        System.out.println("Last digit of the " + number + " is "+lastDigit + ".");

        // What should I do to get rid of (remove) the last digit of the number?
        // Regardless of value.
        // If the number is 641 -> 64 or 382 -> 38
        // If we divide by 10 then we will find the version of the number without last digit
        int withoutLastDigit = number / 10;
        System.out.println("Without last digit of the " + number + " is "+withoutLastDigit + ".");

        // Create a program to find sum of all the digits from an integer value with 4 digits.
        int $number = 4321; // The value is going to be an integer with 4 digits.
        // Code(Program) should work with every 4 digit integer value

        // Knowing that the number has 4 digits
        int fourthDigit = $number % 10;
        // How can I find the 3rd digit with this logic?
        // Maybe I can manipulate the number and make the 3rd digit last digit
        // If I can remove the last digit(fourthDigit) then the 3rd digit becomes the last one
        // in the number.
        int threeDigitVersion = $number / 10;
        int thirdDigit = threeDigitVersion % 10;
        // --
        int twoDigitVersion = threeDigitVersion / 10;
        int secondDigit = twoDigitVersion % 10;
        // --
        int firstDigit = twoDigitVersion / 10;
        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;

        System.out.println("Sum of all the digits: " + sum);



    }



}
