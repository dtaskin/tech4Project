package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {
        /*
        Ask user to enter any number
        -print "The number is positive" if the user enter a positive number
        -print "The number is negative" if the user enter a negative number
        -print "The number is zero" if the user enter a zero
         */

        int num = ScannerHelper.getNumberFromUser();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter any number");
//        int num = input.nextInt();
        if (MathHelper.isPositive(num)){
            System.out.println("The number is positive");
        }else if (MathHelper.isNegative(num)){
            System.out.println("The number is negative");
        }else
            System.out.println("The number is zero");


    }
}
