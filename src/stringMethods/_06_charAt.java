package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {
        /*
        Method Task: It helps to get a character at a specific index
        NOTE: Index starts with zero
        -It is non-static as we call it with an object name
        -It is a return type and returns char primitive
        -It takes an argument which is int (index)
        NOTE: It will throw StringIndexOutOfBoundException when the given index is not in the bounds
         */
        String name = "John";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

//        System.out.println(name.charAt(-1)); // -1 //StringIndexoutOfBoundException
//        System.out.println(name.charAt(4)); // 4 //StringIndexoutOfBoundException

        String name1 = "Alex";
        /*
        Check if the name starts with a and print "this name starts with A"
        print"this name is not starting with "A" otherwise
         */

        char firstChar = name1.charAt(0);
        if (firstChar == 'A' || firstChar == 'a'){
            System.out.println("This name starts with A");
        }
        else {
            System.out.println("This name is not starting with A");
        }

    }
}
