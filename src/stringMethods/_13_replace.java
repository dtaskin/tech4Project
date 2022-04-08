package stringMethods;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class _13_replace {
    public static void main(String[] args) {
        /*
        Method Task:It is used to replace some values in a String with another value
        NOTE: It replaces all the occurrences.
        -It is non-static
        -It is a return type and returns another which is modified
        -It takes 2 arguments (char or String)
         */

        String sentence = "Can I can a can?";

        System.out.println(sentence.replace("can","xxx")); //Can I xxx a xxx? // can replace multiple character with string

        String s = "banana";
        System.out.println(s.replace('a', '$')); //only one character with char ''






    }
}
