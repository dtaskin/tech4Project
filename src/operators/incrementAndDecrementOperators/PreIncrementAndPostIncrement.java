package operators.incrementAndDecrementOperators;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {

        int a = 10;

//        a = a + 1;
//        a += 1;
//        a++; // a = 10 + 1
//        ++a; // a = 11 + 1

        System.out.println(a++); // --> 10 (waiting until you call it next time)
        System.out.println(a);  // --> 11
        System.out.println(++a);  // --> 11 (assigning immediately)


    }
}
