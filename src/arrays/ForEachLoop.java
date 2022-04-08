package arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};

        System.out.println(chars.length); // 7

        /*
        print each element with a message

        Expected output:
        Element 1 = A
        Element 2 =
        Element 3 = ,
        Element 4 = #
        Element 5 = T
        Element 6 = 6
        Element 7 = 9
         */
        System.out.println("\n----fori loop----\n");
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element = " + chars[i]);
        }
        System.out.println("\n----for each loop----\n");
        for (char element : chars){ // you can read like this: for each char in the element in the char
            System.out.println("Element is =" + element);
        }


    }

}
