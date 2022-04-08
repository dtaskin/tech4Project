package utilities;

public class MyMethods {
    // Write a method which is going to find the max of 4 numbers and prints it out ONLY

    public static void maxOf4(int i1, int i2, int i3, int i4){
        System.out.println(Math.max(Math.max(Math.max(i1, i2), i3), i4));
    }
    public static int maxOf4Return(int i1, int i2, int i3, int i4){
        return Math.max(Math.max(Math.max(i1, i2), i3), i4);


    }
}
