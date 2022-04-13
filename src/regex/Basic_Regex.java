package regex;

import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class Basic_Regex {
    public static void main(String[] args){
        Pattern pattern = compile("o");
        Matcher matcher = pattern.matcher("I love techGlobal");

        System.out.println(matcher.matches()); // returns true or false --> checks if given string pattern

        while(matcher.find()){ // find the next matched patters in the given string
            System.out.println(matcher.group()); // print out the next matched pattern in the given string
            System.out.println(matcher.start()); //  returns int --> prints out where found pattern starts
            System.out.println(matcher.end()); //returns int -->
        }
    }
}


