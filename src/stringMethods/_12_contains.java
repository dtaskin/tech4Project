package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {
        /*
        Method Task: It is used to find out if a String contains another String or a character
        -It is non-static as we can call it with an  object
        -It is a return type, returns a boolean
        -it takes a String argument
         */

//        String s = "Good morning!";
//
//        System.out.println(s.contains("Good")); //true
//        System.out.println(s.contains("")); //true
//        System.out.println(s.contains("123")); //false
//        System.out.println(s.contains(s)); //true

        /*
    Ask user to enter an address
    If address contains "chicago" in any way, then print "You are in the club"
    else, print "You are not in the club"

    Chicago, CHICAGO, cHIcaGO
        */

        String address = ScannerHelper.getAStringFromUser();

        if (address.toUpperCase().contains("CHICAGO")){
            System.out.println("You are in the club");
        }
        else{
            System.out.println("You are not in the club");
        }

        System.out.println(address.toUpperCase().contains("CHICAGO") ? "You are in the club" : "You are not in the club");
        System.out.println(address.toLowerCase().contains("chicago") ? "You are in the club" : "you are not in the club");


    }
}
