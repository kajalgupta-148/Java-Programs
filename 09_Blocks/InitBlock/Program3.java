class Program3 {

    String accountHolder;
    int accountNumber;
    double balance;

    {
        System.out.println("Bank Account Initialization Started");
        balance = 1000;
    }

    Program3(String name, int number, double amount) {
        accountHolder = name;
        accountNumber = number;
        balance = balance + amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayAccount() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance       : " + balance);
    }

    public static void main(String[] args) {

        Program3 account = new Program3("Kajal", 10101, 5000);

        account.displayAccount();
        account.deposit(2000);
        account.withdraw(1500);
        account.displayAccount();
    }
}