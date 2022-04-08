package homeworks;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");

        for (int i = 1; i < 11; i++){
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("\n-------TASK-2-------\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean firstPositive = false;
        boolean firstNegative = false;

        for (int number : numbers) {
            if (number > 0 && !firstPositive){
                firstPositive = true;
            System.out.println("First positive number is: " + number);
            }else
                if (number < 0 && !firstNegative){
                firstNegative = true;
                System.out.println("First negative number is: " + number);
            }
            if (firstPositive && firstNegative) break;
        }

//        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        /*
         int pos = -1;
        int neg = 1;

        for (int number : numbers) {

            if (pos != -1 && neg != 1) break; // optional for performance

            if (pos == -1 && number > 0){
                pos = number;
            }else if (neg == 1 && number < 0){
                neg = number;
            }
        }

        System.out.println((pos != -1) ? "First positive number is: " + pos : "Positive number was not found!");
        System.out.println((neg != 1) ? "First negative number is: " + neg : "Negative number was not found!");

         */


        System.out.println("\n-------TASK-3-------\n");

        int randomNum = (int) (Math.random() * 11),
            randomNum1 = (int) (Math.random() * 11),
            randomNum2 = (int) (Math.random() * 11),
            randomNum3 = (int) (Math.random() * 11),
            randomNum4 = (int) (Math.random() * 11);

        int[] randomArray = {randomNum, randomNum1,randomNum2,randomNum3,randomNum4};
        System.out.println(Arrays.toString(randomArray));
        
        boolean contains = false;
        for (int randomNumber : randomArray) {
            if (randomNumber == 2 || randomNumber == 3)
                contains = true;
        }
        System.out.println(contains);

        System.out.println("\n-------TASK-4-------\n");

        String[] fruits = {};
        boolean apple = false;

        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase("apple"))
                apple = true;
        }
        System.out.println(apple);

        System.out.println("\n-------TASK-5-------\n");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean matching = false;
        for (int numberA : numbers1){
            for (int numberB : numbers2) {
                if (numberA == numberB){
                    System.out.println(numberA);
                    matching = true;
                    break;
                }
            }
        }
        if (!matching) System.out.println("There is no matching elements");

        System.out.println("\n-------TASK-6-------\n");

        String str = "baNana";
        char[] chars = str.toCharArray();
        String str1 = "";
        boolean duplicate = false;

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length - 1   ; j++) {
                if (!str1.toLowerCase().contains((chars[i] + "").toLowerCase()) &&
                        (chars[i] + "").equalsIgnoreCase(chars[j] + "")) {
                    str1 += chars[i];
                    System.out.println(chars[i]);
                    duplicate = true;
                }
            }
        }
        if (!duplicate) {
            System.out.println("There is no duplicated character");
        }


    }
}
