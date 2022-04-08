package exercises;

public class Mock2WhiteBoard {
    // Count words
    // Palindrome
    // codingBat arrays1/sum2
    public static void main(String[] args) {

        String sentence = "Java is fun";
        System.out.println("This sentence has " + countWords(sentence) + " words.");
        System.out.println("This sentence has " + countWordsWithSplit(sentence) + " words.");


    }

    public static int countWords(String s) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ') spaces++;
            return spaces + 1;
    }

    public static int countWordsWithSplit(String s){
       return s.split(" ").length;
    }

    public static boolean isPalindrome(String s){
        String rWord = "";
        String word = "kayak";
        for (int i = s.length() - 1; i >= 0; i++){
            rWord += word.charAt(i);

        }return rWord.equals(word);
    }


}

