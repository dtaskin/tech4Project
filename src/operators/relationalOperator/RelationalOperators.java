package operators.relationalOperator;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a == b;     // a is equal to b
        boolean isANotEqualToB = a != b;  // a is not equal to b


        System.out.println("a = b : " + isAEqualToB);  //false
        System.out.println("a = b : " + isANotEqualToB);  //true

        boolean isAGreaterThanB = a > b;
        boolean isASmallerThanB = a < b;
        boolean isAGreaterOrEqualThanB = a >= b;
        boolean isASmallerOrEqualThanB = a <= b;

        System.out.println("a > b : " + isAGreaterThanB);           //false
        System.out.println("a < b : " + isASmallerThanB);           //true
        System.out.println("a >= b : " + isAGreaterOrEqualThanB);   //false
        System.out.println("a <= b : " + isAGreaterOrEqualThanB);   //true



        int x = 3;
        int y = 5;
        int z = 9;

        boolean bool = x + y == --z;
        System.out.println("Naim's question : " + bool);




    }
}
