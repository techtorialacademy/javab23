package Arrays;

import java.util.Arrays;

public class _3_ArraysSort {
    // Arrays.sort(arrayName);
    // method sorts the given array in ascending order.
    // Ascending means a-z or A-Z or smaller numerical value to larger numerical value.
    public static void main(String[]args){
        int[]numbers = {56,2,34,67,101,553,3,8,28,22,59,41,34};

        // Let's sort the array numbers above in ascending order(Smallest to Largest)
        Arrays.sort(numbers);

        // Now the numbers array is sorted in ascending order.
        System.out.println(Arrays.toString(numbers));

        // Sorting helps to find largest/smallest value from the numerical arrays.
        // At what index largest value should be located?
        // The largest value in sorted array is located at last index.
        System.out.println("Largest value is " + numbers[numbers.length-1]);

        // The smallest element is located at index 0.
        System.out.println("Smallest value is " + numbers[0]);


        // Let's look at sorting examples with String and char arrays.

        String  colors [] = {"amber","red","Yellow","orange","White","Green","Cyan","purple"};

        Arrays.sort(colors);

        System.out.println(Arrays.toString(colors));
        // Starting with upper case is before the starting with lower case.

        // char array sorting
        // It only uses the ascII table value
        char characters[] = {'3','e','y','W','a','Z','b','!','4'};

        Arrays.sort(characters);

        System.out.println("Sorted characters => " + Arrays.toString(characters));














    }
}
