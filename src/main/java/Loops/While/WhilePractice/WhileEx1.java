package Loops.While.WhilePractice;

public class WhileEx1 {
    // Print out all the even numbers from 0 to 500 using while loop.
    // both 0 and 500 is not included.

    // 1. I need to find out if a number is even or not
    // 2. I need to repeat the step 1 for each number from 0 to 500.
    public static void main(String[] args){
        int num = 1;
        while( num < 500 ){
            if ( num % 2 == 0 ){
                System.out.println(num);
            }
            num++;

        }







    }




}
