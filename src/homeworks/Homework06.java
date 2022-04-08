package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("-------TASK-1-------");
        String s1 = "5";
        String s2 = "10";

        int s1Int = Integer.parseInt(s1);
        int s2Int = Integer.parseInt(s2);

        System.out.println("-Sum of 5 and 10 is = " + (s1Int + s2Int));
        System.out.println("-Product of 5 and 10 is = " + s1Int * s2Int);
        System.out.println("-Division of 5 and 10 is = " + (s1Int / s2Int));
        System.out.println("-Subtraction of 5 and 10 is = " + (s1Int - s2Int));
        System.out.println("-Remainder of 5 and 10 is = " + s1Int % s2Int);

        System.out.println("-------TASK-2-------");

        String s01 = "200";
        String s02 = "-50";

        int s01Int = Integer.parseInt(s01);
        int s02Int = Integer.parseInt(s02);

        System.out.println("The greatest value is = " + Math.max(s01Int, s02Int));
        System.out.println("The smallest value is = " + Math.min(s01Int, s02Int));
        System.out.println("The average is = " + (s01Int + s02Int)/2);
        System.out.println("The absolute difference is = " + Math.abs(s01Int - s02Int));

        System.out.println("-------TASK-3-------");

        String totalSavingsIn1Day = "0.96";

        double totalSavings1 = Double.parseDouble(totalSavingsIn1Day);

        System.out.println((int)(24 / totalSavings1) + " days");
        System.out.println((int)(168 / totalSavings1) + " days");
        System.out.println("$" + 150 * totalSavings1);

        System.out.println("-------TASK-4-------");

        String jessieSavingsADay = "62.50";

        double computerSavings = Double.parseDouble(jessieSavingsADay);

        System.out.println((int)(1250 / 62.50));

        System.out.println("-------TASK-5-------");

        String option1 = "475.50";
        String option2 = "951";

        double opt1 = Double.parseDouble(option1);
        double opt2 = Double.parseDouble(option2);

        System.out.println("Option 1 will take " + ((int)(14265 / 475.50)) + " months");
        System.out.println("Option 2 will take " + ((int)(14265 / 951)) + " months");

        System.out.println("-------TASK-6-------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 2 numbers below");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println((double) number1/number2);






















    }
}
