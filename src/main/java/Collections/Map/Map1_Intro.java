package Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map1_Intro {

    public static void main(String[]args){
        // Map Contains Key and Value pairs.
        // Usually map is used to describe real life objects.
        // If we want to describe a student information
        // age:  22
        // city: Chicago
        // interest: Testing Software
        HashMap<String,Object> student = new HashMap<>();

        student.put("age",22);
        student.put("city","Chicago");
        student.put("interest","Testing");

        System.out.println(student);

        // HashMap is unordered
        // In Map objects, keys cannot be duplicated.
        System.out.println("student.put(\"city\",\"Houston\");");
        student.put("city","Houston");
        System.out.println("Then map becomes -----");
        System.out.println(student);
        // --- when the existing key in map used in put method again, the value of the key is updated.

        // We could learn the size of the map with size() method.
        // Since the student map has 3 key-value pairs, the size of it will be 3.
        System.out.println(student.size());

       // Map values can be duplicated.
        // let's add a grade number for student from 0-100
        student.put("grade",22);
        System.out.println("student.put(\"grade\",22);");
        System.out.println("Then map becomes------");
        System.out.println(student);

        // How can we access the elements(key-pairs) of the map?
        // Since the map is unordered, we cannot use indexes.
        // We could use `key`s to access values?

        // I want to learn the age of student, how?
        System.out.println("Age of student: " + student.get("age"));
        // get() method gives the value of the provided key from the map.

        // What happens when non-existent key is used?
        System.out.println("Non-existent key: " + student.get("Houston"));
        // get() method returns `null` when non-existent key is given.

        // To remove key-pair from the map,provide key to the remove() method.

        student.remove("grade");
        System.out.println("student.remove(\"grade\");");
        System.out.println("Then map becomes------");
        System.out.println(student);









    }
}
