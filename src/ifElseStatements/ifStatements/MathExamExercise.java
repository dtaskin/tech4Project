package ifElseStatements.ifStatements;

import java.util.Scanner;

public class MathExamExercise {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);
        System.out.println("What is your grade");
        int grade = ask.nextInt();

//        boolean passed = grade >= 60;  //dont need it anymore

        if (grade >= 60){
            System.out.println("Awesome! You have passed the math class!");

        }
        else {
            System.out.println("You need to study harder!");
        }


    }
}
