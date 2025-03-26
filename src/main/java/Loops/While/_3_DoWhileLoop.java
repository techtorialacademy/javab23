package Loops.While;

public class _3_DoWhileLoop {

    // Do while loop is used when at least one execution of a loop body
    // is necessary.
    // After the first execution it will check the condition
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        while (a < b){
            System.out.println("hello");
        }
        // When the loop above is executed, will the loop body be iterated?
        do{
            System.out.println("Do while loop");
        }while ( a < b );

        int num = 5;

        do{
            System.out.println(num);
            num--;
        }while (num > 0);







    }



}
