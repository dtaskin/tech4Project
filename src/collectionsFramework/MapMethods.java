package collectionsFramework;

import java.sql.SQLOutput;
import java.util.*;

public class MapMethods {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Blue");
        favorites.put("City", "Eskisehir");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Parakeet");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Blue, Eskisehir, Lexus, Parakeet

        Set<String> keys = favorites.keySet(); // keySet() return Set<> thats why we put that into Set
        System.out.println(keys); //[Car, Color, City, Day, Pet]

        Collection<String> values = favorites.values(); // values() returns Collections thats why we put that into collections
        System.out.println(values); //[Lexus, Blue, Eskisehir, Friday, Parakeet]


        //  VERY IMPORTANT METHODS FOR MAPS
        System.out.println(values.stream().filter(element -> element.length() > 4).count()); // 4
        System.out.println(keys.stream().filter(element -> element.toLowerCase().startsWith("c")).count()); // 3

        /*
        Entry = key - value
         */

        Set<Map.Entry<String, String>> entries = favorites.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("My favorite " + entry.getKey() + " is = " + entry.getValue());
            //My favorite Car is = Lexus
            //My favorite Color is = Blue
            //My favorite City is = Eskisehir
            //My favorite Day is = Friday
            //My favorite Pet is = Parakeet

//            System.out.println(entry); //Car=Lexus
                                       //Color=Blue
                                       //City=Eskisehir
                                       //Day=Friday
                                       //Pet=Parakeet

        }
        System.out.println(favorites);

        favorites.remove("Day");
        favorites.remove("Pet", "Parakeet");
        System.out.println(favorites);

        favorites.replace("Car","Tesla");
        System.out.println(favorites);

        System.out.println(favorites.containsKey("Color")); // true
        System.out.println(favorites.containsKey("Sport")); // false
        System.out.println(favorites.containsKey("Tesla")); // false
        System.out.println(favorites.containsKey("Ice-Cream")); // false

    }
}
