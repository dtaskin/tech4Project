package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*
        HOW TO SORT AN ARRAY OF NUMBERS
        byte, short, int, long, float, double

        We will sort these in ascending order
         */

        System.out.println("\n ----- Sorting numbers------");

        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9}; // [10, -5, 0, 0, 3, 0, 7, 9]
        System.out.println("My array is = " + Arrays.toString(numbers));

        //Sort this array in ascending order

        Arrays.sort(numbers);

        System.out.println("My array sorted is = " + Arrays.toString(numbers)); // [-5, 0, 0, 0, 3, 7, 9, 10]

        System.out.println("\n ----- Sorting characters------");
        // it will print according to ASCII value

        char[] characters = {'A', 'b', 'z', 'H'};

        System.out.println("My characters array = " + Arrays.toString(characters)); //[A, b, z, H]

        Arrays.sort(characters);

        System.out.println("My characters array sorted is = " + Arrays.toString(characters)); //[A, H, b, z] According to ASCII value

        System.out.println("\n ----- Sorting words------");

        String[] names = {"Adam", "Adame", "Alex", "tom", "alley", "Adele", "terry", "Josh"};

        System.out.println("My names array is = " + Arrays.toString(names)); // [Adam, Adame, Alex, tom, alley, Adele, terry, Josh]

        Arrays.sort(names);

        System.out.println("My names array sorted is = " + Arrays.toString(names)); // [Adam, Adame, Adele, Alex, Josh, alley, terry, tom]


    }
}
