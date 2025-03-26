package OOP.Inheritance.Ex4;

public class GamingLaptop extends Laptop{
    String graphicsCard;

    public GamingLaptop
            (String brand, int memory, double weight, String graphicsCard) {
        super(brand, memory, weight);
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void boot(){
        System.out.println("GamingLaptop " +
                "is booting with " + graphicsCard + " graphics card...");
    }

    public void overClocking(){
        System.out.println("Overclocking enabled.");
    }


    //            3) Class: GamingLaptop (extends Laptop)
//    Fields
//
//    graphicsCard (String)
//    Constructor
//
//    GamingLaptop(String brand, int memory, double weight, String graphicsCard)
//    Pass brand, memory, weight to the Laptop constructor using super(...).
//    Initialize the graphicsCard field.
//    Methods
//
//    Override boot(): print "GamingLaptop is booting with
//    <graphicsCard> graphics card..."
//    Add a custom method enableOverclocking(): print "Overclocking enabled!"

}
