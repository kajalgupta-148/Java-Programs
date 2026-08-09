class SimpleInterest {

    double principal;
    double rate;
    double time;

    SimpleInterest(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    void calculateInterest() {
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {

        SimpleInterest s1 =
            new SimpleInterest(10000, 5, 2);

        s1.calculateInterest();
    }
}