package homeworks;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args){
        System.out.println("\n-------TASK-1-------\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String s1 = scan.nextLine();


        if (s1.length() < 1){
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + s1.length());
            System.out.println("First char is = " + s1.trim().charAt(0));
            System.out.println("First char is = " + s1.trim().charAt(s1.length()-1));

            }
            boolean b = false;
        for (int i = 0; i < s1.length(); i++) {
            if (CharacterHelper.isVowel(s1.charAt(i))) b = true;
        } if (b == true){
            System.out.println("This String has vowel");
        }else System.out.println("This String does not have vowel");


        System.out.println("\n-------TASK-2-------\n");

            String s2 = scan.nextLine();

            if (s2.length() <= 3) {
                System.out.println("Length is less than 3");
            }else
                if (s2.length() % 2 == 0)
                    System.out.println("" + s2.charAt(s2.length()/2-1) + s2.charAt(s2.length()/2));
                else System.out.println(s2.charAt(s2.length()/2));

        System.out.println("\n-------TASK-3-------\n");

        String str1 = scan.nextLine().trim();

        if (str1.length() < 4) System.out.println("INVALID INPUT");
        else {
            System.out.println("First 2 characters are = " + str1.substring(0, 2));
            System.out.println("Last 2 characters are = " + str1.substring(str1.length() - 2));
            System.out.println("The other characters are = " + str1.substring(2, str1.length() - 2));
        }

        System.out.println("\n-------TASK-4-------\n");

        String str2 = scan.nextLine();

        if (str2.length() < 2) System.out.println("Length is less than 2");
        else {
            if (str2.substring(0,2).equals(str2.substring(str2.length()-2))) System.out.println("True");
            else System.out.println("False");
        }

        System.out.println("\n-------TASK-5-------\n");

        String str3 = scan.nextLine();
        String str4 = scan.nextLine();

        if (str3.length() < 2 || str4.length() < 2) System.out.println("INVALID INPUT");
        else {
            System.out.println("" + str3.trim().substring(1, str3.length()-1) + str4.trim().substring(1, str4.length()-1));
        }

        System.out.println("\n-------TASK-6-------\n");

        String str5 = scan.nextLine();
        if (str5.length() < 4 ) System.out.println("INVALID INPUT");
            else if (str5.startsWith("xx") && str5.endsWith("xx"))
            System.out.println("true");
        else System.out.println("False");


        }
    }
