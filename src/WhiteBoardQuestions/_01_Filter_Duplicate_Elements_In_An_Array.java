package WhiteBoardQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _01_Filter_Duplicate_Elements_In_An_Array {

    public static Set<String> removeDuplicates(List<String> listContainingDuplicates) {

        /*
        Here we create two HashSets. Since Set does not allow duplicates, we can easily
         */

        Set<String> resultSet = new HashSet<String>();
        Set<String> tempSet = new HashSet<String>();

        for (String yourInt : listContainingDuplicates) {
            if (!tempSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        // Form a list of numbers from 0-9.
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        // Insert a new set of numbers from 0-5.
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Input list : " + list);
        System.out.println("\nFiltered duplicates : " + removeDuplicates(list));
    }
}
