package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[]args){
        // Replacing the element in the list
        List<String> letters = new ArrayList<>();

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        //                              0  1  2  3  4  5
        System.out.println(letters);// [a, b, c, d, e, f]

        // I want to replace the 4th element with uppercase D
        // 4th element has the index number 3

        // use set method .set(indexNumber, newElement);
        letters.set(3, "D");
        //                              0  1  2  3  4  5
        System.out.println(letters);// [a, b, c, D, e, f]

        // Providing an invalid index will cause indexoutofbounds exception
        // letters.set(10,"Hello");

        // we could remove elements from the list.
        // remove() method
        // remove method is overloaded method:
        // 1. .remove(indexNumber) -> removes the element located at given index
        // 2. .remove(object)      -> removes the given element from the list
        System.out.println(letters);// [a, b, c, D, e, f]

        letters.remove("D");
        System.out.println(letters);// [a, b, c, e, f]

        letters.remove(3);
        System.out.println(letters);// [a, b, c, f]




    }
}
