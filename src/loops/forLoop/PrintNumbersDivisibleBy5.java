package loops.forLoop;

public class PrintNumbersDivisibleBy5 {
    public static void main(String[] args) {

        /*
        print numbers between 1 and 50 which can be divided by 5
         */

        for (int i = 1; i <= 50; i++){
            if (i % 5 == 0) System.out.println(i);

        }

    }
}
