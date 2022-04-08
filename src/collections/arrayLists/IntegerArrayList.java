package collections.arrayLists;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //  WE CAN NOT USE PRIMITIVES ON ARRAYS LIST
        numbers.add(5);
        numbers.add(7);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println(numbers.size()); // 5

        System.out.println(numbers); // [5, 7, 15, 20, 25]

        /*
        5
        7
        15
         */

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        System.out.println("\n--------Printing all elements with fori loop--------\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println("\n--------Printing all elements with for each loop--------\n");
        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}
