import java.util.Arrays;
import java.util.Comparator;

public class Ecommerce {

    // Linear Search
    public static Items linearSearch(Items[] products,
                                       int targetId) {

        for (Items product : products) {

            if (product.getProductId() == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Items binarySearch(Items[] products,
                                       int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == targetId) {
                return products[mid];
            }

            if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Items[] products = {
                new Items(104, "Laptop", "Electronics"),
                new Items(101, "Phone", "Electronics"),
                new Items(103, "Shoes", "Fashion"),
                new Items(102, "Watch", "Accessories"),
                new Items(105, "Bag", "Fashion")
        };

        int searchId = 103;

        // Linear Search
        Items result1 =
                linearSearch(products, searchId);

        System.out.println("Linear Search Result:");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");

        // Sort Array for Binary Search
        Arrays.sort(products,
                Comparator.comparingInt(
                        p -> p.getProductId()));

        // Binary Search
        Items result2 =
                binarySearch(products, searchId);

        System.out.println("\nBinary Search Result:");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}