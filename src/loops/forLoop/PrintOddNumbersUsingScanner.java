package loops.forLoop;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        /*
        find odd numbers 0 to given by user and print

         */

        int num = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= num; i++){
            if (MathHelper.isOdd(i)) System.out.println(i);
        }
//                  SECOND WAY
//        for(int i = 0; i <= num; i++){
//        if(i % 2 == 1) System.out.println(i)}
    }
}
