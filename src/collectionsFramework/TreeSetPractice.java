package collectionsFramework;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(5); // DOES NOT ALLOW DUPLICATES
//        numbers.add(null); //NullPointerException DOES NOT ALLOW NULL

        System.out.println(numbers); //[1, 2, 3, 5] implicitly sorted ascending order or lexicographically

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("John"); // NO DUPLICATES ALLOWED
        names.add("Joe");
        names.add("Alex");
        names.add("ali");
        System.out.println(names); // [Alex, Joe, John, ali] LOWER CASE ALWAYS COME AFTER UPPERCASE IN ASCII

    }
}
