package OOP.Inheritance.Ex3;

public class DeviceTest {
    public static void main(String[]args){

        SmartDevice.generalWarning();

        SmartDevice genericDevice = new SmartDevice("Generic Brand",76);

        genericDevice.turnOn();

        genericDevice.turnOff();


        System.out.println();
        System.out.println();

        WearableSmartDevice fitnessBand =
                new WearableSmartDevice("FitBand",10,"Silicone");


        fitnessBand.turnOn();
        fitnessBand.wear(); // this behavior is specific to wearable smart devices
        fitnessBand.turnOff(); // this turnOff method is inherited from SmartDevice class.


        System.out.println();
        System.out.println();

        SmartWatch appleWatch =
                new SmartWatch("Apple", 64, "Leather",true);

        appleWatch.turnOn(); // This is overriden method
        appleWatch.wear(); // This method is inherited from wearable smart device
        appleWatch.hearRateCheck(); // this method is specific to smart watches
        appleWatch.turnOff(); // inherited this method from smart device class.

      // Based on our implementation the IS-A relationship
      // SmartWatch extends To WearableSmartDevice extends To SmartDevice extends To Object class
      // 1. SmartWatch is a WearableSmartDevice
      // 2. SmartWatch is a SmartDevice
      // 3. SmartWatch is an Object.














    }

}
