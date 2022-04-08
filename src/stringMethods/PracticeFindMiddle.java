package stringMethods;

import utilities.ScannerHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String str2 = ScannerHelper.getANameFromUser(); // even number lionel ->on
        System.out.println("First letter is = " + str2.charAt(0));
        System.out.println("Last letter is = " + str2.charAt(str2.length()-1));
        System.out.println("Middle letter is = " + str2.charAt(str2.length()/2-1) + str2.charAt(str2.length()/2));
        String str3 = ScannerHelper.getANameFromUser(); // odd number james -> m
        System.out.println("First letter is = " + str3.charAt(0));
        System.out.println("Last letter is = " + str3.charAt(str3.length()-1));
        System.out.println("Middle letter is = " + str3.charAt(str3.length()/2-1));

    }
}
