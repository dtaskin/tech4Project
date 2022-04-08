package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("----------TASK-1----------");
        System.out.println("\n");

        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter number 1:");
        int number1 = collect.nextInt();
        System.out.println("Please enter number 2:");


        int number2 = collect.nextInt();
        int sum = number1 + number2;
        System.out.println("The number 1 entered by user is = " + number1);
        System.out.println("The number 2 entered by user is = " + number2);

        System.out.println("The sum of number 1 and 2 entered by user is = " + sum);
        System.out.println("\n");


          System.out.println("----------TASK-2---------");
        System.out.println("\n");

        System.out.println("Please enter number 1:");
        float number01 = collect.nextFloat();
        System.out.println("Please enter number 2:");
        float number02 = collect.nextFloat();
        float sum01 = number01 / number02;
        System.out.println("\n");
        System.out.println("The number 1 entered by user is = " + number01);
        System.out.println("The number 2 entered by user is = " + number02);
        System.out.println("The sum of number 1 and 2 entered by user is = " + sum01);

        System.out.println("\n");


          System.out.println("----------TASK-3---------");
        System.out.println("\n");
        int a = -10;
        int b = 7;
        int c = 5;
        int d = 72;
        int e = 24;
        int f = 10;
        int g = -3;
        int h = 9;
        int i = 18;
        int j = 6;
        int k = 3;

        int problem1 = a + b * c;
        int problem2 = (d + e) % 24;
        int problem3 = f + g * h / h;
        int problem4 = c + i / k * k - (j % k);
        System.out.println("1.\t" + problem1);
        System.out.println("1.\t" + problem2);
        System.out.println("1.\t" + problem3);
        System.out.println("1.\t" + problem4);
        System.out.println("\n\n");


          System.out.println("----------TASK-4---------");
        System.out.println("\n");

        System.out.println("Please enter number 1:");
        double number001 = collect.nextDouble();
        System.out.println("Please enter number 2:");
        double number002 =collect.nextDouble();

        double sum001 = number001 + number002;
        double times = number001 * number002;
        double sub = number001 - number002;
        double divide = number001 / number002;
        double remain = number001 % number002;
        System.out.println("The sum of the given numbers is = " + sum001);
        System.out.println("The product of the given numbers is = " + times);
        System.out.println("The subtraction of the given numbers is = " + sub);
        System.out.println("The division of the given numbers is = " + divide);
        System.out.println("The remainder of the given numbers is = " + remain);

        System.out.println("\n\n");
        System.out.println("----------TASK-5---------");
        System.out.println("\n");

        double width = 7.5;
        double height = 10.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("The area of the rectangle = " + area);
        System.out.println("The perimeter of the rectangle = " + perimeter);

        System.out.println("\n\n");
        System.out.println("----------TASK-6---------");

        double averageAnnualSalary = 90_000;
         double salaryInThreeYears = averageAnnualSalary * 3;

         System.out.println("A Software Engineer in Test can earn " + salaryInThreeYears + " in 3 years.");















    }
}
