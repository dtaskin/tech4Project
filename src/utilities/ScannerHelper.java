package utilities;

import java.util.Scanner;

public class ScannerHelper {

    public static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = input.nextInt();
        return num;
    }
    public static String getANameFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = input.nextLine();
        return name;
    }
    public static String getAStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your address: ");
        String string = scanner.nextLine();
        return string;


}
}
