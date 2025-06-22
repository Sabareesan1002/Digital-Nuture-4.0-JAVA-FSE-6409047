import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}

public class EcommerceSearch {

    // Binary Search by productName (case-insensitive)
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(name);
            if (comparison == 0) return products[mid];
            else if (comparison < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Accessories")
        };

        // Sort by productName before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        String searchTerm = "Shoes";
        Product result = binarySearch(products, searchTerm);
        if (result != null) {
            System.out.println("Product Found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
