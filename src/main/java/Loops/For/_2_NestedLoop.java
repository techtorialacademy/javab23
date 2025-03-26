package Loops.For;

public class _2_NestedLoop {
    // Using a loop inside another loop
    // There is a two loop ;
    // Loop that is containing the other loop is called Outer;
    // Loop inside another loop is called Inner;
    // For each execution in the outer loop,
    // all iterations of an inner loop is completed.
    public static void main(String[]args){

        OUTER: for (int i = 1 ; i < 5 ; i++){
        System.out.println(i);
            INNER: for(char ch = 'a' ; ch<'d' ; ch++ ){
                System.out.println(ch);
            }
        }



    }


}
