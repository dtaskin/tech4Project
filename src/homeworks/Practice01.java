package homeworks;

import utilities.ScannerHelper;

import java.sql.SQLOutput;

public class Practice01 {
    public static void main(String[] args) {

//        Requirement:
//        Assume that you are given a String as below;
//        String str = ”SDLC is step by step procedure to create an application”;
//        Write a program to find length of given String and the indexes of “SDLC” and “application” words

        System.out.println("TASK-1");

        String str = "SDLC is step by step procedure to create an application";
        System.out.println("The length of the string is = " + str.length());
        System.out.println(str.indexOf("SDLC"));
        System.out.println(str.indexOf("application"));

        System.out.println("TASK 2");

//        Requirement:
//        Assume that you are given a String as below;
//        String str = “  I know how to code with Python  ”;

//        Write a program to manipulate given String and convert it to be:
//        “I KNOW HOW TO CODE WITH JAVA”

        String str1 ="  I know how to code with Python  ";

        System.out.println(str1.replace("Python" ,"JAVA").toUpperCase().trim());

        System.out.println("TASK 3");

//        Requirement:
//        Assume that you are given a String as below;
//        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
//        1.Find the first character of given String which is not white space
//        2.Find the last character of given String which is not white space

        String str2 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim(); // if you trim first It will work 82 characters to 89
        System.out.println("The first character is = " + str2.trim().charAt(0));
        System.out.println("The first character is = " + str2.trim().charAt(str.length()-1));


        System.out.println("TASK 4");

//        Requirement:
//        Assume you are given 3 Strings as below;
//        String s1 = “  TECH ”;
//        String s2 = “ glo  ”;
//        String s3 = “ BAL       “;
//        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
//        Note: The length of s4 will be 10 at the end!!!

            String s1 = "  TECH ".trim().replace("ECH", "ech");
            String s2 = " glo  ".trim().replace("g", "G");
            String s3 = " BAL       ".trim().toLowerCase();

            String s4 = s1 + s2 + s3;
        System.out.println(s4);
//        String s4 = s1.trim().replace("ECH", "ech") + s2.trim().replace("g", "G") +
//                s3.trim().toLowerCase();

        System.out.println("TASK 5");

//        Requirement:
//        Write a program that asks user to enter their favorite color.
//                Then, print the first and last characters of the color
//        Also, print the first and last 3 characters of the color
//        Test data:
//        green
//        Expected output:
//        1st character is = g
//        2nd character is = n
//        First 3 characters are = gre
//        Last 3 characters are = een

        String s5 = ScannerHelper.getANameFromUser();

        System.out.println("The first character is " + s5.charAt(0));
        System.out.println("The second character is " + s5.charAt(s5.length()-1));
        System.out.println("The first 3 characters are " + s5.substring(0,3));
        System.out.println("The last 3 characters are " + s5.substring(s5.length()-3));

        System.out.println("TASK 6");

//        Requirement:
//        Write a program that asks user to enter a full sentence
//        Then, convert all sentence to lower case and print the first and last words in the given sentence
//        Test data:
//        JavA is an object-oriented programming LanguAGE
//        Expected output:
//        1st word is = java
//        Last word is = language

        String s6 = ScannerHelper.getAStringFromUser().toLowerCase();
        System.out.println("1st word is = " + s6.substring(0,s6.indexOf(' ')));
        System.out.println("2nd word is = " + s6.substring(s6.lastIndexOf(' ') + 1));

        System.out.println("TASK 7");

//        Requirement:
//        Write a program that asks user to enter a full sentence
//        Then, check if given sentence contains $ character
//        If it contains $ character, then find the index of the $ character and print a proper message for the found index
//        Test data 1:
//        I saved $100 to buy new airpods
//        Expected output 1:
//        This sentence contains $ character
//        $ character’s index is = 8
//        Test data 2:
//        I’ll become a Software Engineer in Test
//        Expected output 2:
//        This sentence does not contain $ character


        String s7 = ScannerHelper.getAStringFromUser();
        if (s7.contains("$")){
            System.out.println("This sentence contains $ character" + "\n$ character index is = " + s7.indexOf('$'));
        }else {
            System.out.println("This sentence does not contain $ character");
        }

        System.out.println(s7.contains("$") ?
                "This sentence contains $ character" + "\n$ character index is = " + s7.indexOf('$') :
                "This sentence does not contain $ character");








    }
}
