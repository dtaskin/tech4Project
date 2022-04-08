package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        /*
        even numbers to 10

         */
        for (int i = 0; i<= 10; i++){
            if (MathHelper.isEven(i)) System.out.println(i);
        }

        for (int i1 = 0; i1<=10; i1++){
            System.out.println(i1++);
        }

        for (int i2 = 0; i2 <= 10; i2++){
            if(i2 % 2 == 0) System.out.println(i2);
        }
//        System.out.println("\n-------3rd-way--------\n");
//        for(int i = 0; i <= 10; i += 2){ // be careful with start point
//            System.out.println(i);

    }
}
