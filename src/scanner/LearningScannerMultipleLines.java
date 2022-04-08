package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args){

        // DataType variableName = data/value
        //DataType/ClassName variableName = new DataType/ClassName(if needed);
        // creating an object
        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your address?");
        String userAddress = inputReader.nextLine(); //objectName.methodName();

        System.out.println("User address is = ".concat(userAddress));






    }
}
