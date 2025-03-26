package Exceptions;

import java.io.IOException;

public class E_Practice1 {
    public static void main(String[]args){
        // Handle the exceptions

        String s = "Hello";
         // The code below might throw an exception so I will handle it.
        try {
            s.charAt(30);
        }catch (IllegalArgumentException e){
            System.out.println("There was an StringIndexOutOfBoundsException" +
                    " in the try block.");
        }finally {
            System.out.println("This print is in the finally block");
        }

        // you could be specific or more general
       // Whether or not you catch the exception, OR
        // there is an exception or not,
        // the finally block ALWAYS RUNS.


    }
}
