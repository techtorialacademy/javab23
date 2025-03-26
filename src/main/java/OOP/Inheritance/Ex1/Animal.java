package OOP.Inheritance.Ex1;

public class Animal {
    // Which class does Animal class extend to?
    // Animal class extends to Object class at the moment.
    // An Animal class will automatically inherit all public and protected
    // behaviors, variables.

    String name;
    String color;
    int age;

    public void eat(){
        System.out.println("The animal is eating...");
    }

    public void sleep(){
        System.out.println("Animal is sleeping...");
    }

    public void makeNoise(){
        System.out.println("Animal makes a noise...");
    }




}
