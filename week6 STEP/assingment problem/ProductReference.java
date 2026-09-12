public class ProductReference {
    private String productId;
    private String name;

    public ProductReference(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public static void compareProducts(ProductReference p1, ProductReference p2, ProductReference p3) {
        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1 == p3 : " + (p1 == p3));
        System.out.println("p1 content equals p3 content : " + (p1.productId.equals(p3.productId) && p1.name.equals(p3.name)));
    }

    public static void main(String[] args) {
        ProductReference p1 = new ProductReference("P-100", "Keyboard");
        ProductReference p2 = p1;
        ProductReference p3 = new ProductReference("P-100", "Keyboard");

        compareProducts(p1, p2, p3);
    }
}