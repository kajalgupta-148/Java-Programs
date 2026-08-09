class BankAccount {

    String name;
    double balance;

    BankAccount(String n, double b) {
        name = n;
        balance = b;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Kajal", 25000);
        b1.display();
    }
}