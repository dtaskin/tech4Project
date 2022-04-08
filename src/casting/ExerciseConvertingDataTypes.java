package casting;

public class ExerciseConvertingDataTypes {

    public static void main(String[] args) {
        /*
        Write a program which will take two number as a STRING and get the avg of them and print it out.

        Input:
        String num1= "23"; // cannot contain any letters or words only numbers
        String num2= "25";

        Output:
        24

         */
        String num1= "23";
        String num2= "25";
       int num1Int = Integer.parseInt(num1);  // 1st way  String --> int
       int num2Int = Integer.parseInt(num2);

       Integer num1Integer = Integer.valueOf(num1); // 2nd way  String --> Integer
       Integer num2Integer = Integer.valueOf(num2); // String --> int --> Integer  done by java automatically



        System.out.println("average of the numbers is " + (num1Int + num2Int)/2);
        System.out.println("average with Integer of the numbers is " + (num1Int + num2Int)/2);

        /*



        */

        String save = "390";
        String day = "15.60";

        double saveDouble = Double.parseDouble(save);
        double dayDouble = Double.parseDouble(day);

        System.out.println("How many days later = " + saveDouble/dayDouble);








    }
}
