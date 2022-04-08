package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        /*
        First even = 0
        First odd = 5
         */

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;

        for (int number : numbers) {
            if(number % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                System.out.println("First Even = " + number);
            }
            else if(!isFirstOddFound){
                isFirstOddFound = true;
                System.out.println("First Odd = " + number);
            }

            if(isFirstEvenFound && isFirstOddFound) break;
        }

        if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");

        /*
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};


        System.out.println(Arrays.toString(numbers));


        int countEven = 0;
        int countOdd = 0;
        for (int number:numbers) {
            if (number % 2 == 0 && countEven == 0) {
                System.out.println("First even number is: " + number);
                countEven++;
            }
            else if (number % 2 == 1 && countOdd == 0){
        System.out.println("First odd number is: " + number);
        countOdd++;
    }
}
        package arrays;

        public class _09_Practice_Find_First_Even_Odd {
         public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        int even = -1, odd = 0;

        for (int number : numbers) {
            if (even == -1 && number % 2 == 0) even = number;
            else if (odd == 0 && number % 2 == 1) odd = number;
            else if (even % 2 == 0 && odd % 2 == 1) break;
        }
        System.out.println("First even is = " + even);
        System.out.println("First odd is = " + odd);
    }
}

         */



    }
}
