package scanner;

import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {

        Scanner survey = new Scanner(System.in);


        System.out.println("What is your name?");
        String name =survey.nextLine();
        System.out.println("How old are you?");
        String age = survey.next();
        System.out.println("Are you male or female?");
        String sex = survey.next();
        System.out.println("Where do you live?");
        survey.nextLine();
        String address = survey.nextLine();
        System.out.println("What is your phone number?");
        String phoneNumber = survey.nextLine();
        System.out.println("What is your father's full name?");
        String fathersFullName = survey.nextLine();

        System.out.println(name + " is a " + age + " years old male who lives in " + address + "." +
                "His phone number is " + phoneNumber +"." + "His father's full name is " + fathersFullName +".");


    }
}
