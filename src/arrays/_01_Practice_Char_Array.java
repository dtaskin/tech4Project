package arrays;

import utilities.CharacterHelper;

import java.util.Arrays;

public class _01_Practice_Char_Array {
    public static void main(String[] args){
        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H
        Print the array
        */

        System.out.println("\n-------TASK-1-------\n");

        char[] characters = {'#','$','5','A','b','H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n-------TASK-2-------\n");

        /*
        TASK-2
        Print the size of the array with a message
         */

        System.out.println("The size of the array is = " + characters.length);

        System.out.println("\n-------TASK-3-------\n");
        /*
        TASK-3
        Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        for (int i = 0; i < characters.length; i++){
            System.out.println(characters[i]);
        }


        System.out.println("\n-------TASK-4-------\n");

        /*
        TASK-4
        Print each element using for each loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        for (char element : characters){
            System.out.println(element);
        }

        System.out.println("\n-------TASK-5 - fori loop------\n");
        /*
        TASK-5
        Print each element that are letters

        EXPECTED:
        A
        b
        H
        */

        for (int i = 0; i < characters.length; i++){
            if(CharacterHelper.isLetter(characters[i]))
                System.out.println(characters[i]);
        }

        System.out.println("\n----------TASK-5 - for each loop-----------\n");
        for(char character : characters){
            if(Character.isLetter(character)) System.out.println(character);
        }


        System.out.println("\n-------TASK-6- fori loop-----\n");
        /*
        TASK-6
        Count how many uppercase characters you have in the array

        EXPECTED:
        2
                */

        int countUpper = 0;
        for (int i = 0; i < characters.length; i++) {
           if(CharacterHelper.isUppercase(characters[i]))
            countUpper++;
        }
        System.out.println(countUpper);

        System.out.println("\n-------TASK-6- for each loop-----\n");

        int countUpper1 = 0;
        for (char character : characters){
            if (CharacterHelper.isUppercase(character))countUpper1++;
        }
        System.out.println(countUpper1);






        System.out.println("End of the program!");
    }
}
