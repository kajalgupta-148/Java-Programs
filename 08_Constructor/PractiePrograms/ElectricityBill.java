class ElectricityBill {

    int units;
    int rate;

    ElectricityBill(int u, int r) {
        units = u;
        rate = r;
    }

    void calculateBill() {
        int bill = units * rate;
        System.out.println("Electricity Bill = " + bill);
    }

    public static void main(String[] args) {

        ElectricityBill e1 = new ElectricityBill(150, 6);
        e1.calculateBill();
    }
}