/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Joe Gollakner
 */
public class PercentDiscount implements DiscountStrategy{
    
    private double pct = .15;
//    private double price;
//    private double discount;

    public double getPct() {
        return pct;
    }

    public void setPct(double pct) {
        this.pct = pct;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
        

    @Override
    public double getDiscount(double qty, double price) { 
        return qty * price * pct;  
    }

//    public void setDiscount(double discount) {
//        this.discount = discount;
//    }
    
    
    
}
