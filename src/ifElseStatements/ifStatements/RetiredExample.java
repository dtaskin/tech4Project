package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {

    public static void main(String[] args) {

        Scanner collect = new Scanner(System.in);

        System.out.println("What is your age");
        int age = collect.nextInt();

        boolean isAgeMoreThanOrEqualTo55 = age >= 55;

        if (isAgeMoreThanOrEqualTo55){
            System.out.println("It is your time to get retired!");

        }else {
            System.out.println("Keep working!");
        }


    }
}
