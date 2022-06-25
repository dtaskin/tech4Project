package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    //=========== TASK-1 ===========//
    public static Map<Integer, String> parseData(String str) {
        String[] arr = str.replaceAll("[{}]", " ").trim().split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            map.put(Integer.parseInt(arr[i]), arr[i + 1]);
            i++;


        }
        return map;
    }

    //=========== TASK-2 ===========//

    public static double calculateTotalPrice1(Map<String, Integer> map) {
        Map<String, Double> list = new HashMap<>();
        list.put("Apple", 2.00);
        list.put("Orange", 3.29);
        list.put("Mango", 4.99);
        list.put("Pineapple", 5.25);

        double result= 0.00;

        for (String m : map.keySet()) {
            result += map.get(m) * list.get(m);
        }
        return result;
    }

    //=========== TASK-3 ===========//
    public static double calculateTotalPrice2(Map<String , Integer> quantity){
        Map<String, Double> price = new HashMap<>();
        price.put("Apple", 2.00);
        price.put("Orange", 3.29);
        price.put("Mango", 4.99);
        price.put("Pineapple", 5.25);

        double result= 0.00;
        if(quantity.get("Mango") >= 3) quantity.put("Mango", quantity.get("Mango") - (quantity.get("Mango") / 3));
        for (String s : quantity.keySet()) {
            if (s.equals("Apple")) {
                if (quantity.get("Apple") % 2 == 1) result += (quantity.get("Apple") - 1) * 1.5 + 2;
                else result += quantity.get("Apple") * 1.5;
            }
            else result += price.get(s) * quantity.get(s);
        }
        return result;
    }







    public static void main(String[] args) {
        System.out.println("\n//=========== TASK-1 ===========//\n");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n//=========== TASK-2 ===========//\n");

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map));


        System.out.println("\n//=========== TASK-3 ===========//\n");

        Map<String, Integer> quantities = new HashMap<>();
        quantities.put("Apple", 4);
        quantities.put("Mango", 8);
        quantities.put("Orange", 3);
        System.out.println(calculateTotalPrice2(quantities));
    }
}
