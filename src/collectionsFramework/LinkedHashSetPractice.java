package collectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("foo");
        words.add("BAR");
        words.add(null);
        words.add(null); // NO DUPLICATED ALLOWED
        words.add("John");
        words.add("John"); // NO DUPLICATES ALLOWED

        System.out.println(words); //[Foo, Bar, foo, BAR, null, John] //KEEPS THE INSERTION ORDER

    }
}
