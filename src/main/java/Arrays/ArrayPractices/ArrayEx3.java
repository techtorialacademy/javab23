package Arrays.ArrayPractices;

public class ArrayEx3 {
    public static void main(String[]args){
        int[] numbers = {4,2,990,22, 55, 304, 1, 300, 6, -34};
        // Find the largest number from the given array above.
        // Even if the values of array change, the program should still find the largest value.

        int largestValue = numbers[0];
        int smallestValue = numbers[0];

        for(int i =0 ; i< numbers.length ; i++){
            if (numbers[i] > largestValue ){
                largestValue = numbers[i];
            }
            if(numbers[i] < smallestValue){
                smallestValue = numbers[i];
            }
        }

        System.out.println("Largest value in the array is " + largestValue);
        System.out.println("Smallest value in the array is " + smallestValue);





    }
}
