package OOP.Abstraction.Ex1;

public class TestApp {
    public static void main(String[]a){
        // We cannot create an object out abstract classes.
        // Appliance appliance = new Appliance();
        // The abstract methods must be implemented

        // We could create a polymorphic object
        Appliance appliance = new WashingMachine("TY",27);

        // To create an object out of an abstract class
        // you must override all the abstract methods.
        Appliance appliance1 = new Appliance("TT") {
            @Override
            public void turnOn() {
                System.out.println("Turning on the appliance.");
            }
        }; // Creating an anonymus inner class instance of Appliance.
        // Essentially it defines a subclass of Appliacne in palce without giving
        // it a name and provides overridden method.







    }
}
