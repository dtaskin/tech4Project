package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args) {

        double balance = 150;

        boolean isBalanceLessThan0 = balance < 0; // false
        boolean isBalanceEqualTo100 = balance == 100; //false
        boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000; //false
        boolean isBalanceNotEqual_1 = balance != -1; //true

        if (isBalanceLessThan0){ //if this is true execute otherwise skip
            System.out.println("Your balance is not equal to -1");
        }
        if (isBalanceEqualTo100) {
            System.out.println("Your balance is equal to 100");
        }
    }
}
