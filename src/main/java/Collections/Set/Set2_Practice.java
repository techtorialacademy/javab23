package Collections.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Set2_Practice {

    // create a static method that will take parameter of Array list of integers
    // this method will find duplicate elements from given arraylist
    // >> can use set's add method return logic thiis method will return those
    // duplicate elements in another ArrayList
    // [ 3,5,6,8,9,0,0,10,11,3,4,6,5 ]
    // 3 , 5, 6, 0,
    // set add method return -> it returns true if it can add element to the set
    // it returns false if the set has the element and cannot add element.
    public static ArrayList<Integer> findDuplicates(ArrayList<Integer> numbers){
        ArrayList<Integer> bucket = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        // I will go through each number in the given numbers list.
        for(int number : numbers){
            if(!set.add(number)){ // if the set doesn't add the value
                bucket.add(number); // adding that value to the list.
            }
        }
        return bucket;
    }
    public static void main(String[]args){
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,3,5,6,11,8,9,0,0,10,11,3,4,6,5 );

        System.out.println(findDuplicates(nums));

    }

}
