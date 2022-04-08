package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework14 {
    public static <Arraylist> void main(String[] args){
        System.out.println("\n=========TASK-1=========\n");

        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        boolean isDuplicate = false;
        int duplicateNum = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1 ; j < numbers.length; j++){
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    duplicateNum += 1;
                    isDuplicate = true;
                    break;
                }
            }
            if (duplicateNum > 0){
                break;
            }
        }
        if(!isDuplicate) {
            System.out.println("There is no duplicate element");
        }

        System.out.println("\n=========TASK-2=========\n");

        String[] words = {"a", "b", "B", "XYZ", "123"};

        boolean isDuplicateS = false;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])){
                    System.out.println(words[i]);
                    isDuplicateS = true;
                    break;
                }
            }
            if (isDuplicateS){
                break;
            }
        }
            if(!isDuplicateS){
                System.out.println("There is no duplicates");
            }

        System.out.println("\n=========TASK-3=========\n");

        int[] numbers1 = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        String s = "";
        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j] && !s.contains(numbers1[i] + "")) {
                    s += numbers1[i] + "\n";
                }
            }
        }

        System.out.println((s.isEmpty()) ? "There is no duplicates" : s);

        /*
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers1[i] == numbers1[j] && !duplicates.contains(numbers1[i])){
                    duplicates.add(numbers1[i]);
                }
            }
        }
        if (duplicates.isEmpty()) System.out.println("There is no duplicates");
        else for (Integer duplicate : duplicates) System.out.println(duplicate);
         */

        System.out.println("\n=========TASK-4=========\n");

        String[] ws = {"A", "foo", "12" , "Foo", "bar", "a", "a","java"};

        String duplicates = "";

        for (int i = 0; i < ws.length - 1; i++) {
            for (int j = i + 1; j < ws.length; j++) {
                if (ws[i].equalsIgnoreCase(ws[j]) && !duplicates.contains(ws[i].toLowerCase())){
                    System.out.println(ws[i]);
                    duplicates += ws[i].toLowerCase();
                }
            }
        }

        if (duplicates.isEmpty()) System.out.println("There is no duplicates");

        System.out.println("\n=========TASK-5=========\n");

        String[] words1 = {"java", "python", "ruby"};
        ArrayList<String> reversedWords1 = new ArrayList<>();

        for (int i = words1.length - 1; i >= 0; i--) {
            reversedWords1.add(words1[i]);
        }
        System.out.println(reversedWords1);

        System.out.println("\n=========TASK-6=========\n");

        String str = "Java is fun";
        String[] sentence = str.split(" ");
        String reversedSentence = "";

        for(String word1 : sentence){
            String reverseWord = "";
            for(int i = word1.length()-1; i >= 0; i--){
                reverseWord += word1.charAt(i);
            }
            reversedSentence += reverseWord + " ";
        }

        System.out.println(reversedSentence);

        System.out.println("End of the program!");
    }
}


