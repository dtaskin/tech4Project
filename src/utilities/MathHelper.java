package utilities;

public class MathHelper {

    //Create a method that takes 3 ints and returns the max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

        // method overloading
        public static double maxOfThree(double num1, double num2, double num3){
        return Math.max(num1, Math.max(num2, num3));

    }
    //Create a method that takes 3 byte numbers as arguments and returns the smallest

    public static byte minOfThree(byte b1, byte b2, byte b3){
        return (byte)Math.min(Math.min(b1, b2), b3);
    }

    /*Create a method that takes an itn as an argument and returns true if its even, returns false if it is odd
    return type
    isEven
    static
    public
    */
      public static boolean isEven(int number){
          return number % 2 ==0; //it is boolean, so it will return true if the statement is true, if not it returns false
      }

      // Create a method called isOdd() that takes one int parameter and returns true if the number is odd,
    // false otherwise

    public static boolean isOdd(int number){
          return number % 2 != 0;
    }
// create a method that take an int as an argument and returns if the number is positive
    // if the number is positive, it will return true
    // otherwise, it will return false

    public static boolean isPositive(int number){
          return number > 0;
    }
// create another method called isNegative

    public static boolean isNegative(int number){
          return number < 0;
    }

    // create another method called isZero

    public static boolean isZero(int number) {
        return number == 0;
      }











}
