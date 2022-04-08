package projects;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import utilities.MathHelper;
import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Project05 {
    public static void main(String[]args) {
//        System.out.println("-------TASK-1-------\n");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a String:");
//        String str = input.nextLine();
//
//        if (str.length() >= 8){
//            String s1 = str.substring(0, 4);
//            String s2 = str.substring(4, str.length() - 4);
//            String s3 = str.substring(str.length() - 4);
//            System.out.println(s3 + s2 + s1);
//        }else{
//            System.out.println("This String does not have 8 characters");
//        }
//
//
//        System.out.println("\n-------TASK-2-------\n");
//
//        String s4 = ScannerHelper.getAStringFromUser();
//
//        if (s4.trim().contains(" ")) {
//            // if(s4.trim().indexOf(' ') >= 0){}  GOOD OTHER WAY
//
//            String s5 = s4.substring(0, s4.indexOf(' '));
//            String s6 = s4.substring(s4.indexOf(' '), s4.lastIndexOf(' ') + 1);
//            String s7 = s4.substring(s4.lastIndexOf(' ') + 1);
//
//            System.out.println(s7 + s6 + s5);
//        }else
//            System.out.println("This sentence does not have 2 or more words to swap");
//
//        System.out.println("\n-------TASK-3-------\n");
//
//        String str2 = ScannerHelper.getAStringFromUser();
//        System.out.println(str2.replace("stupid","nice").replace("idiot","nice"));
//
//        System.out.println("\n-------TASK-4-------\n");
//
//        String str4 = ScannerHelper.getANameFromUser();
//
//       if (str4.length() > 2 ){
//           if (MathHelper.isOdd(str4.length())){
//               System.out.println(str4.charAt(str4.length()/2));
//           }else System.out.println("" + str4.charAt(str4.length()/2-1) + (str4.charAt(str4.length()/2)));
//       }else System.out.println("Invalid input!!!");
//
//        System.out.println("\n-------TASK-5-------\n");
//
//        String str5 = ScannerHelper.getAStringFromUser();
//
//        if (str5.length() > 5){
//            System.out.println(str5.substring(2, str5.length()-2));
//        }else System.out.println("Invalid input!!!");
//
//        System.out.println("\n-------TASK-6-------\n");
//
//        System.out.println(ScannerHelper.getAStringFromUser().replace('a','*').replace('A','*')
//                .replace('e','#').replace('E','#')
//                .replace('i','+').replace('I','+')
//                .replace('u','$').replace('U','$')
//                .replace('o','@').replace('O','@'));

        System.out.println("\n-------TASK-7-------\n");

        int randomNumber1 = RandomNumberGenerator.getRandomNumber(0,25);
        int randomNumber2 = RandomNumberGenerator.getRandomNumber(0,25);

        String s = "";

        if (randomNumber1>randomNumber2){
            for (int i = randomNumber2; i < randomNumber1; i++){
                if (i % 5 != 0) s += i + " - ";
            }
        }else {
            for (int i = randomNumber1; i < randomNumber2; i++){
                if (i % 5 != 0) s += i + " - ";

            }
        }

        if(!s.isEmpty()) System.out.println(s.substring(0, s.length()-3));
        else System.out.println(s);

//                String s = "";
//
//                for(int i = Math.min(randomNumber1, randomNumber2); i <= Math.max(randomNumber1, randomNumber2); i++){
//                    if(i % 5 != 0) s += i + " - ";
//                }
//
//                if(!s.isEmpty()) System.out.println(s.substring(0, s.length()-3));
//                else System.out.println(s);










    }
}
