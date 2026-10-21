import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Product product = new Product();

            System.out.println("Enter details for product " + (i + 1));
            System.out.print("ID: ");
            product.setId(sc.nextInt());
            sc.nextLine();

            System.out.print("Name: ");
            product.setName(sc.nextLine());

            System.out.print("Price: ");
            product.setPrice(sc.nextDouble());

            System.out.print("Quantity: ");
            product.setQuantity(sc.nextInt());
            sc.nextLine();

            products.add(product);
        }

        System.out.println("--- Product Details ---");
        System.out.printf("%-8s %-20s %-12s %-10s %-12s%n",
                "ID", "Name", "Price", "Quantity", "Total");
        for (Product product : products) {
            double total = product.getPrice() * product.getQuantity();
            System.out.printf("%-8d %-20s %-12.2f %-10d %-12.2f%n",
                    product.getId(), product.getName(), product.getPrice(),
                    product.getQuantity(), total);
        }

        sc.close();
    }
}
