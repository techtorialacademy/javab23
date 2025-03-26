package OOP.Inheritance.Ex1;

public class TestInheritance {

    public static void main(String[]args){
        Dog oliver = new Dog();
        oliver.name = "Ollie";
        oliver.age = 4;
        oliver.color = "gold-brown";
        oliver.sleep();

        oliver.makeNoise();

        Dog maxxine = new Dog();
        maxxine.color = "black";
        maxxine.age = 5;

        System.out.println(maxxine.equals(oliver));

        // Dog Is an Animal and Animal Is An Object
        // Dog is also an object







    }
}
