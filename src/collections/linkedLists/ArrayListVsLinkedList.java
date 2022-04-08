package collections.linkedLists;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> numbers = new LinkedList<>();
        numbers.add(10.5);
        numbers.add(12.5);
        numbers.add(13.3);
        numbers.add(17.7);

        System.out.println(numbers); //[10.5, 12.5, 13.3, 17.7]

        System.out.println("\n--------Looping LinkedList------------\n");
        for(Double d : numbers){
            System.out.println(d);
        }

        System.out.println("\n----------Some Methods of LinkedList-----------\n");

        System.out.println(numbers.get(0));//10.5
        System.out.println(numbers.getFirst());//10.5
        System.out.println(numbers.getLast());//17.7

        System.out.println("\n----------Some Additional Methods of LinkedList-----------\n");
        System.out.println(numbers.peek()); // getFirst() 10.5
        System.out.println(numbers.peekFirst()); //10.5
        System.out.println(numbers.peekLast()); //getLast() 17.7

        System.out.println(numbers); //[10.5, 12.5, 13.3, 17.7]

        System.out.println("\n-----------------------\n");
        System.out.println(numbers.poll()); //10.5 retrieves the first element and removes it
        System.out.println(numbers.pollFirst()); // now 12.5 is the first number so it is removed

        System.out.println(numbers.pollLast());// 17.7 is removed
        System.out.println(numbers); //[13.3]

        System.out.println("\n-----------------------\n");
        numbers.push(5.7); //it's a void method and very similar to add() method.adds to the indexOf(0), first place
        numbers.push(8.9);
        System.out.println(numbers.pop()); // removes the first element
        System.out.println(numbers); //[5.7, 13.3]





    }
}
