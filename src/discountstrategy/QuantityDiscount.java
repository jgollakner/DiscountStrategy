/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Joe Gollakner
 */
public class QuantityDiscount implements DiscountStrategy {
    
//    private double price;
    private double minQty = 5;
    private double pct = .2;

    @Override
    public double getDiscount(double qty, double price) {
        double discount = 0;
        
        if (qty >= minQty) {
            discount = price * qty * pct;
        }

        return discount;
    }

    public double getPct() {
        return pct;
    }

    public void setPct(double pct) {
        this.pct = pct;
    }

    public double getMinQty() {
        return minQty;
    }

    public void setMinQty(double minQty) {
        this.minQty = minQty;
    }

    
    
}
