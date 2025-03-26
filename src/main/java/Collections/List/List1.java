package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    // ArrayList is a Java class that implements List interface
    // List interface extends the SequencedCollection interface
    // SequencedCollection Interface extends the Collection interface.
    // ArrayList IS A List IS A SequencedCollect IS A Collection
    public static void main(String[]args){
        // Create simple ArrayList Object
        ArrayList<Object> listOfObjects = new ArrayList();

        System.out.println(listOfObjects); // []
        // because the created list is empty

        // how do we add elements to the list
        // add() method
        listOfObjects.add("first Value");
        System.out.println(listOfObjects); // [first Value]

        // ---
        // We could create a polymorphic list as well.
        List<Object> objectList = new ArrayList<>();

        System.out.println(objectList); // []
        // how do we add elements to the list
        // add() method

        objectList.add("new object");
        System.out.println(objectList); // [new object]

        // You could add as many object as you want
        objectList.add("new object2");
        objectList.add("new object3");
        objectList.add("new object4");
        objectList.add("new object5");
        System.out.println(objectList); //

        // I could learn the number of elements inside the list using size() method
        System.out.println("Size of the objectList is " + objectList.size());

        // We could access individual elements from the list using get method.
        // We need to provide index number of elements in the get method as a
        // parameter

        System.out.println("Second element in the list is " + objectList.get(1));

        // Let's access the last element in the list
        System.out.println("Last element is " +
                objectList.get(objectList.size()-1));





    }
}
