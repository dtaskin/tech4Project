package arrays;

import java.util.Arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-1-------\n");

        /*
        TASK-1
        Assume you are given a String as below
        Please find how many words you have in the given String

        String s1 = "Today is Tuesday";

        RESULT:
        3
         */

        String s1 = "Today is Tuesday";
        String[] splitFromSpace = s1.split(" ");
        System.out.println(splitFromSpace.length); // 3
//        System.out.println(s1.split(" "));

        String[] splitOnly = s1.split("");
        System.out.println(Arrays.toString(splitOnly)); //[T, o, d, a, y,  , i, s,  , T, u, e, s, d, a, y]
        System.out.println(splitOnly.length); //16

        System.out.println("\n--------TASK-2-------\n");

        /*

        TASK-2
        Assume you are given a String as below
        Please find how many words you have in the given String starts with A or a

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";

        RESULT:
        2
         */
        String s2 = "Some countries I visited were Argentina, Belgium and Malta";
        String[] startsWithA = s2.split(" ");

        int count = 0;
        for (String s : startsWithA) { // s2.split(" ") you can put this instead of startsWithA
         if (s.toLowerCase().startsWith("a"))
             count++;
        }
        System.out.println(count); // 2







    }
}
