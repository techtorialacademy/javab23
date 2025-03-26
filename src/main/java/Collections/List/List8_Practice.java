package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List8_Practice {
    // Given list of strings, write a program to count how many times each
    // element appears in the list regardless of the case.
    //  Input: ["a", "b", "b", "c", "a", "b", "c", "D", "d","A"]
    // Output:
    // a appears 3 times
    // b appears 3 times
    // c appears 2 times
    // d appears 2 times
    public static void main(String[] args) {
        List<String> givenList = new ArrayList<>();
        Collections.addAll(givenList,
                "a", "b", "b", "c", "a", "b", "c", "D", "d", "A");
        List<String> checkedValues = new ArrayList<>();

        for(String letter: givenList){
            // letter
            int count = 0;
            if(!checkedValues.contains(letter.toLowerCase())){
                // I need to check the count of letter
                for(String element: givenList){
                    if(letter.equalsIgnoreCase(element)){
                        count++;
                    }                }
                // We finished checking the value count
                System.out.println(letter +" repeats " + count +" times in the list.");
                checkedValues.add(letter.toLowerCase());
            }
        }








    }
}
