class Product {

    private int id;
    private String name;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Product obj = new Product();

        obj.setId(101);
        obj.setName("Laptop");
        obj.setPrice(50000);

        System.out.println("Product ID = " + obj.getId());
        System.out.println("Product Name = " + obj.getName());
        System.out.println("Price = " + obj.getPrice());
    }
}