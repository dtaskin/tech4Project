package homeworks;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;
import utilities.CharacterHelper;

import java.util.Arrays;
import java.util.Locale;

public class Homework12 {
    public static void main(String[] args){
        System.out.println("\n-------TASK-1-------\n");
        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n-------TASK-2-------\n");
        String[] s1 = new String[5];
        s1[1] = "abc";
        s1[4] = "xyz";

        System.out.println(s1[3]);
        System.out.println(s1[0]);
        System.out.println(s1[4]);
        System.out.println(Arrays.toString(s1));

        System.out.println("\n-------TASK-3-------\n");

        int[] numbers1 = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(numbers1));
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        System.out.println("\n-------TASK-4-------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n-------TASK-5-------\n");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));
        boolean b = false;
       for (String element : dogs)
           if (element.equals("Pluto")) {
               b = true;
               break;
           }
        System.out.println(b);

        System.out.println("\n-------TASK-6-------\n");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.binarySearch(cats,"Garfield") >= 0 && (Arrays.binarySearch(cats,"Felix") >= 0));

        /*
        boolean isGarfieldExisting = false;
        boolean isFelixExisting = false;

        for (String cat : cats){
            if (cat.equals("Garfield")) isGarfieldExisting = true;
            else if (cat.equals("Felix")) isFelixExisting =true;
        }

        System.out.println(isFelixExisting && isGarfieldExisting);
        */

        System.out.println("\n-------TASK-7-------\n");

        double[] doubleNums = {10.5, 20.75, 70.0, 80.0, 15.75};

        System.out.println(Arrays.toString(doubleNums));
        for (double doubleNum : doubleNums) {
            System.out.println(doubleNum);
        }

        System.out.println("\n-------TASK-8-------\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int letters = 0;
        int lowercase = 0;
        int uppercase = 0;
        int digit = 0;
        int special = 0;

        System.out.println(Arrays.toString(characters));
        for (char character : characters) {
            if (CharacterHelper.isLetter(character)){
                letters++;
                if (CharacterHelper.isLowercase(character)) lowercase++;
                else uppercase++;
            }else if(CharacterHelper.isDigit(character))digit++;
            else special++;
        }
        System.out.println("Letters = " + letters);
        System.out.println("Uppercase letters = " + uppercase);
        System.out.println("Lowercase letters = " + lowercase);
        System.out.println("Digits = " + digit);
        System.out.println("Special characters = " + special);

        System.out.println("\n-------TASK-9-------\n");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int upper = 0;
        int lower = 0;
        int bPIgnoreCase = 0;
        int bookOrPenIgnoreCase = 0;
        System.out.println(Arrays.toString(objects));
        for (String object : objects) {
            if(CharacterHelper.isLowercase(object.charAt(0)))lower++; //Character.isUpperCase() you can use this too
            if (CharacterHelper.isUppercase(object.charAt(0)))upper++; // Character.isLowerCase() java method
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen"))bookOrPenIgnoreCase++;
            if (object.toUpperCase().startsWith("B") ||object.toUpperCase().startsWith("P"))bPIgnoreCase++;

        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements starts with 'B' or 'P' = " + bPIgnoreCase);
        System.out.println("Elements having \"book\" or \"pen\" "+ bookOrPenIgnoreCase);

        System.out.println("\n-------TASK-10-------\n");

        int[] numbers2 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbers2));

        int moreThan10 = 0, lessThan10 = 0, equals10 = 0;
        for (int number : numbers2){
            if (number > 10) moreThan10++;
            else if (number == 10) equals10++;
            else lessThan10++;
        }
        System.out.println("Elements that are more than 10 = " + moreThan10);
        System.out.println("Elements that are less than 10 = " + lessThan10);
        System.out.println("Elements that are 10 = " + equals10);

        System.out.println("\n-------TASK-11-------\n");

        int[] num1 = {5, 8, 13, 1, 2};
        int[] num2 = {9, 3, 67, 1, 0};
        int[] num3 = new int[5];

        for(int i = 0; i <= 4; i++){
            num3[i] = Math.max(num1[i], num2[i]);
        }
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));


        System.out.println("\nEnd of the Program!");
    }
}
