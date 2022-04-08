package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n-------TASK 1-------\n");

        int r1 = (int) (Math.random() * 50);
        System.out.println(r1);

        if (r1 >= 10 && r1 <=25)
            System.out.println("true");
            else System.out.println("false");

        System.out.println("\n-------TASK 2-------\n");
        int r2 = (int)(Math.random() * 100) + 1;

        if (r2 <= 25){
            System.out.println(r2 + " is in the 1st half");
            System.out.println(r2 + " is in the 1st quarter");
        }else if (r2 <= 50){
            System.out.println(r2 + " is in the 1st half");
            System.out.println(r2 + " is in the 2nd quarter");
        }else if (r2 <= 75) {
            System.out.println(r2 + " is in the 2nd half");
            System.out.println(r2 + " is in the 3rd quarter");
        }else {
            System.out.println(r2 + " is in the 2nd half");
            System.out.println(r2 + " is in the 4th quarter");
        }

        System.out.println("\n-------TASK 3-------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers between 1 and 10:");

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(),
                num4 = input.nextInt(), num5 = input.nextInt();
        if (num1 >= 1 && num1 <= 10) {
            num1 = (num1 * 5); //num1 *= 5
        } else num1 = 0;
        if (num2 >= 1 && num2 <= 10) {
            num2 = (num2 * 4); //num2 *= 4
        } else num2 = 0;
        if (num3 >= 1 && num3 <= 10) {
            num3 = (num3 * 3); //num3 *= 3
        } else num3 = 0;
        if (num4 >= 1 && num4 <= 10) {
            num4 = (num4 * 2); // num4 *= 2
        } else num4 = 0;
        if (num5 >= 1 && num5 <= 10) {
            num5 = (num5 * 1);
        } else num5 = 0;
        System.out.println(num1 + num2 + num3 + num4 + num5);


        System.out.println("End of the program!");
    }
}
