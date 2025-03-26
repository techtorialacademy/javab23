package Objects;

public class Animal {

    int age;
    String name;
    int numberOfLegs;
    int energyLevel;
    public Animal(){
        // representation of a default constructor
        // this constructor is created whethere explicitly or implicitly
        System.out.println("CONSTRUCTOR IS EXECUTED");
    }



    // Let's create a sleep method that renovates 60 percent of the animals energy level
     public void sleep(){
        // Engergy level should never be higher than 100
        energyLevel += 60;
        if(energyLevel > 100){
            energyLevel = 100;
        }
        System.out.println(name + " slept and increased its energy level to " + energyLevel);
    }

    // Let's create a move method that will decrease the energy level of animal
    // by 10 point.If the animal doesn't have enough energyLevel
    // we should print that animal should sleep or eat to increase their
    // energy level.
    public void move(){
        if(energyLevel < 10 ){
            System.out.println("Animal doesn't have enough energy.");
            System.out.println(name + " should sleep or eat to increase energy level.");
        }else{
            energyLevel -= 10;
            System.out.println(name + " has moved and its energy level became " + energyLevel);
        }
    }

    // Let's create an eat method for Animal objects that will increase their
    // energy level by 30 points.
    public void eat(){
        energyLevel += 30;
        // Animals energy should not be over 100
        if(energyLevel > 100){
            energyLevel = 100;
        }
        System.out.println(name + " is now full and its energy level is "+ energyLevel);
    }


}
