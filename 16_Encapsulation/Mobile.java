class Mobile {

    private String brand;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Mobile obj = new Mobile();

        obj.setBrand("Samsung");
        obj.setPrice(25000);

        System.out.println("Brand = " + obj.getBrand());
        System.out.println("Price = " + obj.getPrice());
    }
}