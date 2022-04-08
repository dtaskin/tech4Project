package stringMethods;

public class _09_trim {
    public static void main(String[] args) {
        /*
           Method Task: it is used to remove whitespaces form both ends of a String
           -It is non-static, and we can call with object name
           =It is return, and it returns a string
           -It doesn't take any arguments
           NOTE: trim() method will not remove any extra spaces between the words.
           it only removes extra spaces before and after the first and last chars in the String

         */
         String str = "     Hello      ";
        System.out.println(str);//        hello
        System.out.println(str.length());  // 16 counts the spaces
        System.out.println(str.trim()); // Hello
        System.out.println(str.trim().length()); // 5 does not count spaces at beginning and end only

        String str2 = "     Good       Morning        ";
        String str3 = str2.trim();

        System.out.println(str3);  // Good      Morning


    }
}
