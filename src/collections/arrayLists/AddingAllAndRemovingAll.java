package collections.arrayLists;

import java.util.ArrayList;

public class AddingAllAndRemovingAll {
    public static void main(String[] args){
        /*
        TASK-1
        Create an ArrayList of germanCars and add below items
        BMW
        Mercedes
        Volkswagen

        Then print the list

        RESULT:
        [BMW, Mercedes, Volkswagen]

         */
        System.out.println("\n-------TASK-1-------\n");
        ArrayList<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars = " + germanCars);

        /*
        TASK-2

        Create an ArrayList of Japanese cars and add below items
        Honda
        Toyota
        Lexus

        Then print the list
         */
        System.out.println("\n-------TASK-2-------\n");
        ArrayList<String> japaneseCars = new ArrayList<>();
        japaneseCars.add("Honda");
        japaneseCars.add("Toyota");
        japaneseCars.add("Lexus");

        System.out.println("Japanese cars = " + japaneseCars);

        System.out.println("\n-------TASK-3-------\n");
        /*
        TASK-3
        Create an ArrayList of luxuryCars and store below cars
        Maserati
        Tesla
        Range Rover
        Jaguar

        Then print the list

        RESULT:
        Luxury cars = [Maserati, Tesla, Range Rover, Jaguar]
         */
        ArrayList<String> luxuryCars = new ArrayList<>();
        luxuryCars.add("Maserati");
        luxuryCars.add("Tesla");
        luxuryCars.add("Range Rover");
        luxuryCars.add("Jaguar");

        System.out.println("Luxury cars = " + luxuryCars);

        System.out.println("\n-------Put all together-------\n");

        ArrayList<String> inventory = new ArrayList<>();
        System.out.println("Inventory at the beginning = " + inventory); // []
        // Adding German Cars
        inventory.addAll(germanCars);
        System.out.println("Inventory after adding German cars = " + inventory); //[BMW, Mercedes, Volkswagen]
        // Adding Japanese cars
        inventory.addAll(japaneseCars);
        System.out.println("Inventory after adding Japanese cars = " + inventory);//[BMW, Mercedes, Volkswagen, Honda, Toyota, Lexus]
        // adding luxury cars
        inventory.addAll(1,luxuryCars); // index adds to the index and shifts to the left
        System.out.println("Inventory after adding luxury cars = " + inventory);//[BMW, (ADDED LUXURY CARS TO INDEX(1)Maserati, Tesla, Range Rover, Jaguar, Mercedes, Volkswagen, Honda, Toyota, Lexus]

        /*
        Remove Tesla, Audi and BMW
         */

        inventory.remove("Audi");
        inventory.remove("BMW");
        inventory.remove("Tesla");
        System.out.println("Inventory after removing = " + inventory); //[Maserati, Range Rover, Jaguar, Mercedes, Volkswagen, Honda, Toyota, Lexus]

    }
}
