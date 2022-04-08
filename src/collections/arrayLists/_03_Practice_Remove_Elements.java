package collections.arrayLists;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */
        System.out.println("\n------TASK 1-------\n");
        languages.remove("Python");
        System.out.println(languages);

        System.out.println("\n------TASK 2-------\n");
        /*
        TASK-2
        Remove all elements that start with J

        RESULT:
        [C#, C++]
         */

        //Even though fori can be fixed by updating i when an element removed, it is still not preferred
        for (int i = 0; i < languages.size(); i++) {
            if (languages.get(i).startsWith("J")){
                languages.remove((languages.get(i)));
            }
        }
            // WAY TO SURVIVE
        List<String> elementsStartWithJ = new LinkedList<>();

        for (String language : languages){
            if (language.startsWith("J")) elementsStartWithJ.add(language);

        }
        languages.removeAll(elementsStartWithJ);
        System.out.println(languages);


      /*
        DO NOT USE FOR EACH LOOP

        List<String> startsWithJ = new ArrayList<>();
        for (String language : languages) { // ConcurrentModificationException DO NOT USE FOR EACH LOOP OR FORI LOOP
            if (language.startsWith("J")) languages.remove(language);
        }
        System.out.println(languages);
        */


        // BETTER WAY

        languages.removeIf(element -> element.startsWith("J"));
        System.out.println(languages);

        // USING ITERATOR

        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while (iterator.hasNext()) { //We are asking if there is an element in the queue
            String element = iterator.next();// this gets an element from th queue
            if (element.startsWith("J")) { // if element came form the queue starts with "J"
                iterator.remove(); // remove
            }
        }
        System.out.println(languages);
    }
}