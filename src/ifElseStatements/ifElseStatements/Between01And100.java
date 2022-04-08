package ifElseStatements.ifElseStatements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Between01And100 {
    public static void main(String[] args) {
        /*
        write a program asks user to put number and checks if the number
        is between 0 and 100

        if it is true print out " It is in between 0 and 100"

        else "It is not in between 0 and 100"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scan.nextInt();

//        boolean isNumBiggerThan0 = num >= 0;
//        boolean isNumSmallerThan100 = num <= 100;
//
//        boolean inBetween0And100 = num >= 0 && num <= 100;

        if(num >= 0 && num <= 100){
            System.out.println("It is in between 0 and 100");
        }else
            System.out.println("It is not in between 0 and 100");

    }
}
