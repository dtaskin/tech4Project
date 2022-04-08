package projects;

import java.util.Arrays;

public class Project07 {

    // -------TASK-1-------
    public static void findGreatestAndSmallestWithSort (int[] numbers){
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0] + "\nGreatest = " + numbers[numbers.length-1]);
    }


    //-------TASK-2-------
    public static void findGreatestAndSmallest (int[] numbers){
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        System.out.println("Smallest = " + min + "\nGreatest = " + max);

    }

    // -------TASK-3-------

    public static void findSecondGreatestAndSmallestWithSort(int[] numbers){
        /*
         public static void findSecondGreatestAndSmallestWithSort(int[] nums){
        //[10, 5, 6, 7, 8, 5, 15, 15]
        Arrays.sort(nums);

        //[5, 5, 6, 7, 8, 10, 15, 15]
        // max = nums[nums.length - 1]
        // min = nums[0]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[0]){
                System.out.println(nums[i]);
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[i] != nums[nums.length - 1]){
                System.out.println(nums[i]);
                break;
            }
        }
         */

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        Arrays.sort(numbers);
        for (int number : numbers){
            if (number < smallest) smallest = number;
        }
        for (int number : numbers){
            if (number == smallest) continue;
            else if (number < secondSmallest)secondSmallest = number;

        }

        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > greatest) greatest = number;
        }
        for (int number : numbers){
            if (number == greatest) continue;
            else if (number > secondGreatest) secondGreatest = number;
        }


        System.out.println("Second smallest = " + secondSmallest + "\nSecond greatest = " + secondGreatest);

        }

    // -------TASK-4-------

    public static String findSecondGreatestAndSmallest(int[] numbers){
        /*
          public static void findSecondGreatestAndSmallest(int[] nums){
        int max = 0;
        int min = 0;
        int secondMax = 0;
        int secondMin = 0;
        //
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }
        //
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != max && nums[i] > secondMax) secondMax = nums[i];
            if (nums[i] != min && nums[i] < secondMin) secondMin = nums[i];
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);

    }
         */

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers){
            if (number < smallest) smallest = number;
        }
        for (int number : numbers){
            if (number == smallest) continue;
            else if (number < secondSmallest)secondSmallest = number;

        }

        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > greatest) greatest = number;
        }
        for (int number : numbers){
            if (number == greatest) continue;
            else if (number > secondGreatest) secondGreatest = number;
        }



    return "Second smallest = " + secondSmallest + "\nSecond greatest = " + secondGreatest;
    }

    //-------TASK-5-------

    public static void findDuplicatedElementsInAnArray(String[] strings) {

        boolean duplicateFound = false;
        for (int i = 0; i < strings.length - 1; i++){
            for (int j = i + 1; j < strings.length; j++){
               if (strings[i] == strings[j]){
                   System.out.println(strings[i]);
                   duplicateFound = true;
               }
            }
        }
        if (!duplicateFound){
            System.out.println("The is no duplicate element");
        }
    }

    // -------TASK-6-------
    /*

    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.

    Test data:
    ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]

    Expected output:
    pen


    public static void findMostRepeatedElementInAnArray(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }

    public static void main(String[] args) {
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        String[] words2 = {"a", "a", "b", "c"}; // a counted 2 times in this array
        String[] words3 = {"abc", "ABC", "ab", "ab", "abc", "ab"}; // ab counted 3 times in this array


        findMostRepeatedElementInAnArray(words);
        findMostRepeatedElementInAnArray(words2);
        findMostRepeatedElementInAnArray(words3);
        findMostRepeatedElementInAnArray(new String[]{"x", "y", "z", "y"});



     */



    public static void findMostRepeatedElementInAnArray(String[] strings){
        String str = "";
        int count = 0;

        for (int i = 0; i < strings.length; i++){
            String duplicated = strings[i];
            int duplicatedCount = 0;
            for (int j = 0; j < strings.length; j++){
                if (strings[i].equals(strings[j])) duplicatedCount++;
            }
            if (duplicatedCount > count){
                str = duplicated;
                count = duplicatedCount;

            }
        }
        System.out.println(str);

    }



    public static void main(String[] args) {
        System.out.println("\n-------TASK-1-------\n");
        int[] number = {10, 7, 7, 10, -3, 10, -3};

        findGreatestAndSmallestWithSort(number);


        System.out.println("\n-------TASK-2-------\n");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};

        findGreatestAndSmallest(numbers);

        System.out.println("\n-------TASK-3-------\n");
        int[] num1 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(num1);

        System.out.println("\n-------TASK-4-------\n");
        int[] num = {10, 5, 6, 7, 8, 5, 15, 15};

        System.out.println(findSecondGreatestAndSmallest(num));

        System.out.println("\n-------TASK-5-------\n");

        String[] s = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        findDuplicatedElementsInAnArray(s);

        System.out.println("\n-------TASK-6-------\n");

        String[] str = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        findMostRepeatedElementInAnArray(str);






    }

}


