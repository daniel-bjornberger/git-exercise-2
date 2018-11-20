package exercise;

public class TestSavingsAccount {

    public static void main(String[] args) {


        SavingsAccount savingsAccount = new SavingsAccount(100.0);

        System.out.println("Before withdrawal: " + savingsAccount);
        System.out.println("Withdraw 50.00:");

        try {
            savingsAccount.withdraw(50.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Couldn't withdraw: " + e.getMessage());
        }

        System.out.println("After withdrawal: " + savingsAccount);
        System.out.println("Withdraw 50.01:");

        try {
            savingsAccount.withdraw(50.01);
        } catch (InsufficientBalanceException e) {
            System.out.println("Couldn't withdraw: " + e.getMessage());
        }


        System.out.println("Creating account with a negative amount:");

        try {
            SavingsAccount savingsAccount2 = new SavingsAccount(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Deposit of a negative amount:");

        try {
            savingsAccount.deposit(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Withdrawal of a negative amount:");

        try {
            savingsAccount.withdraw(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Final state: " + savingsAccount);


    }

}
