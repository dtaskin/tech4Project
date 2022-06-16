package WhiteBoardQuestions;

import java.util.Arrays;

public class _02_Sort_List_Of_Strings {

    public static void showList(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
    }


    public static void main(String[] args){

        String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "aug", "Sep", "Oct", "nov", "Dec" };

        // Display input un-sorted list.
        System.out.println("-------Input List-------\n");
        showList(inputList);

        // Call to sort the input list.
        Arrays.sort(inputList);

        // Display the sorted list.
        System.out.println("\n-------Sorted List-------\n");
        showList(inputList);

        // Call to sort the input list in case-sensitive order.
        System.out.println("\n-------Sorted list (Case-Sensitive)-------\n");
        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(inputList);

        // Display the sorted list.
        showList(inputList);
    }




}
