package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {

        /*
            Task-1
            Create an array that will store 4 fruit names
            Then, print the empty array

            EXPECTED OUTPUT:
            [null, null, null, null]
         */

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits)); // [null, null, null, null]


        /*
        Task - 2
        Store your favorite fruits in the index of 0
        Store the 4th fav fruit in the index of 3


         */

        fruits[0] = "Mango";
        fruits[3] = "Kiwi";
        System.out.println(Arrays.toString(fruits)); // [Mango, null, null, Kiwi]


        /*
        Task-3
        Find the size of your array and print it
        SIZE = how many elements you have in the array

        expected output:
        4
         */

        System.out.println(fruits.length); //4


        /*
        Task-4
        Print the elements at the index of 0 and 3
         */

        System.out.println(fruits[0]); // mango
        System.out.println(fruits[3]); // kiwi

        // what if we try to get a value that is null
        System.out.println(fruits[1]); // null

        System.out.println(fruits[0].toUpperCase()); // MANGO
        System.out.println(fruits[0].charAt(0)); // A
        System.out.println(fruits[0].length()); // 5
        System.out.println(fruits[0].startsWith("M")); // true

        System.out.println(fruits[1].length());  // NullPointerException





















    }
}
