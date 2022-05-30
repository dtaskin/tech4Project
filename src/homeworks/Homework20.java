package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    //=============== TASK 1 ===============//
    public static boolean hasLowerCase(String str){
        for(int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i)))
                return true;
                break;
        }
        return false;
    }

    //=============== TASK 2 ===============//
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
//      numbers.removeIf(element -> element == 0);
//      return numbers;
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer number : numbers){
            if(number != 0) newList.add(number);
        }
        return newList;
    }

    //=============== TASK 3 ===============//
    public static int[][] numberAndSquare(int[] numbers){
        int[][] squared = new int[numbers.length][2];
        for(int i = 0; i < numbers.length; i++){
            squared[i][0] = numbers[i];
            squared[i][1] = numbers[i] * numbers[i];

        }
        return squared;
    }

    //=============== TASK 4 ===============//
    public static boolean containsValue(String[] arr, String str) {
        /*
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, str) >= 0;
         */
        for(String s : arr){
            if(s.equals(str))
                return true;
                break;
        }
        return false;
    }

    //=============== TASK 5 ===============//
    public static String reverseSentence(String str){
       String[] strings = str.split(" ");
       if(strings.length < 2) return "There is not enough space";
       else {
           strings[0] = (strings[0].charAt(0) + "").toLowerCase() + strings[0].substring(1);
           strings[strings.length -1] = (strings[strings.length - 1].charAt(0) + "").toUpperCase() + strings[strings.length - 1].substring(1);
           String reverse = "";
           for(int i = strings.length - 1; i >= 0; i--){
               reverse += strings[i] + " ";
           }
           return reverse.substring(0,reverse.length()-1);
       }
    }

    //=============== TASK 6 ===============//
    public static String removeStringSpecialsDigits(String str){
        /*
        String s = "";
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i)) &&
                    (Character.isLetter(str.charAt(i))) ||
                    Character.isWhitespace(str.charAt(i)))
                s += str.charAt(i);
        }
        return s;

         */
        return str.replaceAll("[^a-zA-Z ]", "");
    }

    //=============== TASK 7 ===============//
    public static String[] removeArraySpecialsDigits(String[] arr){
      for(int i = 0; i < arr.length; i++){
          arr[i] = arr[i].replaceAll("[^a-zA-Z ]","");
      }
      return arr;
    }

    //=============== TASK 8 ===============//
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> s1, ArrayList<String> s2){
        ArrayList<String> newArr = new ArrayList<>();
        for(int i = 0; i < s1.size(); i++){
            for(int j = 0; j < s2.size(); j++){
                if(!newArr.contains(s1.get(i)) && s1.get(i).equals(s2.get(j)))
                    newArr.add(s1.get(i));
            }
        }
        return newArr;
    }

    //=============== TASK 9 ===============//
    public static ArrayList<String> noXInVariables(ArrayList<String> str){
        ArrayList<String> newArr = new ArrayList<>();

        for (String s : str) {
            if(!s.toLowerCase().equals("x")){
                s = s.replaceAll("[xX]","");
                newArr.add(s);
            }
        }
        return newArr;
    }













    public static void main(String[] args) {

        System.out.println("\n---------TASK 1---------\n");

        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("\n---------TASK 2---------\n");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(0);
        nums.add(2);
        System.out.println(noZero(nums));

        System.out.println("\n---------TASK 3---------\n");
        int[] numbers = {1,2,3,7,9};
        System.out.println(Arrays.deepToString(numberAndSquare(numbers)));

        System.out.println("\n---------TASK 4---------\n");
        String[] str = {"abc", "foo", "java"};
        String s = "Abc";
        System.out.println(containsValue(str,s));

        System.out.println("\n---------TASK 5---------\n");
        String s2 = "TtThis is a sSentence";
        System.out.println(reverseSentence(s2));

        System.out.println("\n---------TASK 6---------\n");
        String s3 = "Selenium 123#$%Cypress";
        System.out.println(removeStringSpecialsDigits(s3));

        System.out.println("\n---------TASK 7---------\n");
        String[] strings = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(strings)));

        System.out.println("\n---------TASK 8---------\n");
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Java");
        str1.add("is");
        str1.add("fun");
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Java");
        str2.add("C#");
        str2.add("fun");
        System.out.println(removeAndReturnCommons(str1,str2));

        System.out.println("\n---------TASK 9---------\n");
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("xyz");
        newArr.add("X123");
        newArr.add("#$%");
        System.out.println(noXInVariables(newArr));



    }
}
