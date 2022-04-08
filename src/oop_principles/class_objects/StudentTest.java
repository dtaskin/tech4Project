package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        // create a student
        System.out.println("\n-------TASK-1-------\n");

        Student student1 = new Student();
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "male";
        student1.address = "Chicago";
        student1.weight = 170.5;
        student1.height = 5.7;
        student1.email = "johndoe@gmail.com";
        student1.id = 1001;

        System.out.println(student1); //Student{firstName='John', lastName='Doe', age=45, dateOfBirth='01/01/1977', gender='male', address='Chicago', height=5.7, weight=170.5, email='johndoe@gmail.com', id=1001}

        System.out.println("\n-------TASK-2-------\n");


        // Create another student

        Student student2 = new Student();
        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gmail.com";
        student2.id = 1002;

        System.out.println(student2); //Student{firstName='Lionel', lastName='Messi', age=34, dateOfBirth='01/01/1988', gender='male', address='Paris', height=4.9, weight=150.0, email='lionel@gmail.com', id=1002}

        /*
        Create 3 more Student object with below information
        firstName = Alex, Jessie, Kaly
        lastName = Morgan, Smith, Ngo
        age = 20, 15, 16;
        dateOfBirth = 01/01/2002 - 01/01/2007 - 01/01/2006
        gender = male, female, female
        address = Chicago, Miami, Berlin
        weight = 165, 160, 150
        height = 5.5, 5.7, 5.3
        email = alex@gmail.com, jessie@gmail.com, kaly@gmail.com
        id = 1003, 1004, 1005

        Then, print the objects

         */

        Student student3 = new Student();
        student3.firstName = "Jessie";
        student3.lastName = "Smith";
        student3.age = 15;
        student3.dateOfBirth = "01/01/2007";
        student3.gender = "female";
        student3.address = "Miami";
        student3.height = 5.7;
        student3.email = "jessie@gmail.com";
        student3.id = 1004;

        Student student4 = new Student();
        student4.firstName = "Kaly";
        student4.lastName = "Ngo";
        student4.age =16;
        student4.dateOfBirth = "01/01/2006";
        student4.gender = "female";
        student4.address = "Berlin";
        student4.weight = 165;
        student4.height = 5.3;
        student4.email = "kaly@gmail.com";
        student4.id = 1005;

        Student student5 = new Student();
        student5.firstName = "Alex";
        student5.lastName = "Morgan";
        student5.age = 20;
        student5.dateOfBirth = "01/01/2002";
        student5.gender = "male";
        student5.address = "Chicago";
        student5.weight = 165;
        student5.height = 5.5;
        student5.email = "alex@gmail.com";
        student5.id = 1003;

        System.out.println("\n-------TASK-3-------\n");
        // how many student from chicago

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int count = 0;
            for (Student student : students) {
                if (student.address.equalsIgnoreCase("Chicago"))
                    count++;
            }
            System.out.println("There are " + count + " students from Chicago"); //There are 3 students from Chicago

        System.out.println("\n-------TASK-4-------\n");

        // count how many students and male and female

        int male = 0;
        int female = 0;

        for (Student student : students) {
            if(student.gender.equalsIgnoreCase("male")) male++;
            else female++;
        }
        System.out.println("There are " + male + " male students");
        System.out.println("There are " + female + " female students");

        System.out.println("\n-------TASK-5-------\n");

        int teen = 0;
        for (Student student : students) {
            if (student.age >= 13 && student.age <= 19) teen++;
        }
        System.out.println("There are " + teen + " teenager students");

        System.out.println("\n-------TASK-6-------\n");

        //Print all information of each student in separate lines

        for (Student student : students) {
            System.out.println(student.firstName);
            System.out.println(student.lastName);
            System.out.println(student.age);
            System.out.println(student.dateOfBirth);
            System.out.println(student.gender);
            System.out.println(student.address);
            System.out.println(student.weight);
            System.out.println(student.height);
            System.out.println(student.email);
            System.out.println(student.id);
        }
//            another way of for each loop
//            students.forEach(student -> {
//            System.out.println(student.firstName);
//            System.out.println(student.lastName);
//            System.out.println(student.age);
//            System.out.println(student.dateOfBirth);
//            System.out.println(student.gender);
//            System.out.println(student.address);
//            System.out.println(student.weight);
//            System.out.println(student.height);
//            System.out.println(student.email);
//            System.out.println(student.id);
//            System.out.println();
//        });










    }
}
