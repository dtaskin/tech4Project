package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project08 {

    //-------TASK-1-------//

    public static int countMultipleWords(String[] arr) {

        int countMultipleWords = 0;

        for (String word : arr) {
            if (word.trim().contains(" ")) countMultipleWords++;
        }
        return countMultipleWords;
    }

    //-------TASK-2-------//

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){

//        numbers.removeIf(number -> number < 0);
//        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element < 0) {
                iterator.remove();
            }
        }
        return numbers;
    }

    //-------TASK-3-------//

    public static boolean validatePassword(String password) {
        if((password.length() >= 8 && password.length() <= 16) && !password.contains(" ")){
            boolean isLowerCase = false, isUpperCase = false, isDigit = false, isSpecial = false;
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);
                if (Character.isLetter(c)){
                    if (Character.isLowerCase(c)) isLowerCase = true;
                    else  isUpperCase = true;
                }else if (Character.isDigit(c)) {
                    isDigit = true;
                }else isSpecial = true;
            }
            return (isDigit && isLowerCase && isUpperCase && isSpecial);
        }return false;
    }

        //-------TASK-4-------//

    public static boolean validateEmailAddress(String email) {
        if (email.contains(" ")) return false;
        if (email.contains("@") && email.contains(".")) {
            String[] split1 = email.split("@");
            String[] split2 = split1[1].split("\\.");//in java "."needs to use together "\\."
            return split1[0].length() > 2 && split2[0].length() > 2 && split2[1].length() > 2;
        }
        return false;
    }

    public static void main(String[] args) {
//        TASK-1

        String[] stringArr = {"foo", "", " ", "foo bar", "java is fun", "ruby"};

        System.out.println(countMultipleWords(stringArr));

//        TASK-2

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(-10);
        numbers.add(-78);
        numbers.add(0);
        numbers.add(15);


        System.out.println(removeNegatives(numbers));



        //TASK-3

        System.out.println(validatePassword("")); // false
        System.out.println(validatePassword("abcd")); //false
        System.out.println(validatePassword("abcd1234")); //false
        System.out.println(validatePassword("Abcd1234")); //false
        System.out.println(validatePassword("Abcd123!")); //true

        //TASK-4

        System.out.println(validateEmailAddress("a@gmail.com"));// false
        System.out.println(validateEmailAddress("abc@g.com")); //false
        System.out.println(validateEmailAddress("abc@gmail.c")); //false
        System.out.println(validateEmailAddress("abc@@gmail.com")); //false
        System.out.println(validateEmailAddress("abcd@gmail.com")); //true




    }
}