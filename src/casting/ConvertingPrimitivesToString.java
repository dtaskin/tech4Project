package casting;

public class ConvertingPrimitivesToString {
    public static void main(String[] args) {
         /*  1.int x = 56;
              int y = 34;
              String str = y + x + ""; --> 90
                    also
              String str = "" + x + y; --> 5634

             2.String.valueOf() --> String str = String.valueOf(x + y)
                also
             String str = String.valueOf(x) + y ;
        */
        int num =36;
        // + (concatenation)
        // valueOf() method
        String numStr1 = String.valueOf(num);
        String numStr2 = num + "" + 45; // concatenation
        System.out.println("numStr1" + numStr1);
        System.out.println("numStr2" + numStr2);



    }
}
