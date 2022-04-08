package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args){
        System.out.println("\n-------TASK-1-------\n");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n-------TASK-2-------\n");

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-------TASK-3-------\n");

        List<Integer> numbers1 = new ArrayList<>();

        numbers1.add(23);
        numbers1.add(-34);
        numbers1.add(-56);
        numbers1.add(0);
        numbers1.add(89);
        numbers1.add(100);

        System.out.println(numbers1);
        Collections.sort(numbers1);
        System.out.println(numbers1);

        System.out.println("\n-------TASK-4-------\n");

        List<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n-------TASK-5-------\n");

        List<String> marvels = new ArrayList<>();
        marvels.add("Spider Man");
        marvels.add("Iron Man");
        marvels.add("Black Panther");
        marvels.add("Deadpool");
        marvels.add("Captain America");

        System.out.println(marvels);

        boolean isWolwerineHere = false;
        for(String marvel : marvels){
            if(marvel.equals("Wolwerine"))
                isWolwerineHere = true;
            break;
        }
        System.out.println(isWolwerineHere);

        System.out.println("\n-------TASK-6-------\n");

        List<String> avengers = new ArrayList<>();

        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");

        Collections.sort(avengers);
        System.out.println(avengers);

        boolean isHulkHere = false;
        boolean isIronManHere = false;
        for (String avenger : avengers) {
            if(avenger.equalsIgnoreCase("Hulk"))
                isHulkHere = true;
            else if (avenger.equalsIgnoreCase("Iron Man"))
                isIronManHere = true;
        }
        System.out.println(isHulkHere && isIronManHere);

        System.out.println("\n-------TASK-7-------\n");

        List<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('x');
        characters.add('$');
        characters.add('%');
        characters.add('9');
        characters.add('*');
        characters.add('+');
        characters.add('F');
        characters.add('G');

        System.out.println(characters);

        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));

        }

        System.out.println("\n-------TASK-8-------\n");

        List<String> objects = new ArrayList<>();

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");

        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countAE = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) countM++;
            if ((object.contains("a") || object.contains("e"))) countAE++;

        }
        System.out.println(countM);
        System.out.println(countAE);

        System.out.println("\n-------TASK-9-------\n");

        List<String> kitchenObjects = new ArrayList<>();

        kitchenObjects.add("Plate");
        kitchenObjects.add("spoon");
        kitchenObjects.add("fork");
        kitchenObjects.add("Knife");
        kitchenObjects.add("cup");
        kitchenObjects.add("Mixer");

        int startsWithUppercase = 0;
        int startsWithLowercase = 0;
        int elementsWithP = 0;
        int startsOrEndsWithP = 0;

        System.out.println(kitchenObjects);

        for (String kitchenObject : kitchenObjects) {
            if (Character.isUpperCase(kitchenObject.charAt(0)))startsWithUppercase++;
            if (Character.isLowerCase(kitchenObject.charAt(0)))startsWithLowercase++;
            if (kitchenObject.toLowerCase().contains("p")) elementsWithP++;
            if (kitchenObject.toLowerCase().startsWith("p") || kitchenObject.toLowerCase().endsWith("p")) startsOrEndsWithP++;
        }

        System.out.println("Elements starts with uppercase = " + startsWithUppercase);
        System.out.println("Elements starts with lowercase = " + startsWithLowercase);
        System.out.println("Elements having P or p = " + elementsWithP);
        System.out.println("Elements starting or ending with P or p = " + startsOrEndsWithP);

        System.out.println("\n-------TASK-10-------\n");

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(7);
        numbers2.add(10);
        numbers2.add(0);
        numbers2.add(20);
        numbers2.add(17);
        numbers2.add(10);
        numbers2.add(23);
        numbers2.add(56);
        numbers2.add(78);

        System.out.println(numbers2);

        int canBeDividedBy10 = 0;
        int evenNumbersGreaterThan15 = 0;
        int oddNumbersLessThan20 = 0;
        int lessThan15orGreaterThan50 = 0;

        for (Integer number : numbers2) {
            if (number % 10 == 0) canBeDividedBy10++;
            if (number % 2 == 0 && number > 15) evenNumbersGreaterThan15++;
            if (number < 20  && number % 2 == 1) oddNumbersLessThan20++;
            if (number < 15 || number > 50)lessThan15orGreaterThan50++;
        }
        System.out.println("Elements that can be divided by 10 = " + canBeDividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + evenNumbersGreaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + oddNumbersLessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + lessThan15orGreaterThan50);







        }
    }
