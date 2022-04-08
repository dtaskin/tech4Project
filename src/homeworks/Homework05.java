package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("-------TASK-1-------");

        System.out.println("Please enter 3 numbers below : ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(num1, num2), num3));
        System.out.println("Min value = " + Math.min(Math.min(num1, num2), num2));

        System.out.println("-------TASK-2-------");

        System.out.println("Please enter 5 numbers below : ");
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(Math.max(num4, num5), num6), num7), num8));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(Math.min(num4, num5), num6), num7), num8));

        System.out.println("-------TASK-3-------");

        System.out.println("Please enter 2 numbers below : ");

        System.out.println("The difference between numbers is = " + Math.abs(input.nextInt() - input.nextInt()));

          System.out.println("-------TASK-4-------");

          int r1 = (int) (Math.random() * 51 + 50) ;
          int r2 = (int) (Math.random() * 51 + 50) ;
          int r3 = (int) (Math.random() * 51 + 50) ;

          System.out.println("Number 1 = " + r1);
          System.out.println("Number 2 = " + r2);
          System.out.println("Number 3 = " + r3);

          System.out.println("The sum of numbers is = " + (r1 + r2 + r3));

            System.out.println("-------TASK-5-------");

            double alex = (125 - 25.5 );
            double mike = (220 + 25.5 );

        System.out.println("Alex's money: $" + alex);
        System.out.println("Mike's money: $" + mike);

          System.out.println("-------TASK-6-------");

        System.out.println((int)(390 / 15.60));












    }
}
