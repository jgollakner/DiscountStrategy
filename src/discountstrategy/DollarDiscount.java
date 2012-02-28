/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Joe Gollakner
 */
public class DollarDiscount implements DiscountStrategy{
    
//    private double price;
    private double dollarAmt = 5;
//    private double discount;

    @Override
    public double getDiscount(double qty, double price) {
        return dollarAmt; 
    }

//    public void setDiscount(double discount) {
//        this.discount = discount;
//    }
    
    public double getDollarAmt() {
        return dollarAmt;
    }

    public void setDollarAmt(double dollarAmt) {
        this.dollarAmt = dollarAmt;
    }

//    public double getPrice() {
//        return price;
//    }

//    public void setPrice(double price) {
//        this.price = price;
//    }
//    
    
    public static void main(String[] args) {
        DiscountStrategy ds = new DollarDiscount();
        double expectedDiscount = 5.00;
        double actualDiscount = ds.getDiscount(2, 10.00);
        if(expectedDiscount == actualDiscount) {
            System.out.println("Test passes");
        } else {
            System.out.println("Test failed, expected = " 
                    + expectedDiscount + " and actual = " + actualDiscount);
        }
    }
}
