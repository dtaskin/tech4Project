package loops.forLoop;

public class FindSumOfNumbers {
    public static void main(String[] args) {
        /*

       add numbers 10 to 15  10+11+..+15
       expected
       75


         */
        int sum = 0; // create an empty container eventually have your answer
        for (int i = 10; i <= 15; i++ ){
            sum += i;
        }
        System.out.println(sum); // you have to put print statement out of curly braces to get 75
                                    // otherwise, it will print every step until 75

        int sum1 = 0;
        for (int i = 15; i <= 55; i++ ){
            sum1 += i;
        }
        System.out.println(sum1);




    }
}
