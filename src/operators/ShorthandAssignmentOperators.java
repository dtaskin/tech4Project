package operators;

public class ShorthandAssignmentOperators {
    public static void main(String[] args) {

        int johnsAge = 5;

        // Please find the age of John for % years later

//        int johnsAge5YearsLater = johnsAge + 5;
//        johnsAge = johnsAge + 5;

        johnsAge += 5;

        System.out.println(johnsAge);
    }
}
