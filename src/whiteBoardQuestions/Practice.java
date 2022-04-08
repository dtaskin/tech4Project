package whiteBoardQuestions;

public class Practice {
    public static void main(String[] args) {

        // fibonacci 10 numbers from fibonacci
        /*
        1.Store the number
        2.
         */
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        String s = "";

        for (int i = 0; i < 10; i++){ // 0, 1, 2, 3 ... 9
            // store num
            s += n1 + " - ";
            // get the third
            n3 = n1 + n2;
            // change n1 and n2 for the next time
            n1 = n2;
            n2 = n3;
        }
        System.out.println(s.substring(0,s.length()-3));


        // finding max and second max from an array

        int[] nums = {4, 5, 64, 345, 36, 74, 32};

        /*
        1. 2 containers for max and second max
        2. find the amx with loop
        3. find the second max with loop(if it is not the max and bigger than the rest it is second max)
         */

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) if (max < num) max = num; //
        for (int num : nums) if(num != max && secondMax < num) secondMax = num;
        System.out.println(max);
        System.out.println(secondMax);

        // palindrome

        String word = "civic";
        String rword = "";

        for (int i = word.length()-1; i >= 0; i--){ // 4, 3, 2, 1, 0
            rword += word.charAt(i) + "";

        }
        System.out.println(rword.equals(word));

        // fizzbuzz --> 4 conditions (1 to 16 both included)
        // both by 3 and 5 it is "fizzbuzz"
        // by 3 it is "buzz"
        // by 5 it is "fizz'
        // by NONE it is number itself

        for (int i = 1; i < 17; i++) {
            if (i % 15 == 0) System.out.println("Fizzbuzz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else if (i % 3 == 0) System.out.println("Buzz");
            else System.out.println(i);

        }








    }
}
