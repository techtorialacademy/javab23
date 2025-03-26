package OOP.Inheritance.Ex3;

public class WearableSmartDevice extends SmartDevice{
    String strapMaterial; // Every wearable smart device will have strapMaterial.
    // A subclass must implement the constructor of the super class.
    // A child class must rewrite the existing constructors of the parent class.
    public WearableSmartDevice(String brand, int batteryLife, String strapMaterial){
        // You have to call the constructor of the super class.
        super(brand,batteryLife);
        this.strapMaterial = strapMaterial;
    }

    // Smart device will have a special implementation for the turn on method
    @Override
    void turnOn(){
        System.out.println("Please wait Wearable Smart Device to Load...");
        System.out.println("Wearable Smart Device is turning on....");
        System.out.println("This turn on method is from Wearable classs.");
    }

    void wear(){
   System.out.println("You are wearing a " + brand + " devices with a " + strapMaterial + " strap.");
    }

}
