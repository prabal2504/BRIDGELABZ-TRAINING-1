
class Product {
    protected int productId;
    protected String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
    public boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}
class ElectronicProduct extends Product {
    private String brand;
    public ElectronicProduct(int productId, String productName, String brand) {
        super(productId, productName);
        this.brand = brand;
    }
    @Override
    public boolean isMatch(String keyword) {
        keyword = keyword.toLowerCase();

        return productName.toLowerCase().contains(keyword) ||
                brand.toLowerCase().contains(keyword);
    }
}
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Shoes");
        Product p2 = new ElectronicProduct(102, "Smartphone", "Samsung");

        System.out.println("Search 'shoe': " + p1.isMatch("shoe"));
        System.out.println("Search 'samsung': " + p2.isMatch("samsung"));
        System.out.println("Search 'phone': " + p2.isMatch("phone"));
    }
}