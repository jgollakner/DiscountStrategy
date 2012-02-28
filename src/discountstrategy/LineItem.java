package discountstrategy;

/**
 *
 * @author jlombardo
 */
public class LineItem {

    private double qty;
    private Product product;
    
    
    private Product[] productDb = {
        new Product("A101","Hat",19.95, new QuantityDiscount()),
        new Product("B101","Glove",25.95, new PercentDiscount()),
        new Product("C101","Belt",9.25, new DollarDiscount())  
    };

    public LineItem(String productId, double qty) {

        this.qty = qty;
        product = findProductById(productId);
    }
    
    public String getLineItemData() {
        return product.getId() + "    " + product.getName() + "    " 
                + qty + "    " + product.getPrice() + "    "
                + product.getDiscount(qty) + "    "
                + getSubTotal();
//        return getProductId() + "    " + getName();
    }
    
    public double getSubTotal() {
        return qty * product.getPrice() - product.getDiscount(qty);
    }
    
    public double getDiscountAmt() {
        return product.getDiscount(qty);
    }
    
//    private String getProductId() {
//        return product.getId();
//    }
//    private String getName() {
//        return product.getName();
//    }
    
    private Product findProductById(String id) {
        Product prod = null;
        
        for(Product p : productDb) {
            if(id.equals(p.getId())) {
                prod = p;
                break;
            }
        }
        return prod;
    }
    
//    public double getDiscount() {
//        return product.getDiscount(qty);
//    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
    
    public static void main(String[] args) {
        LineItem item = new LineItem("B101", 2);
        System.out.println(item.getLineItemData());
    }
}
