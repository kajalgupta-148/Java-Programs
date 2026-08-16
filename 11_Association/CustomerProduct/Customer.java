class Product {

    void displayProduct() {
        System.out.println("Product is available.");
    }

    void buyProduct() {
        System.out.println("Product purchased successfully.");
    }
}

class Customer {

    public static void main(String[] args) {

        Product obj = new Product();

        obj.displayProduct();
        obj.buyProduct();
    }
}