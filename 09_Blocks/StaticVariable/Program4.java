class Program4 {

    static String shopName = "Smart Electronics";
    static int totalProducts = 0;

    String productName;
    double price;
    int quantity;

    Program4(String name, double productPrice, int productQuantity) {

        productName = name;
        price = productPrice;
        quantity = productQuantity;

        totalProducts++;
    }

    double calculateValue() {
        return price * quantity;
    }

    void displayProduct() {

        System.out.println("\n----- Product Details -----");
        System.out.println("Shop     : " + shopName);
        System.out.println("Product  : " + productName);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Value    : " + calculateValue());
    }

    static void displayTotalProducts() {

        System.out.println("\nTotal Product Types = " + totalProducts);
    }

    public static void main(String[] args) {

        Program4 product1 =
                new Program4("Laptop", 55000, 2);

        Program4 product2 =
                new Program4("Keyboard", 1500, 5);

        Program4 product3 =
                new Program4("Mouse", 800, 10);

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();

        displayTotalProducts();
    }
}