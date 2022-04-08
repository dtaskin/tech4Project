package stringMethods;

public class _14_isEmpty {
    public static void main(String[] args) {
        /*
        Method Task: It is used to check if  given string is empty or not
        -It is non-static, and we call it with an object
        -It is a return type, and it returns boolean
        -It does not take an argument

         */

        String name = "John";

        System.out.println(name.isEmpty()); //false
        System.out.println(name.replace(name,"").isEmpty()); //true
        System.out.println("Hello".toLowerCase().replace("hello", "").isEmpty()); // true


    }
}
