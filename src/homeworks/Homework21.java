package homeworks;

import java.util.Arrays;

public class Homework21 {
    //===========TASK-1===========//

    public static void fizzBuzz1(int numbers) {
        if (numbers == 0) System.out.println("FizzBuzz");
        else {
            for (int i = 1; i <= numbers; i++) {
                if (i % 15 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
            }
        }
    }

    //===========TASK-2===========//

    public static String fizzBuzz2(int numbers){
                if (numbers % 15 == 0) return ("FizzBuzz");
                else if (numbers % 3 == 0) return ("Fizz");
                else if (numbers % 5 == 0) return ("Buzz");
                else return String.valueOf(numbers);
    }

    //===========TASK-3===========//

    public static int findSumNumbers(String str){
        int total = 0;
        boolean b = false;
        String s = str.replaceAll("[^0-9]"," ");
        String[] arr = s.split(" ");
        for (String a : arr) {
            if(a.length() != 0){
                total += Integer.parseInt(a);
                b = true;
            }
        }
        if(b) return total;
        else return 0;
    }

    //===========TASK-4===========//

    public static int findBiggestNumber(String str) {
        int largest = Integer.MIN_VALUE;
        String s = str.replaceAll("[^0-9]"," ");
        String[] arr = s.split(" ");
        for (String a : arr) {
            if(!a.isEmpty()){
                if(Integer.parseInt(a) > largest){
                    largest = Integer.parseInt(a);
                    return largest;
                }
            }
        }
        return 0;
    }

    public static String countSequenceOfCharacters(String str) {
        String s = ""; // abcacB
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!s.contains(str.charAt(i) + "")) {
                s += str.charAt(i);
                s += count;
                count = 1;
            }
        }
        return s;
    }




    public static void main(String[] args) {
        //===========TASK-1===========//
        /*
       fizzBuzz1(0);
       fizzBuzz1(1);
       fizzBuzz1(3);
       fizzBuzz1(5);
       fizzBuzz1(15);



        //===========TASK-2===========//

        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));



        //===========TASK-3===========//

        System.out.println(findSumNumbers("a1b4c 6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

       //===========TASK-4===========//

        System.out.println(findBiggestNumber("ab110c045d"));


        //===========TASK-5===========//

        System.out.println(countSequenceOfCharacters("abbcc"));

         */

    }

}
