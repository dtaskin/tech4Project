package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    /*
    Generate a random number between 17 and 33(both included)
    Print "the number is generated is EVEN" if the number is even
    Print "the number is generated is ODD" if the number is odd
     */
    public static void main(String[] args) {

        int r1 = RandomNumberGenerator.getRandomNumber(17, 33);
        System.out.println(r1);
       if (MathHelper.isEven(r1)){
           System.out.println("The number is generated is EVEN");
       }else {
           System.out.println("The number is generated is ODD");
       }

//        if (r1 % 2 == 0){
//            System.out.println("The number is generated is EVEN");
//        }else {
//            System.out.println("The number is generated is ODD");
//        }


    }


}

