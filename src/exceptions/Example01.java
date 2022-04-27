package exceptions;

public class Example01 {
    public static void main(String[] args){

        String[] names = {"Alex", "John", "Max"};

        try{
            System.out.println(names[-5]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
           exception.printStackTrace(); //      gives the exception on the console but still runs the code after this

        }

        System.out.println("End of the program!");
    }
}
