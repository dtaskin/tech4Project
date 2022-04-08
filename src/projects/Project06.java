package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args){

        System.out.println("\n-------TASK-1-------\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String sentence = scan.nextLine().trim();
        int wordCount = 0;

        if(sentence.contains(" ")) {
            for (int i = 0; i < sentence.length(); i++)
                if (sentence.charAt(i) == ' ') {wordCount++;}
            System.out.println("This sentence has " + (wordCount + 1) +  " words.");

        }else
            System.out.println("This sentence does not have multiple words");

        System.out.println("\n-------TASK-2-------\n");

        System.out.println("Please enter a word");
        String word = scan.nextLine().trim();
        String reverseWord = "";

        if (word.length() != 0){
            for (int i = word.length()-1; i >= 0; --i){
                reverseWord = reverseWord + word.charAt(i);
            }
            if (word.equals(reverseWord)){
                System.out.println("This word is palindrome");
            }else
                System.out.println("This word is not palindrome");
        }else
            System.out.println("This word does not have 1 or more characters");

        /*

        String rWord = "";

        if(!word.isEmpty()){
            for(int i = word.length() - 1; i >= 0; rWord += word.charAt(i);
            if(word.equals(rWord)) System.out.println("This word is palindrome");
            else sout("this word is not a palindrome);
          else; sout(This word does nor have 1 or more characters)
        }

         */



        System.out.println("\n-------TASK-3-------\n");

        System.out.println("Please enter a string:");
        String s1 = scan.nextLine().toLowerCase();
        int characterCount = 0;

        if(s1.length() != 0){
            for (int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) == 'a'){characterCount++;}

            }System.out.println("This sentence has " + characterCount + " a or A letters");
        }else
            System.out.println("This sentence does not have any characters");


        System.out.println("\n-------TASK-4-------\n");

        System.out.println("Please enter a positive number:");
        int number = scan.nextInt();

        for (int i = 1; i < number; i++){
            if(i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        System.out.println("End of the program!");
    }
}
