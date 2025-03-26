package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class E_Practice2 {


    public static void main(String[]args)throws FileNotFoundException {
        // We want to create a filereader which throws a checked exception
        try {
            FileReader fileReader = new FileReader("Any");
        }catch (FileNotFoundException f){
            System.out.println("We caugh the exception.");
        }

        printGivenString(null);


    }

    public static void printGivenString(String msg){
        // If the given srtring msg is null or empty,
        // I want to throw an exception
        if(msg == null || msg.isEmpty()){
            throw new IllegalArgumentException("Given value is empty or null");
        }
       System.out.println(msg);
    }
}
