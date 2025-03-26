package IfStatement;

import java.util.Scanner;

public class If4 {

    // Checking a person's age group
    // if the user is less than 13 years old -> child
    // if the user is less than 20 but not a child -> Teenager
    // if the user is less than 60 but not a teenager -> Adult
    // if the user is bigger than 60 -> senior
    // Let's ask user and find out their age group:
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if( age < 13){
            System.out.println("Child");
        }else if(age < 20){
            System.out.println("Teenager");
        }else if (age < 60 ){
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
        }




    }

}
