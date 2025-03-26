package OOP.Encapsulation.Ex1;

public class TestGaming {
    public static void main(String[]args){

        GamingProfile player1 = new GamingProfile("grandMaster1453");

        System.out.println("Level of player1 is " + player1.getLevel());

        // Let's learn the username of the player1
        System.out.println("Username of player1 is " + player1.getUserName());

        // I want to change username of player1

        player1.setUserName("gM1071");

        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();
        player1.levelUp();

        // let's learn the level of user
        System.out.println(player1.getLevel());

        player1.setUserName("gM1071");
        System.out.println(player1.getUserName());








    }
}
