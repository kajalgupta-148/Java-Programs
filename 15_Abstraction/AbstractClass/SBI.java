abstract class Bank {

    abstract void rateOfInterest();

    void bankName() {
        System.out.println("Bank Account");
    }
}

class SBI extends Bank {

    void rateOfInterest() {
        System.out.println("Rate of Interest = 7%");
    }

    public static void main(String[] args) {

        SBI obj = new SBI();

        obj.bankName();
        obj.rateOfInterest();
    }
}