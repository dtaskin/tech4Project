package homeworks;

import java.util.*;

public class Homework22 {
    //=========== TASK-1==========//
    public static int[] fibonacciSeries(int n) {

        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;

    }
    public static int[] fibonacciSeries1Abe(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 0;
        int[] newArr = new int[n];
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = n1;
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        return newArr;
    }

    //=========== TASK-2==========//

    public static int fibonacciSeries2(int n) {
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }
    public static int fibonacciSeries2Way2(int n) {
        // 0 1 1 2 3 5
        int n0 = 0, n1 = 1, n2 = 1;
        for (int i = 1; i < n - 1; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n2;
    }

    public static int fibonacciSeries2Recursion(int n) {
        if (n <= 1) return n;
        return fibonacciSeries2Recursion(n - 1) + fibonacciSeries2Recursion(n - 2);
    }

    //=========== TASK-3==========//

    public static int[] findUniques(int[] a1, int[] a2) {
        List<Integer> allElements = new ArrayList<>();
        for (int i : a1) {
            allElements.add(i);
        }
        for (int i : a2) {
            allElements.add(i);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);

        Set<Integer> uniquesSet = new LinkedHashSet<>(allElements);
        uniquesSet.removeIf(element -> Arrays.binarySearch(a1, element) >= 0 && Arrays.binarySearch(a2, element) >= 0);

        List<Integer> uniquesList = new ArrayList<>(uniquesSet);

        int[] uniques = new int[uniquesList.size()];
        for (int i = 0; i < uniquesList.size(); i++) {
            uniques[i] = uniquesList.get(i);

        }
        return uniques;

    }

    public static int[] findUniques2(int[] a, int[] b) {

        Set<Integer> duplicates = new HashSet<>();
        for (int first : a) {
            for (int second : b) {
                if (first == second) duplicates.add(first);
            }
        }

        Set<Integer> nonDuplicates = new HashSet<>();

        for (int i : a) if (!duplicates.contains(i)) nonDuplicates.add(i);
        for (int i : b) if (!duplicates.contains(i)) nonDuplicates.add(i);

//        int[] nonDupArr = new int[nonDuplicates.size()];
//        int index = 0;
//        for (Integer nonDuplicate : nonDuplicates) nonDupArr[index++] = nonDuplicate;

//        int[] nonDupArr = nonDuplicates.stream().mapToInt(i->i).toArray();
// OR
//        int[] nonDupArr = list.stream().mapToInt(Integer::intValue).toArray();

        return nonDuplicates.stream().mapToInt(i -> i).toArray();
    }

    //=========== TASK-4==========//

    public static boolean isPowerOf3(int number) {
        /*
        if(number == 1 || number % 3 == 0) return true;
        return false;
         */
        return number == 1 || number % 3 == 0;
    }

    public static boolean isPowerOf3a(int number){
        // 27.0
        // 27 / 3 = 9
        // 9 / 3 = 3
        // 3 / 3 = 1.0

        // 15
        // 15 / 3 = 5
        // 5 / 3 = 1
        if (number < 1 ) return false;
        double doubleNum = number;
        while (doubleNum % 3 == 0){
            doubleNum /= 3;
        }
        return doubleNum == 1.0;
    }


    //=========== TASK-5==========//

    public static int firstDuplicate(int[] arr) {
        if (arr.length <= 1) return -1;
        else {
            List<Integer> list = new ArrayList<>();
            for (Integer a : arr) {
                list.add(a);
            }
            List<Integer> duplicates = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                for (int j = 1; j < list.size(); j++) {
                    if (list.get(i) == list.get(j))
                        duplicates.add(list.get(i));
                }
                Collections.sort(duplicates);
            }
            return duplicates.get(duplicates.size() - 1);
        }
    }

    public static int firstDuplicate2(int[] nums){
        int[] dup = {-1, Integer.MAX_VALUE};

        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j] && j - i < dup[1]){
                    dup[1] = j - i;
                    dup[0] = nums[i];
                }
        return dup[0];
    }

    public static void main(String[] args) {
        System.out.println("=========== TASK-1==========");
        System.out.println(Arrays.toString(fibonacciSeries(7)));

        System.out.println("=========== TASK-2==========");

        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(7));

        System.out.println("=========== TASK-3==========");

        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{})));
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\n=========== TASK-4==========\n");

        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));

        System.out.println("\n=========== TASK-4==========\n");

        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{}));

    }
}
