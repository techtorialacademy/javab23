package OOP.Inheritance.Ex4;

public class Main {
    public static void main(String[]a){
        Computer c = new Computer("PC",16);
        c.displaySpecs();
        c.boot();
       boolean b = c instanceof Laptop;
       System.out.println("c instance of Laptop is " + b);
        // A polymorphic object Computer -> Laptop
//
        Computer lT = new Laptop("UltraSlim",32,6);

        lT.boot(); // Calls Laptop's boot() due to overriding.
        lT.shutDown();
       //  lT.closeLid(); // Not accessible, Laptop-specific method
        System.out.println(lT.brand);
        System.out.println(lT.memory);
        // System.out.println(lT.weight); // Weight is laptop(child) specific
        // property
        // So, does it mean that we lost the weight data despite the creating a
        // laptop oject with weight value.

        // If the lT object is created as Laptop then I should be able
        // to cast it back.

        // To understand if an object is an instance of a certain class
        // we could use instanceof keyword
        if(lT instanceof Laptop){
            // Since the object named lT is an instance of Laptop
            // I could cast lT object to Laptop object.
            ((Laptop)lT).closeLid();
            System.out.println(((Laptop)lT).weight);
            // So the child specific methods and fields are not lost,
            // but to get it we have to cast it.
        }







    }
}
