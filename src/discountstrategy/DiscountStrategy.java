/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Joe Gollakner
 */
public interface DiscountStrategy {

   public abstract double getDiscount(double qty, double price);

}
