package OOP.Abstraction.Ex3;

public interface Connectable {

    // Let's define a field
    int MAX_CONNECTIONS = 5;
    // The field above by default: public static final.

    // no need to use abstract keyword in interfaces
    // all the methods by default public,abstract
     void connect();

     // In the interface there is a specific way to provide a method body.
    // 1. using default keyword
    default void resetConnections(){
        System.out.println("Connections have been reset to default settings.");
    } // this method is public.

    // 2. Use static keyword
    static void displayMaximumConnections(){
        System.out.println("Connectable devices can have maximum "+ MAX_CONNECTIONS
        + " connections.");
    } // public by default



}
