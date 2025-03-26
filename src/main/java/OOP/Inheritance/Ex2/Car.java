package OOP.Inheritance.Ex2;

public class Car extends Vehicle{
    String model;
    double engineSize;

    // Let's override the move method.
    // To get a safety certification we have to stop the car
    // after move method.
    // to call a super class variables or methods use `super` keyword.
    @Override
    public void move(){
        System.out.println("Car is moving");
        super.stop(); // Stop method comes from the super class.
    }

    @Override
    Vehicle accelearate(){
        // I want to assign a model for vehicle and car
        // To call the variable from super class use super
        // to call it from this class use this keyword
        super.model = "Sedan";
        this.model = "GT";
        return new Car();
    }


}
