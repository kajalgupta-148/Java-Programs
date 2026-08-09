class Program3 {

    static String bankName = "State Bank of India";
    static String branch = "Lucknow";

    String accountHolder;
    long accountNumber;
    double balance;

    Program3(String name, long number, double amount) {

        accountHolder = name;
        accountNumber = number;
        balance = amount;
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {

        System.out.println("\n----- Bank Account -----");
        System.out.println("Bank          : " + bankName);
        System.out.println("Branch        : " + branch);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
    }

    public static void main(String[] args) {

        Program3 account1 =
                new Program3("Kajal", 10001, 15000);

        Program3 account2 =
                new Program3("Amit", 10002, 20000);

        account1.deposit(3000);
        account1.withdraw(2000);

        account2.deposit(5000);

        account1.displayAccount();
        account2.displayAccount();
    }
}