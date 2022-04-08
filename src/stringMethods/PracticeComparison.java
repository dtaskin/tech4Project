package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s1 = scan.nextLine();

        System.out.println("enter another string");
        String s2 = scan.nextLine();

      if (s1.equals(s2))
          System.out.println("These strings are equal");
      else System.out.println("These strings are not equal");

      //2nd way

        System.out.println("\n ----- 2nd way------\n");

      String str1 =  ScannerHelper.getANameFromUser();
      String str2 =  ScannerHelper.getANameFromUser();


        String resultMessage = str1.equals(str2) ? "These strings are equal" : "These strings are not equal";
        System.out.println(resultMessage);
//          simplified
//        String resultMessage = ScannerHelper.getANameFromUser().equals(ScannerHelper.getANameFromUser()) ? "These strings are equal" : "These strings are not equal";
//        System.out.println(resultMessage);



    }
}
