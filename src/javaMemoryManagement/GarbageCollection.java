package javaMemoryManagement;

public class GarbageCollection {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println("\n-------Object references before losing reference------\n");
        System.out.println(dog1); // Dog@1540e19d
        System.out.println(dog2); // Dog@677327b6
        System.out.println(dog1.equals(dog2)); // false

        System.out.println("\n-------Object references after losing reference------\n");
        dog1 = dog2; // dog1 id losing reference here and garbage collected

        // Explicitly doing Garbage Collection
        System.gc();
        Runtime.getRuntime().gc();

        System.out.println(dog1); // Dog@677327b6 same location
        System.out.println(dog2); // Dog@677327b6 same location
        System.out.println(dog1.equals(dog2)); // true


    }
}
