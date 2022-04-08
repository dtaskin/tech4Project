package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = scan.nextInt(), num2 = scan.nextInt();

        if (num1 < num2 ) System.out.println(num1);
        else System.out.println(num2);


        // TERNARY OPERATOR

//        int smallestNumber = num1 < num2 ? num1 : num2;
                                // ? is used instead of simple if else statement
        System.out.println(num1 < num2 ? num1 : num2);



        System.out.println("End of the program! ");
    }

}