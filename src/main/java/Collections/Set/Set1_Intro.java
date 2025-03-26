package Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Set1_Intro {
    public static void main(String[]args){
        // Creation of set
        HashSet<String> words = new HashSet<>();
        // Creating the set as a polymorhic object
        Set<String> letters = new HashSet<>();

        // Set doesn't allow duplicate elements to be stored in.
        // HashSet doesn't have indexes, and unordered.
        // To add an element in to the set collection
        letters.add("a");
        letters.add("b");
        System.out.println(letters.size()); // 2

        System.out.println(letters);

        // How about if you try to add duplicate element to the set.
        letters.add("a");
        // No size or element changes.
        System.out.println(letters.size()); // 2

        System.out.println(letters);

        // Set don't have indexes so to loop through the set
        for(String letter : letters){
            System.out.println(letter);
        }
        // Set we can remove elements as well

        letters.remove("c"); // Nothing happens "c" is not an element of letters set.
        System.out.println(letters);

        letters.remove("b");// Since the b is an element of set, it'll be removed.
        System.out.println(letters);

        // To remove all elements in the set you could use .clear() method.
        letters.clear(); // this makes the set empty set.

        // To understand if the set is empty we can use .isEmpty() method
        System.out.println("Is the set empty? " + letters.isEmpty());

        // Just like the list, we could add multiple elements to the set collection using
        // Collections.addAll()method.
        Collections.addAll(letters,"a","b","c","d","e");

        System.out.println(letters);

    }
}
