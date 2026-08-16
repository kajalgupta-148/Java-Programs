class Bank {

    void savingAccount() {
        System.out.println("Saving Account Created");
    }

    void currentAccount() {
        System.out.println("Current Account Created");
    }
}

class Customer {

    public static void main(String[] args) {

        Bank obj = new Bank();

        obj.savingAccount();
        obj.currentAccount();
    }
}