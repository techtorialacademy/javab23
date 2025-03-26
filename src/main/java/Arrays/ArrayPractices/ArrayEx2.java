package Arrays.ArrayPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    // ask user, how many names s/he wants to store
    //  get those names from user one by one
    // store those names in an array
    // at the end print entire array with names

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names that you want to enter: ");
        int sizeOfArray = scanner.nextInt();
        scanner.nextLine();
        // If you want to use scanner.nextLine after any other scanner method
        // use one empty scanner.nextLine() method.

        // How many times should I ask user to enter a name?
        // As many times as the ->sizeOfAnArray<-
        String names[] = new String[sizeOfArray];

        for(int i =0 ; i < names.length ; i++){
            System.out.println("Please enter the name: ");
            String name = scanner.nextLine();
            names[i] = name;
        }

        System.out.println("All the names you gave to me is " + Arrays.toString(names));





    }






}
