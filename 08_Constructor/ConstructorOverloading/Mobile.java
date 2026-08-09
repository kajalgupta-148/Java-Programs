class Mobile {

    Mobile() {
        System.out.println("Default Mobile");
    }

    Mobile(String brand) {
        System.out.println("Brand: " + brand);
    }

    Mobile(String brand, int price) {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung");
        Mobile m3 = new Mobile("Samsung", 35000);
    }
}