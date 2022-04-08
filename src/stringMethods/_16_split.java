package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {

        String s = "Banana is nice";

        String[] sSplitFromSpace = s.split(" ");

        System.out.println(Arrays.toString(sSplitFromSpace)); // [Banana, is, nice]

        String[] sSplitFromI = s.split("i");

        System.out.println(Arrays.toString(sSplitFromI)); // [Banana , s n, ce]

        String[] sSplitFromA = s.split("a");

        System.out.println(Arrays.toString(sSplitFromA)); // [B, n, n,  is nice]
    }
}
