package savings.com;

import static savings.com.SavingsAccount.modifyInterestRate;

public class Main {

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(12, 123);
        SavingsAccount acc2 = new SavingsAccount(7, 8319.12);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        System.out.println(acc1.isGreater(acc2));

        modifyInterestRate(11);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        acc1.calculateMonthlyInterest();

        System.out.println(acc1.toString());



    }
}
