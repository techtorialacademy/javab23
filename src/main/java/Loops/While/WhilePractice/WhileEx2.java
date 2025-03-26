package Loops.While.WhilePractice;

public class WhileEx2 {
    // Find out all the numbers that are divisible by 7 and 3 between
    // 0 and 200. 0 and 200 is not included.
    public static void main(String[]args){
        int num = 1;

        while ( num < 200 ){
            // How could I check if the number is divisible by 7 and 3?
            if ( num % 7 == 0 && num % 3 == 0 ){
                System.out.println(num);
            }

            num++;
        }





    }




}
