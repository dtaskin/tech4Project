package loops.nestedLoops;

public class Practice01 {
    public static void main(String[] args) {
        /*
        outer loop 1 to 3 increment
        inner loop 5 to 3 decrement
         */

        for (int i = 1; i <=3; i++){
            System.out.println(i);
            for (int j = 5; j >= 3; j--){
                System.out.println("\t" + j);
            }
        }


    }
}
