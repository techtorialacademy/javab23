package Collections.Map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Map5_Practice3 {

    // Each student in our program is represented with Map object.
    // Each student map object will contain the keys:
    // "FirstName", "LastName","Age","Gender","City"
    // All students will be stored in an ArrayList
    // So it will be like ArrayList<Map<String,Object>> allStudents

    // According to the information above;
    // Create a method that will take ArrayList of HashMaps as a parameter and will print
    // the name of the students who live in chicago.

    public static void findChicagoans(ArrayList<HashMap<String,Object>> allStudents){
        // Let's look at each student one by one.
        for(HashMap<String,Object> student: allStudents){
            if(((String)student.get("City")).equalsIgnoreCase("Chicago")){
                System.out.println("Student Name: " + student.get("FirstName") + " " +student.get("LastName"));
            }
        }

    }

    // create a method that will take ArrayList of HashMaps as a parameter
    // and find out all male students who are under the age of 26
    public static ArrayList<HashMap<String,Object>> findCriteria(ArrayList<HashMap<String,Object>> allStudents){
        // Let's look at each student one by one.
        ArrayList<HashMap<String,Object>> studentsWithCriteria = new ArrayList<>();
        for(HashMap<String,Object> student: allStudents){
            if(((String)student.get("Gender")).equalsIgnoreCase("M")
            &&
                    (Integer)student.get("Age") < 26
            ){
               studentsWithCriteria.add(student);
            }
        }
return studentsWithCriteria;
    }

    public static void main(String[]ar) throws FileNotFoundException{
        HashMap<String, Object> student1 = new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", 25);
        student1.put("Gender", "M");
        student1.put("City", "Chicago");
        HashMap<String, Object> student2 = new HashMap<>();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michealson");
        student2.put("Age", 15);
        student2.put("Gender", "M");
        student2.put("City", "High Park");
        HashMap<String, Object> student3 = new HashMap<>();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", 35);
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");
        HashMap<String, Object> student4 = new HashMap<>();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", 29);
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        // Creating a List of HashMaps
        ArrayList<HashMap<String, Object>> studentList = new ArrayList();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        System.out.println(studentList);

        findChicagoans(studentList);

        System.out.println(findCriteria(studentList));
      //    studentList.get(5);
       // String s = (String)studentList.get(0).get("Age"); // HashMap
      // System.out.println(5/0);
        ArrayList<String> s = null;
        // Value of s is null
        s.get(0);
       // FileInputStream fileInputStream = new FileInputStream(new File("No File"));

           FileReader f = new FileReader("example");



    }
}
