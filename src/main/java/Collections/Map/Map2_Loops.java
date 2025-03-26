package Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2_Loops {

    public static void main(String[]a){
        // Let's describe testing framework
        HashMap<String,Object> framework = new HashMap<>();

        framework.put("Programming", "Java");
        framework.put("Build","Maven");
        framework.put("Framework","Behavior Driven Development");
        framework.put("Purpose","Test Automation");
        framework.put("Version",1.9);

        // We cannot directly loop in the map objects as they are not iterable.
        // Iterable means you can loop in.

        // Although we cannot loop maps directly, we could use alternative ways. Such as
        // 1. Getting all the key values from map as a set, then looping in to the set.
        //      Then in the loop we could use get method to access each value of the key.

        Set<String> keys = framework.keySet();
        System.out.println(keys);

        for(String key: keys){
            System.out.println(key +" : " + framework.get(key));
            // Using the key value in the get method, I could also access the values
        }

        // 2. Using entryset method
        // Syntax heavy way to do it.
        // Entry -> each key value pair
        for(Map.Entry<String,Object> entry: framework.entrySet()){
            System.out.println("Entry : " + entry );
            System.out.println("entry key: " + entry.getKey());
            System.out.println("entry value: " + entry.getValue());
        }

        // 3. Using iterator
        // Iterator object in Java can help to loop through objects.
        Iterator<Map.Entry<String,Object>> iterator = framework.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Object> entry = iterator.next();
            System.out.println("Entry : " + entry );
            System.out.println("entry key: " + entry.getKey());
            System.out.println("entry value: " + entry.getValue());
        }
        // explanation to loop above
        // 1. map.entrySet()
        // This returns a Set<Map.Entry<K,V>>. Set of all key value pairs in the map.
        //2. iterator()
        // We call iterator on the Set to get an Iterator<Map.Entry<K,V>>.
        //3. Iteration
        // We use while(iterator.hasNext()) loop to check if more entries exist and iterator.next()
        // to move to the next entry. By this all key value pairs in the map can be retrieved.











    }
}
