package homeworks;

import java.util.Arrays;
import java.util.TreeSet;

import static java.lang.Integer.valueOf;

public class Homework19 {
    public static String noDigit(String str){
        String s = "";

        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i)))
            s += str.charAt(i);
        }
        return s;
    }

    public static String noVowel(String str){
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(!(str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' || str.toLowerCase().charAt(i) == 'i' ||
                    str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'u')){
                s += str.charAt(i);
            }
        }
        return s;
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    public static boolean hasUpperCase(String str){
        if(str.length() > 0) {
            for(int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i)))
                    return true;
            }
        }
        return false;
    }

    public static int middleInt(int a, int b, int c){
       int[] numbers = {a,b,c};
       Arrays.sort(numbers);
       return numbers[1];
    }

    public static int[] no13(int[] numbers){
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 13) arr[i] = 0;
            else arr[i] = numbers[i];
        }
        return arr;
    }

    public static int[] arrFactorial(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else {
                int number = numbers[i];
                for (int j = 2; j < number; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }

    public static String[] categorizeCharacters(String str){
        char[] c = str.toCharArray();
        String letters = "";
        String specials = "";
        String digits = "";

        for(char a : c){
            if(Character.isLetter(a)) letters += a;
            else if(Character.isDigit(a)) digits += a;
            else if(!Character.isLetterOrDigit(a) && !Character.isWhitespace(a)) specials += a;
        }
        String[] list = {letters,digits,specials};
        return list;
    }




        // TESTING METHOD
    public static void main(String[] args) {
        String s = "abc123$#%";

        System.out.println(Arrays.toString(categorizeCharacters(s)));
    }
}
