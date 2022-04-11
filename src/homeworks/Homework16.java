package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    //-------TASK-1-------//

    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.trim().length(); i++) {
            if(str.trim().charAt(i) == ' ')
                count++;
            }
        return count + 1;
        }

    //-------TASK-2-------//

    public static int countA(String str){
        int countA = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'a')
                countA++;
        }
        return countA;
    }
    //-------TASK-3-------//
    public static int countPos(ArrayList<Integer> numbers){
        int count = 0;
        for (Integer number : numbers) {
            if(number > 0) count++;
        }
        return count;
    }
    //-------TASK-4-------//

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer number : numbers) {
            if (!newList.contains(number)){
                newList.add(number);
            }
        }
        return newList;
    }

    //-------TASK-5-----//
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str){
        ArrayList<String> newList = new ArrayList<>();
        for (String s : str) {
            if(!newList.contains(s)){
                newList.add(s);
            }

        }
        return newList;
    }

    //-------TASK-6-------//

    public static String removeExtraSpaces(String str) {

        String s1 = "";

        String[] words = str.trim().split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> noExtraWhiteSpace = new ArrayList<>();
        for (String s : wordsList) {
            if (!s.equals("")) noExtraWhiteSpace.add(s);
        }
        for (String withoutExtraSpace : noExtraWhiteSpace) {
            s1 += withoutExtraSpace + " " ;

        }
        return s1;
        }
//        String name = str.trim().replaceAll("\\s+"," ");
//        return name;


    //-------TASK-7--------//

    public static String add(int[] a, int[] b){
        int[] c = new int[(int) Math.max(a.length, b.length)];
        for (int i = 0; i < c.length; i++){
            if (a.length > i){
                c[i] += a[i];
            }
            if (b.length > i){
                c[i] += b[i];
            }
        }
        return Arrays.toString(c);
    }

    //-------TASK-8-------//
    public static int findClosest(int[] arr) {
        int closest = 0;
        int distance = Math.abs(arr[0] - 10);

        for (int i = 1; i< arr.length; i++) {

            if (Math.abs(arr[i] - 10) < distance) {
                distance = Math.abs(arr[i] - 10);
                closest = arr[i];
            }else if ((Math.abs(arr[i]) - 10) == distance){
                if (closest > arr[i]) closest = arr[i];
            }
        }
        return arr[closest];
    }

    public static void main(String[] args) {

        int[] numbers = {10,-13,5,70,15,57};

        System.out.println(findClosest(numbers));
        }
    }