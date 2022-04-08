package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------TASK-1-------");

        System.out.println("Please enter 2 numbers :");

        System.out.println("The average of given 2 numbers is: " +
                (scan.nextInt() + scan.nextInt())/2);

        System.out.println("-------TASK-2-------");

        System.out.println("Please enter 2 numbers :");
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();

        System.out.println("The product of the given 2 numbers is: " + num4 * num5);

        System.out.println("-------TASK-3-------");

        System.out.println("Please enter 3 numbers: ");
        int num5a = scan.nextInt();
        int num6 = scan.nextInt();
        int num7 = scan.nextInt();

        System.out.println("The 5 multiplied with 5 is = " + (num5 * num5));
        System.out.println("The 6 multiplied with 6 is = " + (num6 * num6));
        System.out.println("The 10 multiplied with 10 is = " + (num7 * num7));

        System.out.println("-------TASK-4-------");

        System.out.println("Please enter 2 numbers ");
        System.out.println("The remainder of 25 % 8 = " + scan.nextInt() % scan.nextInt());

          System.out.println("-------TASK-5-------");
          System.out.println("Please enter 5 numbers");

        System.out.println("The average od then given 5 numbers is: " + ( scan.nextInt() + scan.nextInt() +
                scan.nextInt() + scan.nextInt() + scan.nextInt() ) / 5 );

          System.out.println("-------TASK-6-------");
        System.out.println("Please enter a number ");
        int a = scan.nextInt();

        System.out.println((a * 1) + "\n" + (a * 2) + "\n" +
                (a * 3) + "\n" + (a * 4) + "\n" + (a * 5) + "\n" +
                (a * 6) + "\n" + (a * 7) + "\n" + (a * 8) + "\n" +
                (a * 9) + "\n" + (a * 10));
        //You can(should) use increment way
        int numA = 1;
        System.out.println(numA + " * " + a + " = " + (numA * a));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));
        System.out.println(numA + " * " + a + " = " + (numA * a++));

          System.out.println("-------TASK-7-------");
        System.out.println("Please enter the side of the square");
        int b = scan.nextInt();
        System.out.println("Perimeter of the square = " + (b * 4));
        System.out.println("Area of the square = " + (b * b));

         








    }                                           
}
