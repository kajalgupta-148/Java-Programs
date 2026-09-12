
class BalanceException extends Exception {

    BalanceException(String message) {
        super(message);
    }
}

public class CustomException2 {

    static void withdraw(double balance, double amount)
            throws BalanceException {

        if (amount > balance) {
            throw new BalanceException("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);
        } 
        catch (BalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}