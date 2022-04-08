package stringMethods;

public class _08_length {
    public static void main(String[] args) {
        /*
        Method Task: Count the total number of the characters in a String, and return it as an int
        -It is non-static method and can be called with object name
        -It is a return type method, and it returns an int (total number of characters)
        -It doesn't take any arguments
        NOTE: Counting starts at 1. NOT 0 like charAT()
         */
        String city = "Chicago";

        System.out.println(city.length()); // 7
        System.out.println(city.length() + 3); //10
        String company = "TechGlobal";
        int size = company.length(); //10

        System.out.println(size); // 10


    }
}
