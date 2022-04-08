package homeworks;

import java.util.Scanner;
import utilities.ScannerHelper;

import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK 1-------\n");

        String name = ScannerHelper.getANameFromUser();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + (name.charAt(name.length()-1)));
        System.out.println("The first 3 characters in  the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in  the name are = " + name.charAt(name.length()-3) + name.charAt(name.length()-2) + name.charAt(name.length()-1));
        System.out.println(name.startsWith("A") || name.startsWith("a") ? "You are in the club" : "Sorry, you are not in the club");

        System.out.println("\n-------TASK 2-------\n");

        String address = ScannerHelper.getAStringFromUser().toLowerCase();

        if (address.contains("chicago")) System.out.println("You are in the club");
        else if(address.contains("des plaines")) System.out.println("You are welcome to join the club");
        else System.out.println("Sorry you will never be in the club");

        System.out.println("\n-------TASK 3-------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter at least 4 colors: ");
        String color = input.nextLine().toLowerCase();

        if ((color.contains("green")) && (color.contains("red"))) {
            System.out.println("Green and red are in the list");
        }
        else if (!color.contains("green") && !color.contains("red")) {
            System.out.println("Green and red are not in the list");
        }
        else if (color.contains("green")){
            System.out.println("Green is in the list");
        }
        else if(color.contains("red")){
            System.out.println("Red is in the list");
        }
        else{System.out.println();
        }

        System.out.println("\n-------TASK 4-------\n");
        String str = "   Java is FUN   ";

        System.out.println("The first word in the str is = " + str.trim().substring(0,4).toLowerCase());
        System.out.println("The second word in then str is = " + str.substring(str.indexOf("i"), 10));
        System.out.println("The third word in the str is = " + str.substring(str.lastIndexOf("F")).toLowerCase());


    }
}
