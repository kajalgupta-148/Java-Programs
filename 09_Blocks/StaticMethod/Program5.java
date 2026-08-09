class Program5 {

    static double calculateBill(int units) {

        double bill;

        if (units <= 100) {
            bill = units * 2.50;
        } else if (units <= 200) {
            bill = (100 * 2.50) + ((units - 100) * 4.00);
        } else {
            bill = (100 * 2.50)
                    + (100 * 4.00)
                    + ((units - 200) * 6.00);
        }

        return bill;
    }

    static double calculateTax(double bill) {
        return bill * 0.05;
    }

    static void displayBill(String customer, int units) {

        double bill = calculateBill(units);
        double tax = calculateTax(bill);
        double finalBill = bill + tax;

        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Customer     : " + customer);
        System.out.println("Units Used   : " + units);
        System.out.println("Bill Amount  : " + bill);
        System.out.println("Tax          : " + tax);
        System.out.println("Final Amount : " + finalBill);
    }

    public static void main(String[] args) {

        displayBill("Kajal", 150);
        displayBill("Amit", 250);
    }
}