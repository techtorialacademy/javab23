package OOP.Abstraction.Ex1;

public abstract class Appliance {
    // A final field for brand name of appliance.
    protected final String brand;

    // Create a constructor to initialize final field.
    public Appliance(String brand){
        this.brand = brand;
        // Once the brand field is set once, cannot be changed.
    }
    // Abstract method
    // Methods that you want subclasses to implement, but you don't have
    // a common behavior.
    public abstract void turnOn();

    // A concrete (non-abstract) method
    public void showBrand(){
        System.out.println("Appliance brand: " + this.brand);
    }
    // All appliances will use electiricity.
    public final void powerSource(){
        System.out.println("Appliances uses electicity as their power source.");
    }
    // I don't want any other subclass to change the behavior of the
    // powerSource, because power source can obly be electiricity for all
    // appliances. Declaring the method as final
    // prevents it to be overridden in subclasses.








}
