package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an int array and store below data

        -3
        -7
        0
        2
        0
        7
        7
        10
        2
        15

        Print the array with message "Array not sorted = "
        Print the sorted array with message "Array sorted = "
        */

        System.out.println("\n-------TASK-1-------\n");

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers)); //Array not sorted = [-3, -7, 0, 2, 0, 7, 7, 10, 2, 15]
        Arrays.sort(numbers);
        System.out.println("Array sorted = " + Arrays.toString(numbers)); // Array sorted = [-7, -3, 0, 0, 2, 2, 7, 7, 10, 15]

        System.out.println("\n-------TASK-2-------\n");

        /*
        TASK-2
        Count how many positive-negative and zero numbers you have

        EXPECTED:
        Positives = 6
        Negatives = 2
        Zeros = 2
         */

        //fori loop
        int zero = 0;
        int positive =0;
        int negative =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) zero++;
            else if (numbers[i] < 0) negative++;
            else positive++;
        }System.out.println("Zeros = " + zero);
       System.out.println("Negatives = " + negative);
        System.out.println("Positives = " + positive);

        //for each loop

        int zero1 = 0, negative1 = 0, positive1 = 0;

        for (int number : numbers) {
            if (number > 0) positive1++;
            else if (number == 0) zero++;
            else negative1++;
        }
        System.out.println("Zeros = " + zero1);
        System.out.println("negatives = " + negative1);
        System.out.println("positives = " + positive1);

        System.out.println("\n-------TASK-3-------\n");
        /*
        TASK-3
        Count how many even and odds

        EXPECTED:
        Evens = 5
        Odds = 5
        */


        int even = 0, odd = 0;
        for (int number : numbers) {
            if(number % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Evens = " + even);
        System.out.println("Odds = " + odd);


        /*
        EXTRA PRACTICE
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits
         */











        }
































    }
