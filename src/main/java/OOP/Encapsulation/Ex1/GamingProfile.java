package OOP.Encapsulation.Ex1;

public class GamingProfile {
    private String userName;
    private int level;
    private String secretAchivement;
    private boolean isAchivementUnlocked;
    public GamingProfile(String userName){
        this.level = 1;
        this.secretAchivement = "Ultimate Gamer";
        this.isAchivementUnlocked = false;
        this.userName = userName;
    }
    public String getUserName(){
        return this.userName;
    }

    // user can change their username if the achivement is unlocked
    public void setUserName(String userName){
        if(isAchivementUnlocked){
            this.userName = userName;
            System.out.println("You changed your username.");
        }
        else {
            System.out.println("Play it more to get privilege to change your username.");
        }
    }

    // Our goal is the unlock the achivement when the user
    // passes the level 10.
    // User will not be able to set up the level directly but
    // can use level up method to increase its level.
    //In the level up method we are going to check when user passes level 10
    // when user passes level 10, we will unlock the achivement.
    public int getLevel(){
        return this.level;
    }
    public void levelUp(){
        level++; // increasing the level by 1.
        if (level > 10 && !isAchivementUnlocked){
            isAchivementUnlocked = true;
            System.out.println("You unlock the achievement!!!!");
            getSecretAchivement();
        }
    }

    public String getSecretAchivement(){
        if (isAchivementUnlocked){
            return secretAchivement;
        }
        return "No achivement unlocket yet!! Please continue to play.";
    }
}
