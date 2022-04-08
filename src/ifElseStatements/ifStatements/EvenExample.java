package ifElseStatements.ifStatements;

import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        System.out.println("Enter a number");
//        int number = collect.nextInt();  //dont need it anymore because you use only once

        if (collect.nextInt() % 2 == 0){
            System.out.println("The number you entered is even!");
        } else{
            System.out.println("The number you entered is odd!");
        }


    }
}
