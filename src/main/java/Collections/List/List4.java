package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List4 {
    public static void main(String[]args){
        List<Integer> numbers = new ArrayList<>();

        // How could I add multiple elements to the list in a single line?
        // Since List implements Collections, we could use Collections.addAll method.
        // Collections.addAll(nameOfList,elemen1, element2, element3, ....);
        Collections.addAll(numbers,1,2,3,4,5,6,7,8);

        System.out.println(numbers);

        // remove method works with indexes and objects
        numbers.remove(new Integer(8));
       // In List of Integers, if you try to remove value it will not work.
        // it will always understand as indexNumber.
        // If you want to remove the integer value specifically not the index.
        // you have to provide value as new Integer(valueToRemove);
        System.out.println(numbers);


        // [1, 2, 3, 4, 5, 6, 7]

        // .contains(Element e); method.
        // This method returns a boolean value depending on if the list contains element.
        // If so the method returns true, otherwise false.

        // [1, 2, 3, 4, 5, 6, 7] -> numbers list

        System.out.println("Numbers list contains 11 " + numbers.contains(11));

        System.out.println("Numbers list contains 4 " + numbers.contains(4));

        // clear method to remove all elements from the list

        numbers.clear();
        System.out.println("Numbers list is now empty ->  " + numbers);

        // isEmpty();
        // returns a boolean value, if the list is empty it returns true, false otherwise.
        System.out.println("Is numbers list empty? " + numbers.isEmpty());

        Collections.addAll(numbers,1,2,3,4,5,6,7,8);

        System.out.println("NUmbers list -> " + numbers);

        System.out.println("Is numbers list empty? " + numbers.isEmpty());

        // We could get the index of elements using indexOf method
        // Let's learn the integer value 6's index number
        System.out.println("Index number of the value 6 is " + numbers.indexOf(6));

    }
}
