class Product {
    int id;
    String name;
    double price;

    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.id = 1;
        p.name = "Laptop";
        p.price = 55000;

        p.display();
    }
}