package OOP.Abstraction.Ex2;

public abstract class Device {


    private String brand;
    private int batteryLife;

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Device(String brand, int batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }
    public abstract void charge();

    // Concrete(non-abstract) method
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Battery: " + batteryLife);
    }

    public String getBrand() {
        return brand;
    }

    public int getBatteryLife() {
        return batteryLife;
    }



}
