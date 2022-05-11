package homeworks;

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

    public static void main(String[] args){
        System.out.println(hasVoWel("ABC"));







        System.out.println("End of the program!");
    }
}
