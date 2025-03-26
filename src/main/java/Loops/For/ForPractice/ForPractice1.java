package Loops.For.ForPractice;

public class ForPractice1 {

    // Find sum of all the odd numbers between 1 and 100. both included.
    public static void main(String[] args){
        // odd numbers:
        // 1
        // 3
        // 5
        // 7
        // ...
        int sum = 0;
        for ( int odd = 1 ; odd < 100 ; odd+=2 ){
             sum += odd;
        }

        System.out.println("Sum of all odd numbers between 1-100 is "+ sum);




    }



}
