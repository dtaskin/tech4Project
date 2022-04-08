package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        //FORMULA = Math.random() * (endPoint - startPoint + 1) + startPoint
        // ex; (int) (Math.random() * 16 + 15);
        double random = Math.random();   //0.0 --- 0.9999

        System.out.println(random);


        int random0AndIncluded = (int) (Math.random()* 21); //between 0 and 20
        System.out.println(random0AndIncluded);

        int randomBetween10And20Included = (int) (Math.random() * 11) + 10;  // between 10 and 20

        System.out.println(randomBetween10And20Included);

        //create a random number between 103 -346 included take that as an int
        // get the difference first ---> 346 - 103 = 243 add +1
        // multiply it bby 243 + 1 = 244
        // add the starting point to the equation
        // random * ( end point - start point + 1 ) + start point ---. included

        int randomBetween103And346Included = (int) (Math.random() * 244) + 103;
        // int randomBetween103And346Included = 103 + (int) (Math.random() * 244);


        System.out.println(randomBetween103And346Included);









    }
}
