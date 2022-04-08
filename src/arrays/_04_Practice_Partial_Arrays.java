package arrays;

import java.util.Arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[]args){

        System.out.println("\n-------TASK-1------\n");
        /*
        TASK-1
        Create an array to store below numbers - numbers
        10, -3, -7, 0, 0, 7, 22

        Print all elements one by one in separate lines using FOR EACH LOOP
         */
        int[] numbers = {10,-3,-7, 0, 0, 7, 22};
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\n-------TASK-2------\n");

        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */
        int sum1 = 0;
        for (int number : numbers) {
            sum1 += number;
        }
        System.out.println(sum1);

//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println(sum);

        System.out.println("\n-------TASK-3------\n");
        /*
        TASK-3
        Find the sum of first 3 elements in the array

        RESULT:
        0
         */

        int first3 = 0;

        for (int i = 0; i < 3; i++) {
            first3 += numbers[i];
        }
        System.out.println(first3);


        System.out.println("\n-------TASK-4------\n");

        /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
         */

        int last5 = 0;
        for (int i = numbers.length-5; i < numbers.length; i++) {
            last5 += numbers[i];
        }
        System.out.println(last5);

//        int last5a = 0;
//        for (int i = numbers.length-1; i >= numbers.length-5; i--) {
//            last5a += numbers[i];
//        }
//        System.out.println(last5a);

        System.out.println("\n-------TASK-5------\n");

        /*
        TASK-5
        Find the product of last 4 elements in the array but exclude zero if there are any
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        154
        */

        int product = 1; // for multiplication, you have to start with 1 otherwise it will be 0
        for (int i = 3; i < numbers.length; i++) {
            int number = numbers[i];
            if (number != 0) {
                product *= number;
            }
        }
            System.out.println(product);

        System.out.println("\n-------TASK-6------\n");
                /*
                TASK-6
                Check your collection and print true if one of the element is 0
                Print false if none of the elements is zero

                RESULT:
                true
                 */

      boolean hasZero = false;
        for (int number : numbers) {
            if (number == 0) {
                hasZero = true;
                break;
            }
        }
        System.out.println(hasZero);























        }

}






