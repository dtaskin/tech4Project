package mathClass;

import java.sql.SQLOutput;

public class FindMax {

    public static void main(String[] args) {

        //Finds the largest number of the given numbers'

        int x = 8;
        int y = 20;
        int z = 12_345;
        int a = 34;
        int b = 123;

        int maxValueOfXY = Math.max(x, y);  //char xan be put as well bc it has a binary value
        int maxValueOfXYZ = Math.max(maxValueOfXY, z);
        int maxValueOfAB = Math.max(a,b);
        int maxOfEvery = Math.max(Math.max(maxValueOfXY, z), maxValueOfAB);

        System.out.println("maxValueOfXY " + maxValueOfXY);
        System.out.println("maxValueOfXYZ " + maxValueOfXYZ);
        System.out.println("maxValueOfAB " + maxValueOfAB);
        System.out.println("MaxOfEvery " + maxOfEvery);


        int[] sample_list = {1,2,3,4,5,6};
        int sum = 0;

        for (int i = 0; i < sample_list.length; i++) {
            sum += sample_list[i];
        }
        System.out.println(sum);

        int[] sum_list = new int[6];
        for (int i = 0; i < sample_list.length; i++) {
//            sum_list *= sum;
        }





    }
}
