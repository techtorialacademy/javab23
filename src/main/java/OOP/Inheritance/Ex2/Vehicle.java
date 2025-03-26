package OOP.Inheritance.Ex2;

public class Vehicle {
    Vehicle accelearate(){
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        return vehicle;
    }

    protected String model;
    int year;
    public String brand;

    // Common behaviors for all vehicles
    public void move(){
        System.out.println("Vehicle is moving...");
    }

    public boolean stop(){
        System.out.println("Vehicle is stopping..");
        return true;
    }
    protected boolean start(){
        System.out.println("Vehicle is getting faster and faster...");
        return true;
    }
}
