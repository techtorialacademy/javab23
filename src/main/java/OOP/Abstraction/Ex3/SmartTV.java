package OOP.Abstraction.Ex3;

public class SmartTV implements Connectable,Monitor{

    // You must override all the abstract methods from the
    // interface
    @Override
    public void connect(){
        System.out.println("SmartTV is connecting to the network...");
    }

    @Override
    public void displayConnection() {
        System.out.println("Displaying the image from source");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("");
    }

    @Override
    public void adjustVolume() {

    }

    @Override
    public void adjustDisplaySize() {

    }
}
