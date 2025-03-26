package OOP.Abstraction.Ex1;

public final class WashingMachine extends Appliance{

    // This is a concrete class. Not an abstract class.
    // As a concrete class extending the abstract class:
    // 1. Implement the constructor of the parent class
    // 2. Implement the method body of abstract methods.
    private int capacity;
    // Constructor
    public WashingMachine(String brand,int capacity){
        // call the super class constructor
        super(brand);
        this.capacity = capacity;
    }
    // Must implement the body of the abstract methods
    @Override
    public void turnOn(){
        System.out.println("Washing machine is turning on.....");
        System.out.println("Capacity of this machine is " + capacity + "lbs.");
    }

    public void startWashCycle(){
        System.out.println("Wash cycle starte.");
    }




}
