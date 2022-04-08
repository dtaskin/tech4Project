package ifElseStatements;

import java.util.Scanner;

public class FindGreatestOf2Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 =(int) (Math.random() * 11), num2 = (int)(Math.random()*11);

        System.out.println(num1);
        System.out.println(num2);

        if (num1 > num2){
            System.out.println("The greatest of " + num1 + " and " + num2 + " is " + num1);
        }
        else {
            System.out.println("The greatest of " + num1 + " and " + num2 + " is " + num2);
        }


        //SHORTCUT if else statement

        if (num1 > num2) System.out.println("The greatest of " + num1 + " and " + num2 + " is " + num1);
        else System.out.println("The greatest of " + num1 + " and " + num2 + " is " + num2);
        //you can only take out curly braces only with one condition. no additional ifs, elses or print outs






    }
}
