package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args){

        /*
        1. I am going to use Scanner class for creating my object
        2. I will use the object for reading the data.
        */

        Scanner scanner = new Scanner(System.in); //creating a scanner object for using the methods

        System.out.println("Please put your first name"); // this is what I want user to put
        String firstName = scanner.next();  // Deniz  //.next() is the code pausing the name until written

        System.out.println("Please put your last name:"); //Second message for user
        String lastName = scanner.next(); // storing the last name form user

        System.out.println("The name user put = " + firstName); //Printing my object/variable
        System.out.println("The last name user put = " + lastName); // printing my object


    }
}
