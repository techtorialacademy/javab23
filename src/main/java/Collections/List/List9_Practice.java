package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List9_Practice {
    // Given a list of integers print the version that list contains only last
    // digit of elements.
    // [1, 22, 93] -> [1,2,3]
    // [16, 8, 886, 8, 1] -> [6, 8, 6, 8, 1]
    // If you want to get last digit of a number find remainder with 10.

    public static void main(String[]args){
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers,16, 8, 886, 8, 1);
        List<Integer> lastDigits = new ArrayList<>();
        for(int number: numbers){
            int lastDigit = number % 10;
            lastDigits.add(lastDigit);
        }

        System.out.println(lastDigits);



    }

}
