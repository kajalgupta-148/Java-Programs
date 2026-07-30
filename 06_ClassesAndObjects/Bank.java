class Bank {
    String accountHolder;
    double balance;

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.accountHolder = "Kajal";
        b.balance = 5000;

        b.showBalance();
    }
}