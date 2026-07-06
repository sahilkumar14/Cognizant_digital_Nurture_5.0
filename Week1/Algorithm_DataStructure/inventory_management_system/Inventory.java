import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

    private static HashMap<Integer, Product> inventory =
            new HashMap<>();

    // Add Product
    public static void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully!");
    }

    // Update Product
    public static void updateProduct(int productId,
                                     int quantity,
                                     double price) {

        Product product = inventory.get(productId);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product Updated Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Delete Product
    public static void deleteProduct(int productId) {

        if (inventory.remove(productId) != null) {
            System.out.println("Product Deleted Successfully!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    // Display Inventory
    public static void displayProducts() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty!");
            return;
        }

        for (Map.Entry<Integer, Product> entry :
                inventory.entrySet()) {

            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    addProduct(
                        new Product(id, name, qty, price)
                    );
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    qty = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    price = sc.nextDouble();

                    updateProduct(id, qty, price);
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    deleteProduct(id);
                    break;

                case 4:
                    displayProducts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}