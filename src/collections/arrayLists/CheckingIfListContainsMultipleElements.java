package collections.arrayLists;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class CheckingIfListContainsMultipleElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);

        /*
        Print true if List has 5
         */

        System.out.println(numbers.contains(5));


        /*
        Print true if the List has 20 and 30 as elements
        false otherwise
         */

        System.out.println(numbers.contains(20) && numbers.contains(30)); // false

        /*
        Print true if the list has 30, 35, 40, 45, 50 as elements
        false otherwise
         */
        List<Integer> elementsToBeChecked = new ArrayList<>();
        elementsToBeChecked.add(30);
        elementsToBeChecked.add(35);
        elementsToBeChecked.add(40);
        elementsToBeChecked.add(45);
        elementsToBeChecked.add(50);

        System.out.println(numbers.containsAll(elementsToBeChecked)); // below is the same thing
//        System.out.println((numbers.contains(30) && numbers.contains(35)
//                            && numbers.contains(40) && numbers.contains(45)
//                            && numbers.contains(50)));


    }
}
