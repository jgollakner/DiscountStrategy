/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Joe Gollakner
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double qty, double price) {
        return 0;
    }

    
}
