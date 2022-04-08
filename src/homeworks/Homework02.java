package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){

        System.out.println("\n----------TASK-1---------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String firstName = input.next();

        System.out.println("What is your last name?");
        String lastName = input.next();

        System.out.println("How old are you?");
        int userAge = input.nextInt();

        System.out.println("What is your email address?");
        String emailAddress = input.next();

        System.out.println("What is your phone number?");
        input.nextLine();
        String phoneNumber = input.nextLine();;

        System.out.println("What is your address?");
        String address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName +" " + lastName +". John's age is " + userAge +".\n" +
                "John's email address is " + emailAddress + ", phone number " + "\n" + phoneNumber + ", and address " + address +".");

        System.out.println("\n---------TASK-2----------\n");

        System.out.println("What is your favorite book?");
        String favBook = input.nextLine();
        System.out.println("User's favorite book is: " + favBook);
        System.out.println("What is your favorite color?");
        String favColor = input.nextLine();
        System.out.println("User's favorite color is: " + favColor);
        System.out.println("What is your favorite number?");
        int favNumber = input.nextInt();
        System.out.println("User's favorite number is: " + favNumber);








    }
}
