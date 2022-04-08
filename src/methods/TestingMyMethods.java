package methods;

import utilities.CharacterHelper;
import utilities.MyMethods;

import javax.swing.text.Utilities;

public class TestingMyMethods {
    public static void main(String[] args) {

        int num1 = 2, num2 = 6, num3 = 3, num4 = 9;

        char c1 = ' ', c2 = 'Z', c3 = 'E', c5 = '%', c6 = '0';

        // Write a program which is going to print the max of 4 number

        System.out.println(Math.max(Math.max(Math.max(num1 ,num2), num3), num4));

        // Using my method

        MyMethods.maxOf4(num1, num2, num3, num4);

        // using the return method
        System.out.println(MyMethods.maxOf4Return(num1, num2, num3, num4));

        System.out.println(CharacterHelper.isSpace(c2));
        System.out.println(CharacterHelper.isDigit(c6));
        System.out.println(CharacterHelper.isUppercase(c2));
        System.out.println(CharacterHelper.isLowercase(c3));
        System.out.println(CharacterHelper.isVowel(c3));
        System.out.println(CharacterHelper.isConsonant(c3));
        System.out.println(CharacterHelper.isLetter(c2));





    }
}
