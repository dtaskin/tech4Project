package operators.arithmeticOperators;

public class Division {
    public static void main(String[] args){

        double num1 = 15;
        double num2 = 3;
        int num3 = 4;
        int num4 = 10;

        double divide = num1 / num2;
        double divideByInt = num1 / num3;
        double divideByDouble = num4 /num2;
        System.out.println("num1 / num2 = " + (num1 / num2));   // double / double
        System.out.println("num1 / num3 = " + divideByInt);     // double / int
        System.out.println("num4 / num2 = " + divideByDouble);  //int /double


    }
}
