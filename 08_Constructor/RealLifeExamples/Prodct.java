class Prodct {

    String prodctName;
    int price;

    Prodct(String p, int pr) {
        prodctName = p;
        price = pr;
    }

    void display() {
        System.out.println("Product : " + prodctName);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Prodct p1 = new Prodct("Smart Watch", 3500);
        p1.display();
    }
}