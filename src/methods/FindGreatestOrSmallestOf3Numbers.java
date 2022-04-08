package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {

//         Math.max(5, 1, 11) //compile error

        int max = MathHelper.maxOfThree(5,1,10);

        System.out.println("Max of three numbers = " + max);

        double maxD = MathHelper.maxOfThree(1.1, 1.2, 1.3); //1.3
        System.out.println("Max of three numbers = " + maxD);

        byte b1 =(byte) (Math.random() * 10);
        byte b2 =(byte) (Math.random() * 10);
        byte b3 =(byte) (Math.random() * 10);

        byte minB = MathHelper.minOfThree(b1,b2,b3);
        System.out.println("Min of three numbers = " + minB);


    }

}
