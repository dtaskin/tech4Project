package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        /*
        Write a Java program that asks user to enter their favorite book name and quote and store answers of user in different Strings
        Finally, print the length of those Strings with proper message
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you favorite book");
        String book = input.nextLine();

        System.out.println("Enter you favorite quote");
        String quote = input.nextLine();

        System.out.println("Enter you favorite store");
        String store = input.nextLine();

        System.out.println("The length of \"" + book + "\" is = " + book.length());
        System.out.println("The length of \"" + quote + "\" is = " + quote.length());


        System.out.println("The favorite quote is " + quote.length());
        System.out.println("The favorite store is " + store.length());

    }}
