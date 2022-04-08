package arrays;

import java.util.Arrays;

public class NumbersCollections {
    public static void main(String[] args) {

        /*
        Create an array to store 1, 2, 3
        print array
         */

        int[] numbers1 = {1,2,3};
        System.out.println(Arrays.toString(numbers1));

        //Second way

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        System.out.println(Arrays.toString(num));

        // Third way

        int[] numbers2 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(numbers2));









    }
}
