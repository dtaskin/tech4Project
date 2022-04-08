package casting;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {

        /*
        Write a program asks user for 5 of their grades and print out their avg

        Input: 45, 50 ,55 ,65 ,70



        */
//        Scanner collect = new Scanner(System.in);
//        System.out.println("Please enter your 5 grades");
//
//         String grade1 = collect.next(), grade2 = collect.next(),
//                 grade3 = collect.next(), grade4 = collect.next(), grade5 = collect.next();
//
//         double grade1D =Double.parseDouble(grade1), grade2D =Double.parseDouble(grade2),
//                 grade3D =Double.parseDouble(grade3), grade4D =Double.parseDouble(grade4),
//                 grade5D =Double.parseDouble(grade5);
//
//        System.out.println("the average is " +(int) (grade1D + grade2D + grade3D + grade4D + grade5D) / 5);

        /*
        Write program that asks user their balance as a string and asks for 4 transactions as string
        and print out the end result as double

        Input:
        "what is your balance?"
        user: :456.7
        "What is your next 3 transactions?"
        user :34.1 , 65.3, 28.4
        output:
        "your balance is now = "



        */
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("What is your balance?");
//        String balance = scan.next();
//
//        System.out.println("what is your next 3 transactions?");
//        String trans1 = scan.next(), trans2 = scan.next(), trans3 = scan.next();
//
//        Double balanceD = Double.valueOf(balance);
//        Double trans1D = Double.valueOf(trans1), trans2D = Double.valueOf(trans2), trans3D = Double.valueOf(trans3);
//
//        System.out.println("Your balance is now = " + (balanceD + trans1D + trans2D + trans3D));

        // ALSO, YOU CAN DO THIS WAY because we don't store any of the data

//         Scanner scan = new Scanner(System.in);
//
//         System.out.println("What is your balance?");
//        String balance = scan.next();
//
//        System.out.println("what is your next 3 transactions?");
//        String trans1 = scan.next(), trans2 = scan.next(), trans3 = scan.next();
//
//
//        System.out.println("Your balance is now = " +
//                (Double.valueOf(balance) +
//                        Double.valueOf(trans1) +
//                        Double.valueOf(trans2) +
//                        Double.valueOf(trans3)));

        /*
        Write a program ask user for full name, age, phone number
        and enter their 3 kids ages as string then print out the oldest kid,
        youngest and the age difference between oldest and youngest.

        Program:"please enter your name"
        User: John doe
        Program: "please enter your age"
        User:45
        program: "Please enter your phone number:"
        user: (123)123 1234
        program: "enter the ages of your kids"
        User:
        12
        22
        17
        Program:
        Your name is John Doe, your phone number is (123) 123 1234,
        You are 45 years old, Your oldest kid is 22 years old, your
        youngest is 12, difference between oldest and youngest is 10
        years.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter full name");
        String fullName = input.nextLine();

        System.out.println("Please enter your age");
        String age = input.next();
        input.nextLine(); //clearing the spaces (nextLine problem)

        System.out.println("Please your phone number");
        String phoneNumber = input.nextLine();

        System.out.println("Please enter the ages of your kids");
//        String age1 = input.next(), age2 = input.next(), age3 = input.next();    //dont need it
//        int age1Int = Integer.parseInt(input.next()), age2Int = Integer.parseInt(input.next()), age3Int = Integer.parseInt(input.next());  //dont need it

//        Math.max(age1Int, age2Int); //dont need it anymore
        int oldestKid = Math.max((Math.max(Integer.parseInt(input.next()), Integer.parseInt(input.next()))),Integer.parseInt(input.next()));      //dont need it
        int youngestKid = Math.min((Math.min(Integer.parseInt(input.next()), Integer.parseInt(input.next()))), Integer.parseInt(input.next()));    // dont need it
//
        int ageDifference = Math.abs(oldestKid - youngestKid);  // dont need it anymore
//        Math.abs(oldestKid - youngestKid);      // dont need it anymore

        System.out.println("Your name is " + fullName + ", your phone number is " + phoneNumber +
                ",\n You are " + age + "years old, Your oldest kid is " + Math.max((Math.max(Integer.parseInt(input.next()), Integer.parseInt(input.next()))),Integer.parseInt(input.next())) +" years old, " +
                "\nyour" + "youngest kid is " + Math.min((Math.min(Integer.parseInt(input.next()), Integer.parseInt(input.next()))), Integer.parseInt(input.next())) + ", difference between oldest and youngest is " + Math.abs(oldestKid - youngestKid) +
                "\n years.");






    }
}
