package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that reads a name from user
        Reverse the name and print it back

        Test data:
        Kaly

        Expected output:
        ylaK

        Test data:
        Abraham

        Expected output:
        maharbA
        */

        String s = ScannerHelper.getANameFromUser();

        String reversedName = ""; // this "container" is created to have a place to store the result from for-loops; also converts results to Strings

        for (int i = s.length()-1; i >= 0 ; i--) {
            reversedName += s.charAt(i);
        }

        System.out.println("The reversed name is = " + reversedName);
        System.out.println("The reversed name is to  uppercase= " + reversedName.toUpperCase());

        // if you want to reuse the result from the for-loops you have to first store it as a variable





    }
}
