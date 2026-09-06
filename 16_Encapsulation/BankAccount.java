class BankAccount {

    private int accountNo;
    private double balance;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount obj = new BankAccount();

        obj.setAccountNo(1001);
        obj.setBalance(50000);

        System.out.println("Account No = " + obj.getAccountNo());
        System.out.println("Balance = " + obj.getBalance());
    }
}