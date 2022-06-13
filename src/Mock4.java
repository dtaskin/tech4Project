import java.util.HashMap;

public class Mock4 {
    /*
    Requirement:
    -Student is responsible to create a main method and test their method.
    -Write a method that takes an array of String and returns the count of each unique element in the array as a Map
    Test Data:
    [“Apple”, “Apple”, “Orange”, “Apple”, “Kiwi”]
    Expected:
     {Apple=3, Orange=1, Kiwi=1}
     */
    public static HashMap<String,Integer> uniques (String[]str){
        HashMap<String, Integer> newMap = new HashMap<>();
        for (String s : str) {
            if(!newMap.containsKey(s)) newMap.put(s,1);
            else newMap.put(s, newMap.get(s) +1);
        }
        return newMap;
    }

    public static void main(String[] args) {
        String[] str = {"Apple", "Apple", "Orange", "Apple", "Kiwi"};
        System.out.println(uniques(str));
    }
}
