package collectionsFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_find_second_greatest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        //second greatest = 5
        //second smallest = 5

        //TreeSet -> [3, 5, 7]

        TreeSet<Integer> uniques = new TreeSet<>(numbers);
        System.out.println(uniques); // [1, 3, 5, 7, 10]
        // TREE SET DOES NOT HAVE GET() METHOD SO CONVERT IT BACK TO ARRAYLIST TO GET SECOND LARGEST

        ArrayList<Integer> uniquesList = new ArrayList<>(uniques);
        System.out.println(uniquesList.get(uniquesList.size()-2)); // SECOND GREATEST = 7
        System.out.println(uniquesList.get(1)); //SECOND SMALLEST = 3
    }
}
