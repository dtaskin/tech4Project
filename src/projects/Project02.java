package projects;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("-------TASK-1-------");

        Scanner collect = new Scanner(System.in);

        System.out.println("Please enter 3 numbers ");
        int number1 = collect.nextInt();
        int number2 = collect.nextInt();
        int number3 = collect.nextInt();
        System.out.println("The product of the number entered is = " + number1 * number2 * number3);

        System.out.println("-------TASK-2-------");
        System.out.println("What is your first name?");
        String firstName = collect.next();
        System.out.println("What is your last name?");
        String lastName = collect.next();
        System.out.println("What is your date of birth?");
        int birthYear = collect.nextInt();
        System.out.println(firstName + " " + lastName + "'s age is = " + (2022 - birthYear) + ".");

        System.out.println("-------TASK-3-------");
        System.out.println("What is your full name?");
        collect.nextLine();
        String fullName4 = collect.nextLine();
        System.out.println("What is your weight?");
        int weight = collect.nextInt();
        System.out.println(fullName4 + "'s weight is = " +(weight * 2.205) + "lbs.");

        System.out.println("-------TASK-4-------");
        System.out.println("What is your full name?");
        collect.nextLine();
        String fullName1 = collect.nextLine();
        System.out.println("What is your age?");
        int age1 = collect.nextInt();
        collect.nextLine();
        System.out.println("What is your full name?");
        String fullName2 = collect.nextLine();
        System.out.println("What is your age?");
        int age2 = collect.nextInt();
        collect.nextLine();
        System.out.println("What is your full name?");
        String fullName3 = collect.nextLine();
        System.out.println("What is your age?");
        int age3 = collect.nextInt();
        System.out.println("The average age is " + ((age1 + age2 + age3)/3));
        int maxOfAge1AndAge2 = Math.max(age1, age2);
        int minOfAge1AndAge2 = Math.min(age1, age2);
        int eldestAge = Math.max(maxOfAge1AndAge2, age3);
        int youngestAge = Math.min(minOfAge1AndAge2, age3);
        System.out.println("The eldest age is " + eldestAge);
        System.out.println("The youngest age is " + youngestAge);






    }
}
