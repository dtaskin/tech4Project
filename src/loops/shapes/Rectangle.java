package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
        /*
        create a rectangle using loop


         */

        for (int i = 1; i <= 8; i++){
            if (i == 1 || i == 8)
                System.out.println("* * * * * *");
            else {
                System.out.println("*         *");
            }
        }


    }
}
