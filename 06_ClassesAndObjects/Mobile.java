class Mobile {
    String company;
    int price;

    void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.company = "Samsung";
        m.price = 25000;

        m.display();
    }
}