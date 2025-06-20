import java.util.Arrays;
import java.util.Comparator;

public class Ecommerce {

    
    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int id, String name, String category) {
            this.productId = id;
            this.productName = name;
            this.category = category;
        }

        @Override
        public String toString() {
            return "[" + productId + ", " + productName + ", " + category + "]";
        }
    }

    
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Fashion"),
            new Product(203, "Laptop", "Electronics"),
            new Product(150, "Phone", "Electronics"),
            new Product(305, "Watch", "Accessories")
        };

        
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        Arrays.sort(sortedProducts, Comparator.comparingInt(p -> p.productId));

        int searchId = 150;

       
        Product linearResult = linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not found"));

        Product binaryResult = binarySearch(sortedProducts, searchId);
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found"));
    }
}