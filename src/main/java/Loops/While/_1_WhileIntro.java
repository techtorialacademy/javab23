package Loops.While;

public class _1_WhileIntro {
    public static void main(String[]args){

        int num = 3;

        while (num < 7){
            System.out.println(num++);
            // first iteration  -> 3
            // second iteration -> 4
            // third iteration  -> 5
            // fourth iteration -> 6
        }
        // outside the loop
        System.out.println("The value of the num outside the loop -> " + num); //7

        // let's try to imagine output of the code above

        // Let's try to print numbers from 10 to 0 both included.
        // 10
        // 9
        // 8
        //...
        //...
        //...
        // 0
        int number = 10;
        while (number >= 0 ){
            System.out.println( number-- );
        }








    }



}
