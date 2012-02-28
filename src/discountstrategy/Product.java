package discountstrategy;

/**
 *
 * @author jlombardo
 */
public class Product {
    private String id;
    private String name;
    private double price;
 
    private DiscountStrategy discountStrategy;
    
    public Product(){
        
    }

    public Product(String id, String name, double price, DiscountStrategy discountStrategy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }
    
    public double getDiscount(double qty) {
        return discountStrategy.getDiscount(qty,price);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public static void main(String[] args) {
        DiscountStrategy ds = new QuantityDiscount();
        Product product = new Product("A100", "Pen", 10.00, ds);
        double actual = product.getDiscount(6);
        double expected = 12;
        if(expected == actual) {
            System.out.println("Test passes");
        }
    }
}
