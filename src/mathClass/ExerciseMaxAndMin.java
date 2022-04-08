package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {

    public static void main(String[] args) {

        /*
        Find the min  and max of given 3 numbers, write down
        the Pseudo code and print min man max with proper messages.


        NOTE: Declare and Assign all of them in one
        single line

        x=4, y=67, z= -54
        */
//
//        int x = 4, y = 67, z = -54;
//
//       Math.max(x, y);
//
//        System.out.println("max of every number is = " + Math.max(Math.max(x, y), z) );
//        System.out.println("min of every number is = " + Math.min(Math.min(x, y), z) );

        // write a program which prints the max of given 3 numbers
        // 4,56,23

        int a = 4;
        int b = 56;
        int c =23;

        int maxOfAAndB = Math.max(a, b);
        int maxOfALl = Math.max(Math.max(a, b), c);
        System.out.println(maxOfALl);


        //IF YOU DONT HAVE TO STORE THE NUMBERS, USE THIS WAY. EASY WAY!!!
        System.out.println("MAx of given numbers are = " + Math.max(22, Math.max(3, 45)));

        //
        Scanner collect = new Scanner(System.in);
        System.out.println("Please enter 4 numbers");
        int num1 = collect.nextInt();
        int num2 = collect.nextInt();
        int num3 = collect.nextInt();
        int num4 = collect.nextInt();

        System.out.println("max of the numbers is = " + Math.max(Math.max(num1, num2),Math.max(num3, num4)));


        System.out.println("min of the numbers is = " + Math.min(Math.min(num1, num2), Math.min(num3, num4)));











    }
}
