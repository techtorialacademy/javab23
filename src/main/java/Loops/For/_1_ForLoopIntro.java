package Loops.For;

public class _1_ForLoopIntro {

    public static void main(String[]a){

        // let's print numbers from 6 to 1.

        for( int i = 6 ; i >= 1 ; i-- ){

            System.out.println(i);

        }

        // let's print multiples of 3 from 3 to 100
        // 3
        // 6
        // 9
        // 12
        // 15
        // ...

        for( int i = 3 ; i < 100 ; i += 3 ){
            System.out.println(i);
        }
        // same functionality as above with while loop
        int number = 3;
        while ( number < 100 ){
            System.out.println("Number: " + number);
            number += 3;
        }


    }


}
