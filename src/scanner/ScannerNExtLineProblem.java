package scanner;

import java.util.Scanner;

public class ScannerNExtLineProblem {
    public static void main(String[] args){

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = userInput.next();
//        System.out.println("How old are you?");
//        int age = userInput.nextInt();
//        System.out.println("Is your brain fried?");
//        boolean myBrainOk = userInput.nextBoolean();
//        System.out.println("Whats your address?");
//        userInput.nextLine(); //do this to avoid the address problem Salih mentioned
//        String address = userInput.nextLine();
//
//        System.out.println("User name is " +name +
//                "\nUser age is =" + age +
//                "\nIs user's brain OK? = " + myBrainOk +
//                "\nUser's address is = " + address);

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
