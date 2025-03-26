package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List7_Practice {
    // Given list of integers, write a program to find the
    // difference between the maximum and the minimum values in the list.
        /*
        Example:
            Input: [8, 2, 14, 5, 9]
            Output: 12 (14 - 2)
              */
    public static void main(String[]args){
        // 1. find the maximum
        // 2. find the minumum
        // 3. Arithmetic operation
        // Step 1
        // How could I find the largest value ?
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,8, 2, 14, 5,92, 9,0);
        int min = numbers.get(0);
        int max = numbers.get(0);

        for(int number : numbers){
            if(number > max){
                // I found a bigger value in the list then what I have assumed.
                max = number;
            }
            if(number < min){
                // I found a smaller value in the list then what I have assumed.
                min = number;
            }

        }

        System.out.println("Maximum value is " + max + ".");
        System.out.println("Minimum value is " + min +".");
        System.out.println("The difference is " + (max - min));





    }
}
