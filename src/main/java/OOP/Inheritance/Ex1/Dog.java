package OOP.Inheritance.Ex1;

public class Dog extends Animal{
    // This Dog class is also an Animal

    public void walksToPark(){
        System.out.println("Dog is happy walking to the park!!!");
    }

    // Eventhough we inherit makeNoise method from Animal class,
    // as a dog we make a specific sound and we would like to show this.
    // If you want to change the behavior of the method from parent class.
    // You should override the method.
    // Same method name, same returntype, same or more lenient access mdoifier.
    @Override
    public void makeNoise(){
        System.out.println("Dog is barking...!");
        System.out.println("Woof, woof woof wooooof!!");
    }

}
