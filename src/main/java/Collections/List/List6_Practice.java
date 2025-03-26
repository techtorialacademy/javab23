package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List6_Practice {
    //    Given an list of integers, write a program to remove duplicate
    //    elements and print the list with unique values only.
    /*
        Input: [4, 5, 4, 8, 5, 2, 2, 8]
        Output: [4, 5, 8, 2]
    */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 5, 4, 8, 5, 2, 2, 8);
        List<Integer> newBox = new ArrayList<>();
        for(int number : numbers){
            if(!newBox.contains(number)){
                newBox.add(number);
            }
        }

        System.out.println(newBox);
    }
}
