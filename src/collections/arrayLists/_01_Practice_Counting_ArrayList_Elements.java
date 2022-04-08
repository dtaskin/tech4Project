package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {
        /*
        TASK-1
        Create an ArrayList called numbers that stores below numbers,

        10
        12
        13
        8
        9
        15

        Print the list
         */

        System.out.println("\n-------TASK-1-------\n");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);
        System.out.println(numbers);

        System.out.println("\n-------TASK-2-------\n");
        /*
        TASK-2
        Count how many odd numbers you have in the list and print the result

        RESULT:
        Odds = 3
         */

        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
              if(i % 2 == 1) count++;
              // if(numbers.get(i) % 2 == 1) count++;
        }
        System.out.println("Odds = " + count);

//       Enhanced for loop (for each loop) solution)

//        int count = 0; // you can use the same container again and again if you reassign it to 0  again
//        for (Integer number : numbers) {
//            if (number % 2 == 1) count1++;
//        }
//        System.out.println("Odds " + count1);

          /*
        practices

         */


        System.out.println("\n-------TASK-3-------\n");

        /*
        TASK-3
        Create a List called colors that stores below elements
        Purple
        Yellow
        blue
        red
        Brown
        Black
        White

        And then print the list

        RESULT:
        [Purple, Yellow, blue, red, Brown, Black, White]
         */

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add("");
        colors.add(null);

        System.out.println(colors);

        System.out.println("\n-------TASK-4-------\n");

        /*
        TASK-4
        Count how many colors in the colors list are starting with uppercase

        RESULT:
        5
         */
        count = 0;
        for (String color : colors) {
            if (Character.isUpperCase(color.charAt(0))) count++;
        }
        System.out.println(count);

        //Fori loop solution
        count = 0;

        for(int i = 0; i < colors.size(); i++){
            if(Character.isUpperCase(colors.get(i).charAt(0))) count++;
        }
        System.out.println(count);

        /*
        practices
        lowercase
        nulls
        empties
        length of 5 at least
        Even length or odd length
        the ones contains "a" or "e" or both

         */





    }
}
