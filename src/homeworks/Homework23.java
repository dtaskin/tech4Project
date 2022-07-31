package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework23 {

    //=========== TASK-1 ===========//
    public static Map<Integer, String> parseData1a(String str) {
        String[] arr = str.replaceAll("[{}]", " ").trim().split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            map.put(Integer.parseInt(arr[i]), arr[i + 1]);
            i++;
        }
        return map;
    }

    //=======second way======//
    public static TreeMap<String, String> parseData1b(String data){
        /*
        {104}LA{101}Paris{102}Berlin{103}Chicago{100}London
        "", "104}LA", "101}Paris", "102}Berlin", "103}Chicago", "100}London"
         */

        TreeMap<String, String> parsedData = new TreeMap<>();
        for (String keyValue: data.split("\\{")) {
            if (!keyValue.isEmpty()) {
//                String key = keyValue.substring(0, keyValue.indexOf('}'));
//                String value = keyValue.substring(keyValue.indexOf('}') + 1);
                parsedData.put(
                        keyValue.substring(0, keyValue.indexOf('}')),
                        keyValue.substring(keyValue.indexOf('}') + 1)
                );
            }
        }
        return parsedData;
    }

    //=========== TASK-2 ===========//
    public static double calculateTotalPrice1a(Map<String, Integer> quantityOfItems){

        // quantityOfItems = {Apple=3, Mango = 1}
        /*
        Apple = $2.00
        Orange = $3.29
        Mango = $4.99
        Pineapple = $5.25
         */
        double totalPrice = 0;

        HashMap<String, String> pricesOfItems = new HashMap<>();
        pricesOfItems.put("Apple", "$2.00");
        pricesOfItems.put("Orange", "$3.29");
        pricesOfItems.put("Mango", "$4.99");
        pricesOfItems.put("Pineapple", "$5.25");

        for (String item :quantityOfItems.keySet()) {
//            Integer amountOfItem = quantityOfItems.get(item);
            totalPrice += Double.parseDouble(pricesOfItems.get(item).substring(1)) * quantityOfItems.get(item);
        }
        return totalPrice;
    }
        //======Second way======//
    public static double calculateTotalPrice1b(Map<String, Integer> map) {
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
        System.out.println(parseData1a("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("\n//=========== TASK-2 ===========//\n");

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Mango", 1);
        System.out.println(calculateTotalPrice1a(map));

        System.out.println("\n//=========== TASK-3 ===========//\n");

        Map<String, Integer> quantities = new HashMap<>();
        quantities.put("Apple", 4);
        quantities.put("Mango", 8);
        quantities.put("Orange", 3);
        System.out.println(calculateTotalPrice2(quantities));
    }
}
