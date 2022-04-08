package scanner;

import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args){
    /*
        How to use Scanner methods
        1.Create an object of Scanner (import the class as well)
        ClassName/DataType variableName/objectName = new ClassName/dataType(if it is needed);
        2.variableName/objectName.methodName(if its needed);
     */

     /*
     Task-1
     1. Ask user to enter their age
     2. Print the question
     3. Use the proper next method (nextInt)
     4. Print out the user's age
      */



     Scanner collect = new Scanner(System.in);


     System.out.println("How old are you?");
     int userAge = collect.nextInt();
     System.out.println("User is " + userAge +" years old.");


     System.out.println("What is your balance?");
     double userAccountBalance = collect.nextDouble();
     System.out.println("User has $" + userAccountBalance + " in his balance.");


     System.out.println("Class is fun today. (true/false");
     boolean userAnswer = collect.nextBoolean();
     System.out.println("User says " + userAnswer);














    }

}
