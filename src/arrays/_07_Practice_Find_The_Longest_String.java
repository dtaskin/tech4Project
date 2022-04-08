package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        /*
        Find the string that has most characters and print it

         */


        String[] colors = {"red", "blue", "yellow","white"};

        String longest = "";

        for (String color : colors) {
            if (color.length() > longest.length())
                longest = color;
        }

        System.out.println(longest);


    }
}
