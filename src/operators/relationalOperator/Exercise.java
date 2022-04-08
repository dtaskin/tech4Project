package operators.relationalOperator;

public class Exercise {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 10;

        boolean b1 = y < z;             //false
        boolean b2 = x <= y;            //true
        boolean b3 = x >= z;            //true
        boolean b4 = y > z;             //true
        boolean b5 = x >= y;            //false
       // boolean b6 = (x >= z) < y;      //

        System.out.println("Is y lesser than z " + b1);
        System.out.println("Is x lesser or equal than z " + b2);
        System.out.println("Is x greater or equal than z " + b3);
        System.out.println("Is y greater than z " + b4);
        System.out.println("Is x lesser or equal than y " + b5);
       // System.out.println("Is x lesser or equal than z " + b6);



    }
}
