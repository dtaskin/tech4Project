package utilities;

public class CharacterHelper {



    public static boolean isSpace(char c){
        return c == ' ';

    }
    public static boolean isDigit(char c){
        return c >= '0' && c<= '9';

    }
    public static boolean isUppercase(char c){
        return c >= 'A' && c <='Z';

    }
    public static boolean isLowercase(char c){
        return c >= 'a' && c <= 'z';

    }
    public static boolean isLetter(char c){
        return isLowercase(c) || isUppercase(c);

    }
    public static boolean isVowel(char c){
        return c == 'A'|| c == 'E' || c =='I' || c =='O' || c == 'U' ||
                 c == 'a'|| c == 'e' || c =='i' || c =='o' || c == 'u';

    }
    public static boolean isConsonant(char c){
        return isLetter(c) && !isVowel(c);

    }

}
