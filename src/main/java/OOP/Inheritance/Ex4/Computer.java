package OOP.Inheritance.Ex4;

public class Computer {

    String brand;
    int memory;

    public Computer(String brand, int memory) {
        this.brand = brand;
        this.memory = memory;
    }

     public void boot(){
        System.out.println("Computer is booting up...");
    }
    public void shutDown(){
        System.out.println("Computer is shutting down...");
    }
    public void displaySpecs(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Memory in GB: " + this.memory);
    }

    //    1) Class: Computer
//            Fields
//
//    brand (String)
//    memory (int) – represent the memory (in GB).
//    Constructor
//    Computer(String brand, int memory)
//    Methods
//
//    boot(): print "Computer is booting up..."
//    shutdown(): print "Computer is shutting down..."
//    displaySpecs(): print out brand and memory in a readable format

}
