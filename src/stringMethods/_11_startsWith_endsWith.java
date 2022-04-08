package stringMethods;

import java.util.Locale;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {
        /*
        Method Task: They are used to find out if the string starts with or ends with another letter or string
        -They are non-static as we call them with objects
        -They return boolean
        -They take String as an arguments
         */




        String str = "Today is Sunday";

        System.out.println(str.startsWith("Today")); //true
        System.out.println(str.startsWith("today")); //false
        System.out.println(str.endsWith("day")); //true

        System.out.println(str.toUpperCase().endsWith("SUNDAY")); //true bc it is converted to uppercase

        System.out.println(str.startsWith("is",6)); // true




    }
        }
