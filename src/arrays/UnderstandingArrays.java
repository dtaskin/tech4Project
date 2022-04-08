package arrays;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);

        /*
        The new way is to have multiple students information
         */

//        String studentsName = "Alex, Abe, Yakeen";
//        String ages = "20, 21, 22";

        // Can you print Abe's age only -> 21

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20, 21 ,22};
        char [] favCharacters = {'A', '%', 'G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAY
        System.out.println(names); //[Ljava.lang.String;@1540e19d - gives you the location in the memory

        System.out.println(Arrays.toString(names)); // [Alex, Abe, Yakeen]




        // HOW TO GET A SINGLE ELEMENT FROM ARRAY

        String nameAt1 = names[1];
        System.out.println(nameAt1); //Abe  //ALSO sout(nameAt1)
        System.out.println(names[0]); // Alex
//        System.out.println(names[5]); // ArrayIndexOutOFBoundsException


        // HOW TO UPDATE AND ELEMENT  -. Abe -> Abraham

        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); //[Alex, Abraham, Yakeen]



        // Alex's age is 20 and his favorite char is A. His balance is 5.6 and he likes Java is false
//
//        System.out.println(names[0] + " 's age is " + ages[0] + " and his favorite char is " + favCharacters[0] + "." );
//        System.out.println(names[1] + " 's age is " + ages[1] + " and his favorite char is " + favCharacters[1] + "." );
//        System.out.println(names[2] + " 's age is " + ages[2] + " and his favorite char is " + favCharacters[2] + "." );


        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + " 's age is " + ages[i] + " and his favorite char is " + favCharacters[i] + "." );

        }



    }
}
