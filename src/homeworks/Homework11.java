package homeworks;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
//
//        System.out.println("\n-------TASK-1-------\n");
//
//        String a = "";
//        for (int i = 1; i <= 100; i++){
//            if (i % 7 == 0) a += i + " - ";
//        }
//        if (!a.isEmpty()) System.out.println(a.substring(0,a.length()-3));
//        else System.out.println(a);
//
//        System.out.println("\n-------TASK-2-------\n");
//
//        String b = "";
//
//        for (int i = 1; i <= 50; i++) {
//            if (i % 6 == 0) b += i + " - ";
//        }
//        if (!b.isEmpty()) System.out.println(b.substring(0, b.length()-3));
//        else System.out.println(b);
//
//        System.out.println("\n-------TASK-3-------\n");
//
//        String c = "";
//
//        for (int i = 100; i >= 50 ; i--) {
//            if (i % 5 == 0) c += i + " - ";
//        }
//        if (!c.isEmpty()) System.out.println(c.substring(0, c.length()-3));
//        else System.out.println(c);
//
//        System.out.println("\n-------TASK-4-------\n");
//
//        for (int i = 0; i <= 7; i++){
//            System.out.println("The square of " + i + " is = " + i * i);
//        }
//
//        System.out.println("\n-------TASK-5-------\n");
//
//        int d = 0;
//        for (int i = 1; i <= 10; i++){
//            d += i;
//        } System.out.println(d);
//
//        System.out.println("\n-------TASK-6-------\n");
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a positive number");
//        int num = input.nextInt();
//
//        int e = 1;
//        for (int i = 1; i <= num; i++){
//            e *= i;
//        }System.out.println(e);
//
//        System.out.println("\n-------TASK-7-------\n");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your full name:");
//        String fullName = scan.nextLine();
//
//        int vowels = 0;
//        for (int i = 0; i < fullName.length(); i++){
//            if (CharacterHelper.isVowel(fullName.charAt(i)))vowels++;
//        }
//        System.out.println("There are " + vowels + " vowel in this full name");

        System.out.println("\n-------TASK-8-------\n");

        int num1 = 0;
        int sumOfNumbers = 0;

        do {
            if(sumOfNumbers == 0) System.out.println("Please enter a number");
            else{
                System.out.println("This number(s) less than 100");
                System.out.println("Please enter another number");
            }
            num1 = input.nextInt();
            sumOfNumbers +=num1 ;
        }while (num1 < 100 && sumOfNumbers < 100);
        System.out.println("This number is already more than 100");

        System.out.println("\n-------TASK-9-------\n");

        /*

          int n1 = 0;
        int n2 = 1;
        int total = 0;
        String message = "";

        for (int i = 0; i < 7; i++) {
            message += n1 + " - ";
            total = n1 + n2;

            n1 = n2;
            n2 = total;
        }

        System.out.println(message.substring(0, message.length() - 3));

         */

        System.out.println("enter a number");

        int fib = input.nextInt();

        int n1 = 0;
        int n2 = 1;
        String s1 = n1 + " - ";

        for( int i = 2; i < fib; i++) {
            int sumOfN1N2 = n1 + n2;
            s1 += sumOfN1N2 + " - ";
            n1 = n2;
            n2 = sumOfN1N2;
        }
        System.out.println(s1.substring(0, s1.length()-3));

        System.out.println("\n-------TASK-10-------\n");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name1 = scan1.nextLine().toLowerCase();

        while (!name1.startsWith("j")){ // ASK THIS -- It doesnt work with || or && had to to.lowercase
            System.out.println("Please enter another name");
            name1 = scan1.nextLine();
        }

        System.out.println("End of the program");


        System.out.println("End of the program!");
    }
}
