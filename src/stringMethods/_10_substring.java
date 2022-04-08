package stringMethods;

public class _10_substring {
    public static void main(String[] args) {
        /*
        Method Task:They are used to extract a substring from a larger String
        -They are non-static, and we call them with objects
        - They are return type, and they return another String
        -There are 2 overloaded substring methods
            1. substring(int beginIndex)
                -This method takes begin index as an argument, and
             it extracts a substring starting from given index to the end
            2. substring(int beginIndex, int endIndex)
                -This method takes 2 args to define which index to start and which index to stop extract a substring
               NOTE: beginIndex is inclusive but endIndex is exclusive
               NOTE: if your beginIndex is equal to endIndex, it will not return anything (empty)
               NOTE: if your beginIndex is less than endIndex, it will throw StringIndexOutOfBoundException
         */
        String result = "About 3,520,000,000 results (0.82 seconds)";

        String num = result.substring(6, 19);

        System.out.println(num); // 3,520,000,000


        // use substring method to get "(0.82 seconds)"

        String result1 = "About 3,520,000,000 results (0.82 seconds)";

        String num1 = result1.substring(28);
//        String num1 = result1.substring(28, 42);
//        String num1 = result1.substring(28, result1.length());
        System.out.println(num1);
        System.out.println("\n----- BE CREATIVE-----\n");
        System.out.println(result1.substring(result1.indexOf('(')));
        System.out.println(result1.substring(result1.lastIndexOf('0')-1));
        System.out.println(result1.substring(result1.length()-14));


        String name = "Lionel";

        System.out.println(name.substring(3,1)); // StringIndexOutOfBoundException
        System.out.println(name.substring(3,3)); // nothing(empty)
        System.out.println(name.substring(3,4)); // 'n'







    }
}
