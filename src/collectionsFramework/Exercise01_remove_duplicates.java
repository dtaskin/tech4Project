package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise01_remove_duplicates {
    public static void main(String[] args) {
        /*
        Create and ArrayList and store below elements
        Computer
        Phone
        Mouse
        Mouse
        Phone
        Pen

        Remove above list, remove all duplicates and print unique elements

        EXPECTED RESULT:
        [Computer, Phone, Mouse, Pen]
         */
        System.out.println("\n-------First way - not preferred-------\n");

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");

        System.out.println("My list before removing = " + objects); // [Computer, Phone, Mouse, Mouse, Phone, Pen]

        ArrayList<String> uniques = new ArrayList<>();

        for (String object : objects) {
            if(!uniques.contains(object)) uniques.add(object);
        }
        System.out.println("My list after removing the duplicates = " + uniques); //[Computer, Phone, Mouse, Pen]

        System.out.println("\n-------Second Way - Using collections--------\n"); // ANY SET DOES NOT ALLOW DUPLICATES

        // TreeSet -> Computer, Mouse, Pen, Phone (WE DONT WANT ALPHABETIC ORDER)
        // HashSet -> NO PREDICTION OF ORDER (WE DONT WANT THIS WAY TOO)
        // LinkedHashSet is the one we need for this task
        LinkedHashSet<String> uniques1 = new LinkedHashSet<>(objects);
        System.out.println(uniques1);
//        System.out.println(new LinkedHashSet<>(objects));    OR SHORT



    }
}
