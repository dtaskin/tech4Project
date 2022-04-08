package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /*
        Method Task: They are used to find the index or lst index of some char or String values in another String
        -they are non-static methods and called with another String object
        -they are return type, and they return int as index
        -they take either String or char as arguments

        NOTE: if the given char or String does not exist, they return -1
        NOTE: if you are looking for a index of String, and it exists, it will return the first index of found match


         */

        String sentence ="I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf('C'));  // 7
        System.out.println(sentence.indexOf('c')); // 10
        System.out.println(sentence.lastIndexOf('c')); //45

        sentence.indexOf("Chicago"); // 7
        sentence.indexOf("Miami"); // 19

        sentence.indexOf("miami"); //-1 if it doesn't exist, it will return -1

        System.out.println(sentence.lastIndexOf("")); //51

    }
}
