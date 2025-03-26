package Objects;

public class AnimalTest2 {

    static public void main (String[] hello){

        Animal a1 = new Animal();
        Animal a2 = new Animal();

        // I have created 2 animal objects from an Animal class.
        // All the instance variables for the objects are assigned with default values.
        System.out.println(a1.age);
        System.out.println(a2.name);

        // I want to create a system whenever a user creates an object out of an animal class
        // they must be required to give name, age
        // To do that, a constructor that takes one string and one integer parameter should
        // be created in the Animal class. it would look like
        /*
        String name;
        int age;
        public Animal(String givenName, int givenAge){
        name = givenName;
        age = givenAge;
        }
         */
        // Constructor
        // Every time an object is created a constructor of the class is called.
        // There is no exception to the rule above.
        // If no EXPLICIT constructor is created, java will create a default constructor
        // for the class itself.
        // In another words, it is safe to say that constructor is a method (without return type
        // with same name as the class)
        // that is called with a new keyword to create an object.


        a1.sleep();





    }


}
