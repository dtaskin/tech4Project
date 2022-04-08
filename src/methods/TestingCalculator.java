package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args) {
        int i1 = 15, i2 = 2;

        int result = Calculator.divide(i1, i2); // returns an int

        System.out.println(result); // 7

        double d1 = 15, d2 = 2;

        double result2 = Calculator.divide(d1, d2); // returns a double

        System.out.println(result2); // 7.5

        Introduction.introduce("Wazwaz", "Engineer", 20, "Books");

        int max = Math.max(1, 2);

        double max2 = Math.max(15.2, 10);

        System.out.println(Math.max(15.2, 10)); // this method is a return type
        System.out.println(Calculator.divide(d1, d2)); // this method is also a return type

        //Create a method that finds the sum of 2 int numbers and returns it //ok
        //Create a method that finds the sum of 2 double numbers and returns it
        //Create a method that finds the absolute difference of 2 int numbers and returns it
        //Create a method that finds the absolute difference of 2 double numbers and returns it
        //Create a method that finds the product of 2 int numbers and returns it
        //Create a method that finds the product of 2 double numbers and returns it


        int int1 = 27, int2 = 32;
        double d4 = 2.35, d5 = 3.76;

        int result3 =Calculator.sumOf2Int(int1, int2);
        System.out.println(result3);

        double result4 = Calculator.sumOf2Double(d4, d5);
        System.out.println(result4);

        int result5 =Calculator.absOf2Int(int1, int2);
        System.out.println(result5);

        double result6 =Calculator.absOf2Double(d4, d5);
        System.out.println(result6);

        int result7 = Calculator.proOf2Int(int1, int2);
        System.out.println(result7);

        double result8 = Calculator.proOf2Double(d4, d5);
        System.out.println(result8);





    }

}
