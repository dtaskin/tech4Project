package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
//        System.out.println("What is your first name?");
//        String name = input.next();
//        System.out.println("what is your last name?");
//        System.out.println("User's full name is " + name +" " + lastname);


//        Scanner input1 = new Scanner(System.in);
//        System.out.println("What is your address?");
//        String userAddress = input1.nextLine();
//        System.out.println("User's address is " + userAddress);


        Scanner sum1 = new Scanner(System.in);
        System.out.println("First number?");
        int num1 = sum1.nextInt();
        System.out.println("Second number?");
        int num2 = sum1.nextInt();
        System.out.println("Third number?");
        int num3 = sum1.nextInt();

        System.out.println("Sum of the numbers is = " + (num1 + num2
                + num3));

        //or
        int sum2 = num1 + num2 + num3;

        System.out.println("Sum of the numbers = " +sum2);




    }
}
