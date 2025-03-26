package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args){
        // To add an object to the list we could use add method

        List<String> words = new ArrayList<>();

        // let's add some string values to the list
        words.add("cloud");
        words.add("automation");
        words.add("auto-scaling");

        // We could print out the list
        System.out.println("words: " + words);

        // let's try to add a different data type
         // words.add(5); Compile time error, incompatible type

        // List can only consist of Object and Subclass of object(every class in java).
        // We cannot add a primitive data type to a list.

       // List<int> numbers = new ArrayList<>(); Compile time error.
        // To add primitive values to the list object we are going to use
        // Object class of primitives which are known as wrapper classes.
        // int -> Integer
        // double -> Double
        // short -> Short
        // char -> Character
        // boolean -> Boolean
        // byte -> Byte
        // float -> Float
        // long -> Long
        // If you want to create a List that stores integer values you can:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);

        System.out.println(numbers);



        // ---
        // we could access to the elements using indexes

        List<String> letters = new ArrayList<>();

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");
        letters.add("i");
        letters.add("j");
        letters.add("k");
        // These elements are added sequentially. So index numbers will be corresponding
        // to the order of addition to the list.
        System.out.println(letters);// [a, b, c, d, e, f, g, h, i, j, k]
        System.out.println(letters.get(5)); // f
       //  System.out.println(letters.get(15)); indexoutofbounds exception
        // there is no element located at index number 15.

        // last index is always one less than the total elements in the list.
        // to find total number of elements in the list we can use size() method
        System.out.println("Size of letters: " + letters.size());

        // Last index is
        System.out.println("Last index in the letters is " + (letters.size()-1));

        // add method is overloaded
        letters.add(4,"TEST");
        // add method above will add given element to the provided index number
        System.out.println(letters); // [a, b, c, d, TEST, e, f, g, h, i, j, k]

        // using invalid index number
      //  letters.add(-2,"HELLO"); indexoutofbounds exception
      //   letters.add(22,"HELLO");// indexoutofbounds exception

        System.out.println(letters);







    }
}
