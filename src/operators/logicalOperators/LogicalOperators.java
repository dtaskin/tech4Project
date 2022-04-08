package operators.logicalOperators;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = true;
        boolean isJAvaHomeworkSent = false;

        //Send me InterviewQuestions OR JavaHomework

        System.out.println("The student is okay (OR): " +
                (isInterviewQuestionsSent || isJAvaHomeworkSent));

        // if there is a single TRUE for OR it is TRUE


        //Send me InterviewQuestions AND JavaHomework
        System.out.println("The student is okay (AND): " +
                (isInterviewQuestionsSent && isJAvaHomeworkSent));

        // if there is a single FALSE for AND it is FAlSE


        System.out.println("The student did send the homework " + !isInterviewQuestionsSent);



    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int number = scan.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
    }
        System.out.println(isPrime);




    }
}
