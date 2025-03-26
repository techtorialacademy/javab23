package OOP.Inheritance.Ex3;

public class SmartWatch extends WearableSmartDevice{
    // Let's add some instance variables for smart watch
    boolean heartRateMonitor;
    boolean camera;

    public SmartWatch(String brand, int batteryLife, String strapMaterial,boolean heartRateMonitor){
        super(brand,batteryLife,strapMaterial);
        this.heartRateMonitor = heartRateMonitor;
    }

    public SmartWatch(String brand, int batteryLife,boolean camera, String strapMaterial){
        super(brand,batteryLife,strapMaterial);
        this.camera = camera;
    }

    void hearRateCheck(){
        if (this.heartRateMonitor){
            System.out.println("Heart rate is being checked, please check your screen to ");
            System.out.println("see the heartrate details.");
        }else{
            System.out.println("Sorry this feature is not available on your smart watch.");
            System.out.println("Please visit our webpage to see your options to upgrade.");
        }
    }

    @Override
    void turnOn(){
        System.out.println("Smart Watch Is Gathering Data....");
        System.out.println("... ... .... ..... ...... ...... ....... ..");
        System.out.println("Smart Watch is turning on.");
    }



}
