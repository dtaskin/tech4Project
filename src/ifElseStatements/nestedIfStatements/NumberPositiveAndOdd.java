package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {

     int num =(int) (Math.random() * -101) + 50;
        System.out.println(num);
     if (num > 0){ //checking the number is positive or not
        // the number is positive here so check it again inside here
         if (num % 2 != 0){ //checking the number if It's odd or not
             System.out.println("The number is positive and Odd");
         }else {
             System.out.println("The number is positive and Even");
         }

     }else {  //checking the number is negative
         System.out.println("Number is Negative");
     }


    }

}
