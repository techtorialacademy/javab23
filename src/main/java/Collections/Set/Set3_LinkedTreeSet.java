package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set3_LinkedTreeSet {

    public static void main(String[]args){
        // Let's create all 3 types of sets
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String>  linkedHashSet =  new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        // All three sets contains unique elements only
        hashSet.add("Nike");             linkedHashSet.add("Nike");             treeSet.add("Nike");
        hashSet.add("Puma");             linkedHashSet.add("Puma");             treeSet.add("Puma");
        hashSet.add("Adidas");           linkedHashSet.add("Adidas");           treeSet.add("Adidas");
        hashSet.add("ON");               linkedHashSet.add("ON");               treeSet.add("ON");
        System.out.println(hashSet);     System.out.println(linkedHashSet);     System.out.println(treeSet);
//      [Nike, Adidas, Puma, ON]         [Nike, Puma, Adidas, ON]               [Adidas, Nike, ON, Puma]
//      No Order(HASHORDER)              Insertion Order                        Ascending Order
// Ascending order is: If it is letters alphatical order, if it is numbers smallest to largest.


        hashSet.add(null); // Hashset and linkedHashset can store null values.
        linkedHashSet.add(null); //
       /* treeSet.add(null); not possible, nullpointer exception*/
         System.out.println(linkedHashSet);
         System.out.println(hashSet);

        hashSet.add("ON");               linkedHashSet.add("ON");               treeSet.add("ON");
        System.out.println( hashSet);     System.out.println(linkedHashSet);     System.out.println(treeSet);



    }
}
