package homeworks;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework18 {
    // --------TASK 1------- //

    public static String noSpace(String str){
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isSpaceChar(str.charAt(i)))
                continue;
            s += str.charAt(i);
        }
        return s;
    }
    /*  NO SPACE WITH REGEX
    public static String noSpaceRegex(String str){
        return str.replaceAll(" ","");
    }
     */

    // ------- TASK 2------- //

    public static String replaceFirstLast(String str){
        if(str.trim().length() < 2){
            return "";
        }
        String s = "";
        for(int i = 0; i < str.length(); i++){
            s = str.trim().charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
        return s;
    }

    // ------- TASK 3 ------- //

    public static boolean hasVoWel(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.toLowerCase().contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")){
                return true;
            }

        }   return false;
    }

    // ------- TASK 4 ------- //

    public static void checkAge(int age){
        Date date = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(sdt.format(date));

        if(((currentYear - age) > 100 || currentYear < age )) System.out.println("AGE IS NOT VALID");
        else if((currentYear - age) >= 16) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT ALLOWED");
    }

    // ------- TASK 5 ------- //

    public static int averageOfEdges(int a, int b, int c){
        return (Math.max(Math.max(a,b),c) + Math.min(Math.min(a,b),c)) / 2;
    }

    // ------- TASK 6 ------- //

    public static String[] noA(String[] strings){
        String[] str = new String[strings.length];
        for(int i = 0; i < strings.length; i++){
            if(strings[i].toLowerCase().startsWith("a"))
                str[i] = "###";
            else str[i] = strings[i];
        }
        return str;
        }

    // ------- TASK 7 ------- //

    public static int[] no3or5(int[] numbers){
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 15 == 0) arr[i] = 101;
            else if(numbers[i] % 5 == 0) arr[i] = 99;
            else if(numbers[i] % 3 == 0) arr[i] = 100;
            else arr[i] = numbers[i];
        }
        return arr;
    }

    // ------- TASK 8 ------- //

    public static int countPrimes(int[] numbers){
        int count = 0;
        for(int number : numbers){
            if(number == 2 || number == 3) count++;
            else if(number > 3){
                boolean prime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {


        System.out.println("End of the program!");
    }
}
