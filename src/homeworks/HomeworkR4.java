package homeworks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HomeworkR4 {
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
        List<String> list = new ArrayList<>();
        for(String string : strings){
            if(!string.toLowerCase().startsWith("a"))
                list.add(string);
            else list.add("###");
        }
        return new String[]{list.toString()};

    }



    public static void main(String[] args){
        String[] str = {"appium", "hello", "123", "xyz","apple", "ABC"};
        System.out.println(Arrays.toString(noA(str)));







        System.out.println("End of the program!");
    }
}
