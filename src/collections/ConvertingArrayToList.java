package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        /*
        Create a List and store below data - countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Brasilia");
        countries.add("Argentina");
        countries.add("France");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Portugal");

        System.out.println(countries);

        //WAY-1 to convert Array to List(Arraylist or LinkedList)
        System.out.println("\n---------WAY-1 of converting Array to List-------\n");

        String[] countries3 = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries3));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries3));

        System.out.println(countries1);
        System.out.println(countries2);

        System.out.println("\n------WAY-2 of converting Array to List-------\n");

        List<String> countries4 = new ArrayList<>();
        List<String> countries5 = new ArrayList<>();

        Collections.addAll(countries4,countries3);
        Collections.addAll(countries5,countries3);

        System.out.println(countries4);//[USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
        System.out.println(countries5);//[USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]

        System.out.println("\n------WAY-3 of converting Array to List-------\n");

        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new ArrayList<>();

        for(int i : numbers){
            numbersList.add(i);
        }
        System.out.println(numbersList); // [1, 2, 3, 4, 5]

    }
}
