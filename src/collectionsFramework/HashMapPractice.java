package collectionsFramework;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        /*
        KEY     - VALUE
        string - string

        Ukraine - Kiev
        Spain - Madrid
        Portugal - Lisbon
        Italy - Rome
        US - DC
        Canada - Ottawa
         */
        HashMap<String, String> capitals = new HashMap<>();
        // USE PUT() METHOD TO ADD KEY-VALUE
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Rome");
        capitals.put("US", "DC");
        capitals.put("Canada", "Ottawa");

        //HOW TO PRINT IN A HASHMAP
        System.out.println(capitals); //{Canada=Ottawa, Ukraine=Kiev, Italy=Rome, Portugal=Lisbon, US=DC, Spain=Madrid}
        //LinkedHashMap keeps the insertion order
        LinkedHashMap<String, String> capitals1 = new LinkedHashMap<>();
        capitals1.put("Ukraine", "Kiev");
        capitals1.put("Spain", "Madrid");
        capitals1.put("Portugal", "Lisbon");
        capitals1.put("Italy", "Rome");
        capitals1.put("US", "DC");
        capitals1.put("Canada", "Ottawa");

        System.out.println(capitals1); // {Ukraine=Kiev, Spain=Madrid, Portugal=Lisbon, Italy=Rome, US=DC, Canada=Ottawa}

        System.out.println("\n-------Understanding Map-------\n");
        TreeMap<String, String> capitals2 = new TreeMap<>();
        capitals2.put("Ukraine", "Kiev");
        capitals2.put("Spain", "Madrid");
        capitals2.put("Portugal", "Lisbon");
        capitals2.put("Italy", "Rome");
        capitals2.put("US", "DC");
        capitals2.put("Canada", "Ottawa");

        // KEYS ARE SORTED
        System.out.println(capitals2); //{Canada=Ottawa, Italy=Rome, Portugal=Lisbon, Spain=Madrid, US=DC, Ukraine=Kiev}

        // HOW TO GET A PARTICULAR KEY-VALUE PAIR

        System.out.println(capitals.get("Spain")); //Madrid
        System.out.println(capitals.get("Germany")); // null
        System.out.println(capitals.get(null)); // null

        System.out.println("\n-----");






    }
}
