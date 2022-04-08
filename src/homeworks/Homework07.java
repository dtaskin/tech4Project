package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args){
        System.out.println("\n-------TASK-1-------\n");
        int num1 = (int) (Math.random() * 11), num2 = (int)(Math.random() * 11),
            num3 = (int) (Math.random() * 11), num4 = (int)(Math.random()* 11);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);

        //ALSO:
//        int i = 1;
//        System.out.println("Number " + i++ + " = " + num1);
//        System.out.println("Number " + i++ + " = " + num2);
//        System.out.println("Number " + i++ + " = " + num3);
//        System.out.println("Number " + i + " = " + num4);

        System.out.println("Absolute difference of " + num1 + " with 5 is " + Math.abs(num1 - 5));
        System.out.println("Absolute difference of " + num2 + " with 5 is " + Math.abs(num2 - 5));
        System.out.println("Absolute difference of " + num3 + " with 5 is " + Math.abs(num3 - 5));
        System.out.println("Absolute difference of " + num4 + " with 5 is " + Math.abs(num4 - 5));
        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(num1, num2),num3), num4));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(num1, num2), num3),num4));

        System.out.println("\n-------TASK-2-------\n");

        int n1 = (int)(Math.random() * 101 ) - 50, n2 = (int)(Math.random() * 101 ) - 50,
                n3 = (int)(Math.random() * 101 ) - 50, n4 = (int)(Math.random() * 101 ) - 50,
                n5 = (int)(Math.random() * 101 ) - 50, n6 = (int)(Math.random() * 101 ) - 50,
                n7 = (int)(Math.random() * 101 ) - 50, n8 = (int)(Math.random() * 101 ) - 50;

        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Number 3 = " + n3);
        System.out.println("Number 4 = " + n4);
        System.out.println("Number 5 = " + n5);
        System.out.println("Number 6 = " + n6);
        System.out.println("Number 7 = " + n7);
        System.out.println("Number 8 = " + n8);
        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n1 , n2), n3), n4), n5), n6), n7), n8));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n1 , n2), n3), n4), n5), n6), n7), n8));
        System.out.println("Average of 8 numbers is = " +(n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8)/ 8);
        System.out.println("Absolute difference between smallest and greatest is = " + (Math.abs(
                Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n1 , n2), n3), n4), n5), n6), n7), n8)) -
                Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n1 , n2), n3), n4), n5), n6), n7), n8)));

        if (n3 > 0) System.out.println("3rd number is positive = true");
        else System.out.println("3rd number is positive = false");

        if (n5 < 0) System.out.println("5rd number is negative = true");
        else System.out.println("5th number is negative = false");

        if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0 || n6 == 0 || n7 == 0 || n8 == 0)
            System.out.println("There is at least one zero among those numbers is = true");
        else System.out.println("There is at least one zero among those numbers is = false");

        System.out.println("\n-------TASK-3-------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 7 numbers between 0(included) and 50(included");
        int no1 = input.nextInt();
        int no2 = input.nextInt();
        int no3 = input.nextInt();
        int no4 = input.nextInt();
        int no5 = input.nextInt();
        int no6 = input.nextInt();
        int no7 = input.nextInt();
        System.out.println("Number 1 = " + no1);
        System.out.println("Number 2 = " + no2);
        System.out.println("Number 3 = " + no3);
        System.out.println("Number 4 = " + no4);
        System.out.println("Number 5 = " + no5);
        System.out.println("Number 6 = " + no6);
        System.out.println("Number 7 = " + no7);
        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(Math.max(Math.max(Math.max
                        (no1 , no2), no3), no4), no5), no6), no7));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(Math.min(Math.min(Math.min
                (no1, no2),no3),no4),no5),no6),no7));
        System.out.println("Average of 7 numbers is = " + (no1 + no2 + no3 + no4 + no5 + no6 + no7)/7);

        if (no1 >= 10) System.out.println("First number is greater than or equal to 10 = true ");
        else System.out.println("First number is greater than or equal to 10 = false ");

        if (no7 <= 40)System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");

        if (no1 > 25 && no7 > 25)System.out.println("Both first and last numbers are greater than 25 = true ");
        else System.out.println("Both first and last numbers are greater than 25 = false ");

        if (no1 == 0 || no1 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else if (no2 == 0 || no2 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else if (no3 == 0 || no3 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else if (no4 == 0 || no4 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else if (no5 == 0 || no5 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else if (no6 == 0 || no6 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else if (no7 == 0 || no7 == 50) System.out.println("At least one of those numbers is 0 or 50 = true ");
        else System.out.println("At least one of those numbers is 0 or 50 = false");

        if (no1 >= 40 && no1 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else if (no2 >= 40 && no2 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else if (no3 >= 40 && no3 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else if (no4 >= 40 && no4 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else if (no5 >= 40 && no5 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else if (no6 >= 40 && no6 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else if (no7 >= 40 && no7 <= 50) System.out.println("There is no number between 40 and 50 = false ");
        else System.out.println("There is no number between 40 and 50 = true ");

        System.out.println("\n-------TASK-4-------\n");

        int random1 = (int) (Math.random() * 101);
        int random2 = (int) (Math.random() * 101);
        int random3 = (int) (Math.random() * 101);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        if (random1 > 25 && random2 > 25 && random3 > 25)
            System.out.println("True");
        else if (random1 <= 25 || random2 <= 25 || random3 <= 25)
            System.out.println("False");

        System.out.println("\n-------TASK-5-------\n");

        System.out.println(" Please enter a number between 1 to 7 (1 and 7 included) ");
        int numBetween1And7 = input.nextInt();

        if (numBetween1And7 == 1)
            System.out.println("The number entered returns MONDAY");
        else if (numBetween1And7 == 2)
            System.out.println("The number entered returns TUESDAY");
        else if (numBetween1And7 == 3)
            System.out.println("The number entered returns WEDNESDAY");
        else if (numBetween1And7 == 4)
            System.out.println("The number entered returns THURSDAY");
        else if (numBetween1And7 == 5)
            System.out.println("The number entered returns FRIDAY");
        else if (numBetween1And7 == 6)
            System.out.println("The number entered returns SATURDAY");
        else if (numBetween1And7 == 7)
        System.out.println("The number entered returns SUNDAY");
        else System.out.println("Unexpected input!");

        System.out.println("\n-------TASK-6-------\n");

        System.out.println("Please enter a number between -10 and 10");
        int numberBetween_10And10 = input.nextInt();

        if (numberBetween_10And10 > 0)
            System.out.println("Number entered is POSITIVE");
        else if (numberBetween_10And10 < 0)
            System.out.println("Number entered is NEGATIVE");
        else if (numberBetween_10And10 == 0)
            System.out.println("Number entered is ZERO");
        if (numberBetween_10And10 %2 == 0)
            System.out.println("Number entered is EVEN");
        else
            System.out.println("Number entered is ODD");

        System.out.println("\n-------TASK-7-------\n");

        System.out.println("Tell me your exam results?");
        int exam1 = input.nextInt();
        int exam2 = input.nextInt();
        int exam3 = input.nextInt();

        if (((exam1 + exam2 + exam3)/3) >= 70)System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        System.out.println("\n-------TASK-8-------\n");

        System.out.println("Enter 3 numbers");
        int matchingNum1 = input.nextInt();
        int matchingNum2 = input.nextInt();
        int matchingNum3 = input.nextInt();

        if (matchingNum1 == matchingNum2 && matchingNum2 == matchingNum3)
            System.out.println("TRIPLE MATCH");
        else if (matchingNum1 == matchingNum2 || matchingNum2 == matchingNum3 || matchingNum1==matchingNum3)
            System.out.println("DOUBLE MATCH");
        else
            System.out.println("NO MATCH");




        System.out.println("End of the program!");
    }
}
