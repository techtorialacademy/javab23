package Objects;

public class AnimalTest {
    public static void main(String[]args){
        // Let's create an instance of the Animal class
        //       create an object of the Animal class
        Animal cat = new Animal();
        // This animal has defined properties(a.k.a. instance variables)
        // age, numberOfLegs, and name.
        // ---
        // Did we assign any value for the age attribute of Animal object named cat?
        // NO, which means the instance variable will take the default value.
        // For all numerical primitives -> 0 OR 0.0
        // For char -> ''
        // For boolean -> false
        // For all others -> null
        // ---
        // Let's try to learn the age of the Animal object named cat.
        System.out.println(cat.age); // 0

        // How could we assign value for the attributes of the Animal object named cat?
        // I know that the cat is 6 years old.
        cat.age = 6;

        System.out.println("Age of the Animal object named cat is " + cat.age);

        // Let's learn the name attribute value of the Animal object named cat?
        System.out.println("The inital value of the name attribute for the cat is "
        + cat.name
        );

        // Animal cat is named Stevie
        cat.name = "Stevie";
        System.out.println("After assignment the value of the name attribute for the cat is "
                + cat.name
        );

        Animal kangaroo = new Animal();
        kangaroo.name = "Steven";
        kangaroo.age = 11;
        System.out.println("Animal object named kangaroo's age is " + kangaroo.age);
        System.out.println("Age of the Animal object named cat is " + cat.age);


        System.out.
        println("Energy level of the Animal instance kangaroo is " + kangaroo.energyLevel);

        // Let's try to move the kangaroo
        kangaroo.move();

        // Let's feed the kangaroo animal
        kangaroo.eat();

        // Let's also sleep the kangaroo
        kangaroo.sleep();

        // Let's try to move the kangaroo again
        kangaroo.move();
        kangaroo.move();
        kangaroo.move();
        kangaroo.move();
        // we have moved the kangaroo 4 times









    }


}
