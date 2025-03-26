package ZZMusicBox;

import java.util.Scanner;

public class Solution {
    public static void main(String[]args){
        System.out.println("Welcome to the music box");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the music type you want to listen");
        String musicType = sc.next();
        if(musicType.equalsIgnoreCase("classical")){
            // For classical
            System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The\n" +
                    "Planets is available songs under Classical music");
String availableSongsClassical = "-Four Seasons- -Fur Elise- -Finlandia- -Vocalise- -The Planets-";
            System.out.println("Please enter the song name");
            String songName = sc.nextLine();
            String songNameProgrammed = "-" + songName + "-";
            if(availableSongsClassical.contains(songNameProgrammed)){
                System.out.println("Please enter $2");
            }else{
                System.out.println(songName + " is not available classical music.");
            }



        }else if(musicType.equalsIgnoreCase("pop")){
            // For classical
            System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The\n" +
                    "Planets is available songs under Classical music");
            String availableSongsClassical = "-Four Seasons- -Fur Elise- -Finlandia- -Vocalise- -The Planets-";
            System.out.println("Please enter the song name");
            String songName = sc.nextLine();
            String songNameProgrammed = "-" + songName + "-";
            if(availableSongsClassical.contains(songNameProgrammed)){
                System.out.println("Please enter $2");
            }else{
                System.out.println(songName + " is not available classical music.");
            }


        }else if(musicType.equalsIgnoreCase("country")){
            // For classical
            System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The\n" +
                    "Planets is available songs under Classical music");
            String availableSongsClassical = "-Four Seasons- -Fur Elise- -Finlandia- -Vocalise- -The Planets-";
            System.out.println("Please enter the song name");
            String songName = sc.nextLine();
            String songNameProgrammed = "-" + songName + "-";
            if(availableSongsClassical.contains(songNameProgrammed)){
                System.out.println("Please enter $2");
            }else{
                System.out.println(songName + " is not available classical music.");
            }


        }else{
            // For classical
            System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The\n" +
                    "Planets is available songs under Classical music");
            String availableSongsClassical = "-Four Seasons- -Fur Elise- -Finlandia- -Vocalise- -The Planets-";
            System.out.println("Please enter the song name");
            String songName = sc.nextLine();
            String songNameProgrammed = "-" + songName + "-";
            if(availableSongsClassical.contains(songNameProgrammed)){
                System.out.println("Please enter $2");
            }else{
                System.out.println(songName + " is not available classical music.");
            }


        }







    }
}
