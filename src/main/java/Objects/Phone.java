package Objects;

public class Phone {
    static int countOfPhones = 0;
    static int warrantyYears = 3;

    // Instance variables
    String brand;
    String model;
    String phoneNumber;
    int batteryLevel; // percentage (0-100)
    boolean powerOn; // reflect whether a device is on or off.
    // device is on -> powerOn is true
    // device is off -> powerOn is false.

    // Default constructor
    public Phone(){
        System.out.println("Default constructor Called!!!!!!");
        countOfPhones++;
    }

    // Constructor with brand and model
    public Phone(String brand, String model){
        this();
        this.brand = brand;
        this.model = model;
    }

    // Constructor with brand, model, and phone number
    public Phone(String brand, String model, String phoneNumber){
        this(brand,model);
        this.phoneNumber = phoneNumber;
    }

    // Tell java that you don't like the way toString method is created in Object class.
    // You need to rewrite for your object needs.
    @Override
    public String toString(){
        return
                " Brand: " + this.brand
                +"\n Model: " + this.model
                +"\n PhoneNumber: " + this.phoneNumber
                +"\n Battery Level: " + this.batteryLevel
                ;
    }

//    powerToggle(): Turns the phone on or off.
//    makeCall(...): Overloaded methods to initiate a call:
//    One version accepts just a phone number.
//    The other accepts a phone number along with a contact name.
//            sendText(String number, String message): Simulates sending a text message.
//            checkBattery(): Displays the current battery level.
//            chargeBattery(int amount): Increases the battery level by a specified amount (up to 100%).

    public void powerToggle(){
        // powerOn variable must be assigned with its opposite value
        powerOn = !powerOn;
    }

    public void makeCall(String phoneNum ){
        if(powerOn){
            System.out.println("Calling the " + phoneNum);
            System.out.println("Ringing... ... ... ...");
        }else{
            System.out.println("Phone is off! Calling is not possible.");
        }
    }

    public void makeCall(String phoneNum, String contactName){
        if(powerOn){
            System.out.println("Calling "+ contactName + " ( " + phoneNum + ") ");
            System.out.println("Ringing... ... ... ...");
        }else{
            System.out.println("Phone is off! Calling is not possible.");
        }
    }

    public void sendMessage(String phoneNum, String message){
        if(powerOn){
            System.out.println("Sending message to "+ " ( " + phoneNum + ") ");
            System.out.println("... ...Sending ... ...");
            System.out.println(message);
            System.out.println(">>>>>>>>SENT<<<<<<<<");
        }else{
            System.out.println("Phone is off! Sending message is not possible.");
        }
    }

    public void checkBattery(){
        System.out.println("Battery level: " + batteryLevel + "%");
    }

    public void chargeBattery(int chargeAmount){
        batteryLevel += chargeAmount;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        // We charge the battery, let's display the battery level.
        this.checkBattery();
        // We are calling objects instance method to display the battery level.
    }









}
