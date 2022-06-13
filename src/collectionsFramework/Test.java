package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static HashMap<String, Integer> countUniques(String[] str){
        HashMap<String, Integer> uniques = new HashMap<>();
        for (String s : str) {
            if (!uniques.containsKey(s)) uniques.put(s, 1);
            else uniques.put(s, uniques.get(s) + 1);
        }
        return uniques;
    }

    public static void main(String[] args) {

        System.out.println(countUniques(new String[] {"Apple", "Apple", "Orange", "Apple", "Kiwi"}));
    }
}

