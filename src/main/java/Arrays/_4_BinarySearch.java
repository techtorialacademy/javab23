package Arrays;

import java.util.Arrays;

public class _4_BinarySearch {
    // Arrays.binarySearch(arrayName);
    // It uses a binary search algorithm. Instead of checking every element
    // one by one, it repeatedly divides the array in half, which makes the search
    // run much faster on large arrays.
    // Precondition: Array must be sorted for this method to work.
    // This method returns the index of the element if found in array.
    // If it cannot find the element it returns a negative value.
    // This negative result isn’t random—it’s calculated as -> -(insertion point) - 1 <-
    public static void main(String[]args){
        int[] numbers = {1, 3,5, 7, 9};
        // we have sorted numbers array
        System.out.println(Arrays.binarySearch(numbers,7));

        int index1 = Arrays.binarySearch(numbers,5);
        System.out.println("Index of number 5 in the array is "+ index1);

        int index2 = Arrays.binarySearch(numbers,4);
        // There is no value 4 in the array, so the binarySearch will return a negative value.
        // Let's imagine what would be the index number of value 4, if it was in the array
        // Index number of value 4 would have been 2 but it doesn't exist in array.
        // So the binary search will return  -(insertion point) - 1 -> -2 - 1 -> -3
        System.out.println("Binary search for value 4 -> " + index2 ); // -3

        int index3 = Arrays.binarySearch(numbers,11);
        // -(insertion point) - 1
        // Index number of 11 in sorted numbers array WOULD HAVE BEEN 5
        // -5 -1 -> -6
        System.out.println("Index number of 11 is " + index3);







    }
}
