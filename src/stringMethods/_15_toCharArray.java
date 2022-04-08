package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args){

        String s = "Java";

        char[] chars = s.toCharArray(); // {'J', 'a', 'v', 'a'}

        System.out.println(Arrays.toString(chars));

        int count = 0;
        for (char element : chars){
            if (element == 'a') count++;
        }
        System.out.println(count);


        System.out.println(Arrays.toString("Hello".toCharArray())); // [H, e, l, l, o] its the same thing as above



    }
}
