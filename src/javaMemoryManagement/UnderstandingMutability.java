package javaMemoryManagement;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago";
        String address = "Chicago";

        // On heap there is a String pool and "Chicago" is stored there

        System.out.println(city == address); // true - not proper way use .equals instead
        System.out.println(city.equals(address)); // true and proper way

        city = "Miami";

        // Java creates another object in String pool called Miami and reference city to Miami
        System.out.println(city); // Miami
        System.out.println(address); // Chicago


    }
}
