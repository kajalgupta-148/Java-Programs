class Bank {

    void rateOfInterest() {
        System.out.println("General bank interest rate");
    }
}

class SBI extends Bank {

    void rateOfInterest() {
        System.out.println("SBI interest rate is 7%");
    }

    public static void main(String[] args) {

        Bank obj = new SBI();

        obj.rateOfInterest();
    }
}