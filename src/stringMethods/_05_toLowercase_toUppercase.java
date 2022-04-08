package stringMethods;

import java.util.Locale;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {
        /*
        Method Task: These methods are used to convert letters of a String to uppercase or lowercase
        -they are non-static methods that you can call them with objects of String class
        -They are return type methods, and they return the modified string object back
        -They don't take any argument
         */
        String s1 = "HELLO world";

        System.out.println(s1); // HELLO world
        System.out.println(s1.toLowerCase()); // hello world
        System.out.println(s1.toUpperCase()); // HELLO WORLD




        System.out.println("ISHDFH hkdfnskncs ldjfs;lj;KJSKLDFHSLKN kdslksndlc".toLowerCase());

        String sentence = "I paid $100.99 to buy airpods";

        String s2 = sentence.toLowerCase();
        String s3 = sentence.toUpperCase();

        System.out.println(s3.toLowerCase().toUpperCase()); //all uppercase
    }
}
