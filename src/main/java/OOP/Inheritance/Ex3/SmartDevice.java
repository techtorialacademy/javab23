package OOP.Inheritance.Ex3;

public class SmartDevice {
    // Common properties of all smart devices.
    String brand;
    int batteryLife;

    public SmartDevice(String brand, int batteryLife){
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    // Instance Methods/ Object Behaviors
    void turnOn(){
        System.out.println(brand + " device is turning on.");
        System.out.println("This turn on method is from Smart device class.");
    }

    void turnOff(){
        System.out.println(brand + " device is turning off.");
        System.out.println("This method is from Smart device class.");
    }

    SmartDevice getSmartDevice(String brand, int batteryLife){
        return new SmartDevice(brand,batteryLife);
    }
    //
    public void displayInstructionManual(){
        System.out.println("All smart devices comes with battery.");
        System.out.println("Any problem with battery please go to closest shop.");
    }
    // General message about all smart device
    static void generalWarning(){
        System.out.println("All smart devices comes with their own risks.");
        System.out.println("Please read the instructions from" +
                " instructions manual.");
    }
}
