package Objects;

public class PhoneTest {

    public static void main(String[]args){
        Phone p1 = new Phone("Google","Pixel8");
        System.out.println("Battery level of the p1 is " + p1.batteryLevel);
        System.out.println("The years of warranty for p1 is "+ Phone.warrantyYears);

       // Every time an object is put in a system out, the toString method for object is
        // called.
        // Every class in java --no expception-- has the toString method. Which comes
        // default from the object class.
        // Object class is in the center of everything in java.
        // Everything that Object class has also in every other class.
        // All created classes in java gets the methods/variables from Object class by default.
        System.out.println(p1);

        Phone p2 = new Phone("Samsung","S24","1234561234");

        System.out.println(p2);

        p2.checkBattery();

        p2.chargeBattery(91);

        p2.makeCall("1234321234","Any");

        // We couldn't make the call as the phone state is off.
        // Let's call the powerToggle method
        p2.powerToggle();

        p2.makeCall("1234321234","Any");

        p2.sendMessage("7655677373","Hello There!!");

        Phone phone = new Phone("T","T");


        System.out.println(Phone.countOfPhones);


    }



}
