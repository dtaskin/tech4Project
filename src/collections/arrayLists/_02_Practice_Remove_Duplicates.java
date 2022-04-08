package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {

        /*
        TASK-1
        Find unique elements in this and print them

        RESULT:
        [Cup, Book, Pen, Pencil]
         */



        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        List<String> uniques = new ArrayList<>(); // // this is a container to hold all the elements that is unique(notDup)

        for (String object : objects) {
            if (!uniques.contains(object)) uniques.add(object); /// here is checking if the container doesn't(!) contain the element of current iteration then add it
        }
        System.out.println(uniques); // when and if the condition is true add the element to the container

    }
}

