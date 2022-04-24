package collectionsFramework;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        /*
        How to create a HashSet
         */

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
//        numbers.add(-55); // HashSet DOES NOT ALLOW DUPLICATES

        System.out.println(numbers); // [0, -3, 5, -7, 10] // UNORDERED WAY
    }
}
