package learningObjects;

public class LearningStrings {

    public static void main(String[] args){
        //DateType variableName = value

        //only declare
        //assign

        //create a String variable and assign "Hello"

        String greetings; // declaration
        greetings = "Hello"; //assignment


        //declare and assign

        String myGreetings = "Hello";

        System.out.println(greetings + myGreetings);

        String myName = "Deniz";
        String myLastName = "Taskin";
        String fullName = "Deniz Taskin";
        String fullName1 = myName + " " + myLastName;
        String fullName2 = myName.concat(" " + myLastName);


        System.out.println(myName +" "+ myLastName);
        System.out.println("Deniz" + " " +"Taskin");
        System.out.println(fullName);
        System.out.println(fullName1);
        System.out.println(fullName2);







    }
}
