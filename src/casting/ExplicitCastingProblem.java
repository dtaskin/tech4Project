package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args) {

        int number = 150;
        byte b = (byte) number;
        System.out.println(b);  // byte value is between -128 to 127. So after 127,
        // java goes back to -128 and starts over. so this will be -106.





    }
}
