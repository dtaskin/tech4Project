package ifElseStatements.ifElseIfStatement;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if (age > 18 ){
            System.out.println("Your are old enough to drive");
        }else {
            System.out.println("You're not old enough for driving");
        }

        System.out.println("What is your weight");
        double weight = scan.nextDouble();


        if (weight > 150){
            System.out.println("You are heavier than 150lbs!");
        }else {
            System.out.println("You are lighter than 150lbs!");
        }


    }
}
