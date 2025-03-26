package IfStatement;

import java.util.Scanner;

public class If7 {
    // In the factory we need to create a program that can find if we can do the shipment.
    // if we can do the shipment it will tell us how many small packages we should ship.
    // First we need to get total kilogram of the shipment Then, to reach this total kilogram
    // of shipment, we can use small and big packages. Every big package is 5 kilogram
    // and every small package is 1 kilogram. We have limited amount of small and big
    // packages.
    // Ask user how many big and how many small packages they have in the inventory.
    // Ask user what is the total goal kilogram of the shipment.
    // Print whether they can ship, if they can ship print how many small packages they need.
    // Assume big packages is used before small packages. To ship, we need to
    // reach exact number of shipment kg.
    // Use small and big packages small pack = 1kg big pack = 5kg
    // Use big packages before small packages If we can do the shipment print how many small pack needed.
    // Can I do the shipment? If I can, how many small package will be used?

    // 51 KG
    // How many big packages do i need?
    // ideally -> 51 / 5 -> 10 packages needed
    // ideally -> 51 % 5 -> 1 small package needed.
    // inventory number is 9 big packages
    // inventory number is 20 small packages

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of big packs in inventory: ");
        int bigPacks_inventory = sc.nextInt();
        System.out.println("Enter the number of small packs in inventory: ");
        int smallPacks_inventory = sc.nextInt();

        System.out.println("How many kgs do you need to ship? ");
        int shipmentGoal = sc.nextInt();

        // ideal big pack needs
        int bigPackNeed = shipmentGoal / 5;
        int smallPackNeed = shipmentGoal % 5;

        if( bigPacks_inventory >= bigPackNeed && smallPacks_inventory >= smallPackNeed ){
            System.out.println("I can do the shipment and I need "+ smallPackNeed+" small packages.");
        }else if( bigPacks_inventory < bigPackNeed){
            // use all the big packages
            // using all the big packages I can ship
            int shippingWithBig = bigPacks_inventory * 5;
            int smallPackNeeded = shipmentGoal - shippingWithBig;
            if(smallPacks_inventory >= smallPackNeeded){
                System.out.println("I can do the shipment and I need "+ smallPackNeeded+" small packages.");

            }else{
                System.out.println("Shipment cannot be completed.");
            }
        }
        else{
            System.out.println("Shipment cannot be completed.");
        }





    }






}
