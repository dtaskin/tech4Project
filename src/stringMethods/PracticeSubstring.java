package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubstring {
    public static void main(String[] args) {
 /*
        Write a program that asks user to enter a sentence (multiple words)
        Find and print the first and the last words from the given sentence with below messages

        Test data1:
        I like Java

        Expected output:
        The first word is = I
        The last word is = Java

        Test data2:
        Today is Sunday

        Expected output:
        The first word is = Today
        The last word is = Sunday


        I like Java
        Today is Sunday
        Many students preferring to study after the class

        First word -> 0 - indexOf(' ')
        Last word  -> lastIndexOf(' ') + 1 to the end


        First space - the last space
        Everything before the first space is my first word
        Everything after the last space is my last word
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a sentence");
//        String sentence = input.nextLine();
//        String firstWord = sentence.substring(0,sentence.indexOf(" "));
//        String lastWord = sentence.substring(sentence.lastIndexOf(' ') + 1);
//        System.out.println("First word is " + firstWord);
//        System.out.println("Last word is " + lastWord);

        String sentence = ScannerHelper.getAStringFromUser(); //Enter a sentence

        String first = sentence.substring(0, sentence.indexOf(' '));
        String last = sentence.substring(sentence.lastIndexOf(' ')+1);

        System.out.println("The first word is = '" + first + "'");
        System.out.println("The last word is = '" + last + "'");


    }
}