package OOP.Inheritance.Ex3;

public class PolymorphismTest {
    public static void main(String[]a){
        // SmartWatch  -> WearableSmartDevice -> SmartDevice -> Object
        // Child      ....... -> ....... ->  Parent
        // SubClass   ....... -> ....... ->  SuperClass

        // Regular smart device object

        SmartDevice d1 = new SmartDevice("techno",68);

        // I could use every method from SmartDevice class.

        d1.displayInstructionManual();

        // we could create a polymorphic object
        // poly -> many -> morph -> form _ polymorphic -> many forms
        // Creating an object using a in IS-A relationship
        // Parent reference = child object

        SmartDevice smartWatch =
                new SmartWatch("WritInova",58,"leather",true);

        smartWatch.turnOn(); // Turn on method from object side will be called.
        // in this case from SmartWatch class.

        //  SmartWatch sW = new SmartDevice("device",41);
        // The code above won't work, because not every smart device is a smartwatch.



        Object object = new SmartWatch("Wearables",24,true,"metal");
        // every smart watch is an object.

        // When a polymorphic object is created,
        // 1st. If a child class override the method, you will get the overriden implementation.
        // 2nd. Reference side(parent side), won't get the child specific methods.
        // 3rd. Also reference side, doesn't have access to child specific properties.


        // We create a polymorphic object, only if we want to get overriden implementation of existing methods.
        // Otherwise, no child specific implementation can be accessed in this format.











    }
}
