package javaMemoryManagement;

public class ReverseExercise {
    /*
    Write a method that takes a String and returns it revered
     */
    // loop logic
    public static String reverse1 (String s){
        String r = "";
        for (int i = s.length() -1; i >= 0; i--){
            r += s.charAt(i);
        }
        return r;
    }
    // another loop logic
    public static String reverse2 (String str) {
        StringBuilder r = new StringBuilder();
        for (int i = str.length()-1 ; i >= 0; i--)
            r.reverse();
            return r.toString(); // return takes string but will not return StringBuilder so we convert it to string with toString method


    }
        // better way
    public static String reverse3 (String str2){
     return new StringBuilder(str2).reverse().toString();
    }
    /*
    Write a method for palindrome
    if it is palindrome return true
    if not return false
     */
        public static boolean isPalindrome(String s){
            return s.equals(new StringBuilder(s).reverse().toString());
        }



    public static void main(String[] args) {

        String s = "Hi there!";

        System.out.println(reverse1(s));
        System.out.println(reverse2(s));

        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("civic")); // true
        System.out.println(isPalindrome("deniz")); // false
    }
}
