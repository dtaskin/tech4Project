package collectionsFramework;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args){
        /*
        Create an int array to store 1, 3, 5, 7, 9, 10
        Then print the array
         */
        System.out.println("\n-------int array-------\n");
        int[] numbers = {1, 5, 7, 9, 10, 10}; // null is not allowed in array BC it is a primitive array

        System.out.println(Arrays.toString(numbers)); //HOW TO PRINT ARRAY
        System.out.println(numbers[2]);

        System.out.println("\n-------String array-------\n");
        /*
        Create a String array add these cities and print
        Tokyo
        Berlin
        Oslo
        Denver
        null
        null
         */

        String[] cities ={"Tokyo", "Berlin", "Oslo", "Denver", null, null};

        System.out.println(Arrays.toString(cities));

        System.out.println("\n-------String Lists-------\n");

        /*
        List: ArrayList, LinkedList and Vector
         */

        ArrayList<String> cities2 = new ArrayList<>(Arrays.asList(cities)); // USE THIS
//        Collections.addAll(cities2, cities);
        cities2.add("Tokyo");

        System.out.println(cities2); //[Tokyo, Berlin, Oslo, Denver, null, null, Tokyo]
        System.out.println(cities2.get(3)); // Denver


//        List<String> names2 = new ArrayList<>(); // AND THIS FOR BETTER RESULTS
//        Collection<String> names3 = new ArrayList<>(); //CHILD CAN TAKE THE SHAPE OF THE PARENT
//        Iterable<String> names4 = new ArrayList<>(); // SO WE CAN CREATE ARRAYLIST IN THE SHAPE OF ITERABLE
//
        System.out.println("\n-------String Vector-------\n");

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size()); // 6
        names.forEach(System.out::println); // SHORT CUT FOREACH LOOP TO PRINT ALL
        System.out.println("Name at index of 5 = " + names.get(5)); // Data

        System.out.println("\n-------String LinkedList-------\n");

        LinkedList<String> objects1 = new LinkedList<>();
        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());
        System.out.println(objects1);
        System.out.println(objects1.get(2)); // airpods
        System.out.println(objects1.stream().filter(element -> element == null).count()); // 4
//        System.out.println(objects1.stream().filter(Objects::isNull).count()); ANOTHER WAY DOING THIS









    }
}
