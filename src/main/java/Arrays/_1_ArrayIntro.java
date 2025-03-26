package Arrays;

import java.util.Arrays;

public class _1_ArrayIntro {

    public static void main(String[]args){
        // Creation of arrays
        // Syntax formula:     dataType [] nameOfArray = new dataType[lengthOfArray];
//        int [] numbers = new int[4];
        // We have created an array, that holds 4 integer values in it.
        // When an array is created, all the elements inside the array will take
        // the default value of the data type that array is created.
        // Default values of data types:
        // All numerical types -> 0 OR 0.0
        // For char data type -> '' (empty char)
        // For boolean -> false
        // For anything else -> null (representation of nothing in java).

        // Since we have created numbers array and haven't changed any value,
        // all values in int array will take the default value of `int` data type.(0)
        int [] numbers = new int[4];
        // How could I see what is inside the numbers array?
        System.out.println(numbers);
        // When an array object is directly printed, you will see location of the array
        // in memory, which doesn't make any sense to humans.
        // To see what is inside an array we should use Arrays.toString(nameOfArray);
        System.out.println(Arrays.toString(numbers));

        // Create a string array
        String [] words = new String[3];
        // Let's print what is inside the array called words?
        System.out.println(Arrays.toString(words)); // [null, null, null]

        System.out.println("********************************************************************");
// ****************************************************************************************************
        // Second way of creating arrays.
        // Creating an array with preset values.
        // Syntax -> dataType[] nameOfArray = new dataType[]{element1,element2,element3};

        // let's create an integer array with 5 numbers in it which are 10,20,30,40,50
        //index numbers ->     0  1  2  3  4
        int[] nums = new int[]{10,20,30,40,50};
        // We have created an integer array called nums with the length of 5 and
        // it stores integer values(10,20,30,40,50) inside.
        System.out.println("nums array is " + Arrays.toString(nums));

        // How could we access to elements in the array individually?
        // Each element has a specific index number assigned which starts from 0.
        // syntax ->     nameOfArray[indexNumber]; -> this will give you the element located at
        // the index number.
        System.out.println(nums[3]); // 40
        // If I would like to create a variable
        int var1 = nums[2];

        // System.out.println(nums[11]);
        // What element will I get from index number 11?
        // ArrayIndexOutOfBoundsException
        // There is no element located at index number 11.
        // int[] nums = new int[]{10,20,30,40,50};
        // How could I learn the total number of elements in the array?
        // We use the length variable
        System.out.println("There is total " + nums.length + " elements in the nums array.");

        // Array is not immutable like a string so, we could change the individual
        // values of the array elements.
        // indexes                0  1  2  3  4
        // int[] nums = new int[]{10,20,30,40,50};
        // Let's change the 3rd value of the array with 100.
        // Use the index number 2.

        nums[2] = 100;
        // Element located at index number 2 will have the new value as 100.
        System.out.println(Arrays.toString(nums));

        // Let's find the square of the first element and then assign it to the last element
        // in array.
        int squareOfFirstElement = nums[0] * nums[0];
        // To find the last element I need to use last index in array.
        // last index is always 1 less than the length.
        // last index in array is -> nums.length -1
        nums[ nums.length -1 ] = squareOfFirstElement;
        System.out.println(Arrays.toString(nums));



























    }



}
