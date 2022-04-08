package operators.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Please enter your balance:");
        double balance = enter.nextDouble();

        System.out.println("Please enter your first transaction");
        double firstTran = enter.nextDouble();

        balance -= firstTran; // balance has changed
        System.out.println("Balance after 1st transaction =" + balance);

        System.out.println("Please enter your second transaction");
        double secondTran = enter.nextDouble();
        balance -= secondTran; // balance has changed
        System.out.println(" Balance after second transaction = " + balance);

        System.out.println("Please enter your third transaction");
        double thirdTran = enter.nextDouble();
        balance -=thirdTran;
        System.out.println("Balance after third transaction = " + balance);





    }
}
