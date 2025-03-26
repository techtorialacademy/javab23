package Loops.For.ForPractice;

public class ForPractice7 {

        /*

        create times tables for numbers 1 to  20 up to 12s
        1 * 1 = 1
        1 * 2 = 2
        ...
        1 * 12 = 12
        -----
        2 * 1 =2
        2 * 2 = 4
        ..
        2 * 12 = 24
        ----
        20 * 1 = 20
        20 * 2 = 40
        ...
        20 * 12 = 240

         */
    public static void main(String[]args){

        OUTER: for(int i = 1 ; i<=20 ; i++){
            INNER: for(int j = 1 ; j<=12 ; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }


        }













    }













}
