package OOP.Abstraction.Ex2;

public class Phone extends Device{

    public Phone(String brand, int batteryLife) {
        super(brand, batteryLife);
    }

    public void charge(){
        System.out.println("Phone is charging...");
        super.setBatteryLife(100);
        System.out.println("Your phone is fully charged now.");
    }


}
