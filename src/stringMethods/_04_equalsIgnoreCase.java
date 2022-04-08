package stringMethods;

public class _04_equalsIgnoreCase {
    public static void main(String[] args) {
        /*

         */

        System.out.println("Hello".equals("hello")); //false
        System.out.println("Hello".equalsIgnoreCase("hello")); // true
        System.out.println("Hello".equalsIgnoreCase(" hello")); // false

        String s1 = "Good";
        String s2 = "GOOD";

        boolean b = s1.equalsIgnoreCase(s1); //true
        System.out.println(b);

    }
}
