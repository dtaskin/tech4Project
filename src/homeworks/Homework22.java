package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework22 {
    //=========== TASK-1==========//
    public static void fibonacciSeries(int n){
       int[] arr = new int[n];

       arr[0] = 0;
       arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

    //=========== TASK-2==========//

    public static int fibonacciSeries2(int n){
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }

    //=========== TASK-3==========//
    public static int[] findUniques(int[] n1, int[] n2){
        List<Integer> temp = new ArrayList<>();
        if(n1.length == 0 && n2.length == 0) {
            return n1;
        }else
            for (int i : n1) {
                if (!temp.contains(i)) temp.add((Integer) i);
            }
            for (int j : n2) {
                if (!temp.contains(j)) temp.add((Integer) j);
            }
            int[] arr = new int[temp.size()];
            for (int i = 0; i < temp.size(); i++) {
                arr[i] = temp.get(i);
            }
        return arr;
    }



    // TEST METHOD
    public static void main(String[] args) {
        System.out.println("=========== TASK-1==========");
        fibonacciSeries(3);
        fibonacciSeries(5);
        fibonacciSeries(7);

        System.out.println("=========== TASK-2==========");

        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(7));

        System.out.println("=========== TASK-3==========");
        int[] a = new int[0];
        int[] b = new int[] {1,2,3,2};
        System.out.println(findUniques(a,b));

    }
}
