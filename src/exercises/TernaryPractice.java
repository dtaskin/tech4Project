package exercises;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("What is you balance?");
        double m1 = m.nextDouble();
        if (m1 < 50){
            System.out.println("You are poor");
        }else {
            System.out.println("You are not poor");
        }
        //2nd WAY
        String message = (m1 < 50.0 ) ? "You are poor" :"You are not poor";


    }
}
