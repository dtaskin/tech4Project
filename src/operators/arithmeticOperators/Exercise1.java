package operators.arithmeticOperators;

public class Exercise1 {
    public static void main(String[] args){

        // create 2 int variables one larger than the other one
        // then do the 5 arithmetic operations for them

        int bigNum = 21;
        int smallNum = 4;

        int add = bigNum + smallNum;
        int sub = bigNum - smallNum;
        int multi = bigNum * smallNum;
        int div = bigNum / smallNum;
        int remain = bigNum % smallNum;

        System.out.println("addition is " + add);
        System.out.println("subtraction is " + sub);
        System.out.println("multiplication is " + multi);
        System.out.println("division is " + div);
        System.out.println("remainder is " + remain);
    }
}
