package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter 2 different integers
        between 0 and 10 ( 0 and 10 are included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5

6 8   -> 6 7 8

9 7   -> 7 8 9

1 3   -> 1 2 3
3 7   -> 3 4 6 7


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = input.nextInt();

        System.out.println("Please enter another number");
        int num2 = input.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = min; i <= max; i++){
            if (i == 5) continue;
            System.out.println(i);
            // if(i != 5) System.out.println(i);
        }


    }
}
