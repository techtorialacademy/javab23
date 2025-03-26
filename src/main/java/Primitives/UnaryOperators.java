package Primitives;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class UnaryOperators {

    // Decrement -> -- -> it decreases the value of variable by 1
    // Increment -> ++ -> it increases the value of variable by 1
    public static void main(String[]args) {
        int number = 8;
        System.out.println(number); // 8

        // To change the value of number we could use
        // pre-increment or pre-decrement
        // post-increment or post-decrement
        // Pre operations do the increase/decrease right away.
        // Post operations use the original value then increase/decrease after.

        System.out.println("Value of the variable number is " + number); //8

        System.out.println("--number -> " + --number); // 7

        System.out.println("number -> " + number); // 7

        System.out.println("++number -> " + ++number); // 8

        System.out.println("number -> " + number); // 8

        // -- Post operation

        // Value of the variable number is currently 8
        System.out.println("number++ -> " + number++); // 8
        // At the next usage of the number variable it will be increased by 1
        System.out.println("number -> " + number); // 9

        System.out.println("number-- -> " + number--); // 9

        System.out.println("number -> " + number); // 8

        int num = 10;

        int num2 = num++ - num-- + ++num + --num + num++ + 2; // 32
        System.out.println(num2 );
        System.out.println(num); // 11

        int a = 1;

        boolean r1 = a == a--;
        System.out.println("a == a-- -> " + r1); //true

















    }










}
