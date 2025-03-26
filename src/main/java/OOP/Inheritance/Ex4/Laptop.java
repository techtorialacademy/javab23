package OOP.Inheritance.Ex4;

public class Laptop extends Computer{
    double weight;

    public Laptop(String brand, int memory, double weight) {
        super(brand, memory);
        this.weight = weight;
    }
    @Override
    public void boot(){
        System.out.println("Laptop is booting up... ");
    }

    public void closeLid(){
        System.out.println("Sleeping the laptop.");
    }

    //2) Class: Laptop (extends Computer)
//    Fields
//
//    weight (double) – represent laptop’s weight (in kg or lbs).
//    Constructor
//
//    Laptop(String brand, int memory, double weight)
//    Pass brand and memory to the parent Computer constructor using super(brand, memory).
//    Methods
//
//    Override boot(): print something like "Laptop is booting up..."
//    Optionally add a custom method closeLid(): print "Laptop lid is closed."

}
