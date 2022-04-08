package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {
         /*
    Write a program that asks user to enter their name
    Print first char of the name with message "First character in the name is = "
    Print last char of the name with message "Last character in the name is = "

    Kaly
    charAt(0)
    charAt(3) -> name.length()-1

    Taylor
    charAt(0)
    charAt(5) -> name.length()-1

    Guluzar
    charAt(5) -> name.length()-1

    NOTE:
    First character of String is always -> str.charAt(0)
    Last character of String is always -> str.charAt(str.length()-1)
     */

        String str1 = ScannerHelper.getANameFromUser();
        System.out.println("First letter is = " + str1.charAt(0));
        System.out.println("Last letter is = " + str1.charAt(str1.length()-1));
        System.out.println("Middle letter is = " + str1.charAt(str1.length()/2-1) + str1.charAt(str1.length()/2));
        String str2 = ScannerHelper.getANameFromUser();
        System.out.println("First letter is = " + str2.charAt(0));
        System.out.println("Last letter is = " + str2.charAt(str2.length()-1));
        System.out.println("Middle letter is = " + str2.charAt(str2.length()/2-1) + str2.charAt(str2.length()/2));
        String str3 = ScannerHelper.getANameFromUser();
        System.out.println("First letter is = " + str3.charAt(0));
        System.out.println("Last letter is = " + str3.charAt(str3.length()-1));
        System.out.println("Middle letter is = " + str3.charAt(str3.length()/2-1));





    }
}
