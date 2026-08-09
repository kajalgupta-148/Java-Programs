class Laptop {

    String brand;
    int price;

    Laptop(String b, int p) {
        brand = b;
        price = p;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 65000);
        l1.display();
    }
}