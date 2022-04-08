package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args) {


        int a = 8;
        int b = 3;

        a += b;  //--> 11
        a -= b;  //--> 5
        a *=b;   //--> 56
        a /=b;   //--> 2
        a %=b;   //--> 3

        System.out.println("a += b -> " + (a +=b)); // --> a = 11
        System.out.println("a -= b -> " + (a -=b)); // --> a = 8
        System.out.println("a *= b -> " + (a *=b)); // --> a = 24
        System.out.println("a /= b -> " + (a /=b)); // --> a = 8
        System.out.println("a %= b -> " + (a %=b)); // --> a = 2 remaining value after division
        // a value keep changing after every calculation!



    }
}
