package collections;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
       String[] names = {"aaa", "bbb",null, "yyy","aaa", "ccc", "ddd","aaa","ccc","xxx", null, null};

        List<String> namesList = new ArrayList<>();

//        Collections.addAll(namesList,names);

        for (String name : names) {
//            if(!namesList.contains(name))
            namesList.add(name);
        }



        Set<String> mapList = new LinkedHashSet<>(namesList);

        System.out.println(mapList);

        int[] nums = {1,2,2,3,0,5,12,11,1};

        Set<Integer> numsList = new TreeSet<>();

        for (int num : nums) {
            numsList.add(num);
        }
        System.out.println(numsList);


        String[] arr = {"123&5ab","12nbs__=", "+_)(*&^%$12java"};
        String s = Arrays.toString(arr);
        System.out.println(s);
        char[] charArray = s.toCharArray();
        String numbers = "";
        String letters = "";
        String specials = "";

        for (char c : charArray) {
            if(Character.isLetter(c)) letters += c;
            else if(Character.isDigit(c)) numbers += c;
            else specials += c;
        }
        String[] list = {numbers,letters,specials};
        System.out.println(Arrays.toString(list));
    }
}
