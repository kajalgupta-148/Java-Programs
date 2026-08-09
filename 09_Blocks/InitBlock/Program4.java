class Program4 {

    String productName;
    double price;
    int quantity;
    double total;

    {
        System.out.println("Product Initialization Block Executed");
    }

    Program4(String name, double productPrice, int productQuantity) {
        productName = name;
        price = productPrice;
        quantity = productQuantity;

        total = price * quantity;
    }

    void displayBill() {
        System.out.println("\n----- Product Bill -----");
        System.out.println("Product  : " + productName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total    : " + total);
    }

    public static void main(String[] args) {

        Program4 product1 = new Program4("Laptop", 55000, 1);
        Program4 product2 = new Program4("Mouse", 800, 2);

        product1.displayBill();
        product2.displayBill();
    }
}