package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class BalanceExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hi " + name + " What is your balance?");
        int grade = scan.nextInt();

//        boolean grade2 = grade >= 600;

        if (grade >= 600){
            System.out.println("Awesome! you are rich!");

        }else {
            System.out.println("Sorry, you are poor!");
        }





    }
}
